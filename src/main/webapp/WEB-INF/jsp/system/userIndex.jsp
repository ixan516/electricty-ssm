<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户管理</title>
    <!-- 导入jquery核心类库 -->
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-1.8.3.js"></script>
    <!-- 导入easyui类库 -->
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/js/easyui/themes/default/easyui.css">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/js/easyui/themes/icon.css">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/js/easyui/ext/portal.css">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/default.css">
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/easyui/jquery.easyui.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/easyui/ext/jquery.portal.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/easyui/ext/jquery.cookie.js"></script>
    <script src="${pageContext.request.contextPath}/js/easyui/locale/easyui-lang-zh_CN.js" type="text/javascript"></script>
    <%--文件上传--%>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.ocupload-1.1.2.js"></script>
    <script type="text/javascript">
        //工具栏
        var toolbar = [ {
            id : 'button-add',
            text : '增加',
            iconCls : 'icon-add',
            handler : doAdd
        }, {
            id : 'button-delete',
            text : '删除',
            iconCls : 'icon-cancel',
            handler : doDelete
        }, {
            id : 'button-edit',
            text : '编辑',
            iconCls : 'icon-edit',
            handler : doEdit
        }, {
            id : 'button-search',
            text : '查询',
            iconCls : 'icon-search',
            handler : doSearch
        },{
            id : 'button-import',
            text : '导入',
            iconCls : 'icon-redo'
        },{
            id : 'button-export',
            text : '导出',
            iconCls : 'icon-print',
            handler : doExport
        }];
        // 定义列
        var columns = [ [ {
            field : 'userId',
            checkbox : true
        },{
            field : 'logonName',
            title : '用户名',
            width : 80,
            align : 'center'
        },{
            field : 'userName',
            title : '姓名',
            width : 80,
            align : 'center'
        }, {
            field : 'sexId',
            title : '性别',
            width : 120,
            align : 'center'
        },{
            field : 'jctId',
            title : '所属单位',
            width : 120,
            align : 'center'
        },{
            field : 'postId',
            title : '职位',
            width : 120,
            align : 'center'
        }, {
            field : 'contactTel',
            title : '联系电话',
            width : 120,
            align : 'center'
        }, {
            field : 'address',
            title : '联系地址',
            width : 120,
            align : 'center'
        },{
            field : 'email',
            title : '电子邮箱',
            width : 120,
            align : 'center'
        },{
            align : 'center',
            field : 'onDutyDate',
            title : '入职时间',
            width : 120,
            align : 'center'
        } ] ];

        $(function(){
            // 先将body隐藏，再显示，不会出现页面刷新效果
            $("body").css({visibility:"visible"});

            // 用户信息表格
            $('#grid').datagrid( {
                idField : 'userId', //唯一标识
                iconCls : 'icon-forward',
                fit : true,
                border : false,
                rownumbers : true,
                striped : true,
                method : 'post',
                pageList: [10,15,20],
                pagination : true,
                toolbar : toolbar,
                url : "${pageContext.request.contextPath }/user/findAllUser.action",
                columns : columns,
                onDblClickRow : doDblClickRow

            });

            // 信息录入窗口
            $('#addWindow').window({
                title: '信息录入窗口',
                width: 800,
                modal: true,//模态窗口属性true模态，；false非模态
                shadow: true,
                closed: true,//设置窗口为默认关闭
                height: 400,
                resizable: false,
                onClose: function () {
                    // 清除表单数据
                    $('#addUserForm').form('clear');
                    $('.easyui-combobox').combobox({required:false});
                    $('.easyui-validatebox').validatebox({required:false});
                    $('.easyui-datebox').datebox({required:false});
                }
            });

            // 给导入按钮绑定事件
            $("#button-import").upload({
                action:"${pageContext.request.contextPath}/user/upload.action",
                name:"userFile",
                onComplete:function(data){
                    data = JSON.parse(data);
                    if(data.code == 200){
                        $.messager.alert("提示信息","文件上传成功","info");
                        $('#grid').datagrid('reload');
                    }else {
                        $.messager.alert("提示信息","文件上传失败","error");
                    }
                },
                onSelect: function() {//当用户选择了一个文件后触发事件
                    //当选择了文件后，关闭自动提交
                    this.autoSubmit=false;
                    //校验上传的文件名是否满足后缀为.xls或.xlsx
                    var regex =/^.*\.(?:xls|xlsx)$/i;
                    //this.filename()返回当前选择的文件名称 (ps：我使用这个方法没好使，自己写了一个获取文件的名的方法) $("[name = '"+this.name()+"']").val())
                    //alert(this.filename());
                    if(regex.test($("[name = '"+this.name()+"']").val())){
                        //通过校验
                        this.submit();
                    }else{
                        //未通过
                        $.messager.alert("提示信息","文件格式不正确！","error"); //错误提示框，文件格式不正确，必须以.xls或.xlsx结尾
                    }
                }
            });


        });

        function doDblClickRow(){
            alert("双击表格数据...");
        }
        function doSearch(){
            $('#searchWindow').window('open');
        }

        /**
         * 添加用户
         */
        function doAdd(){
            $('#addWindow').window('open');
        }

        /**
         * 编辑用户
         */
        function doEdit(){
            //1.获取客户选中数据
            var rows = $('#grid').datagrid('getSelections');
            if(rows.length != 1){
                //2.判断，如果客户未选中或选择了多条，提示客户
                $.messager.alert('提示信息','请您选择一条要修改的数据！','warning');
            } else {
                $.ajax({
                    type: "get",
                    dataType: "json",
                    url: "${pageContext.request.contextPath}/user/getUserById.action",
                    data: "userId="+rows[0].userId,
                    success: function (result) {
                        //3.打开修改窗口
                        $('#addWindow').window('open');
                        //4.调用form表单的load方法回显数据
                        $('#addUserForm').form('load',result);
                    },
                    error: function (result) {
                        $.messager.alert("提示信息","获取数据失败","error");
                    }
                });
            }
        }

        /**
         * 批量删除
         */
        function doDelete(){
            //1.获取客户选中的数据
            var rows = $('#grid').datagrid('getSelections');
            if(rows.length <= 0){
                //2.未选中，提示客户选择数据
                $.messager.alert('提示信息','请您选择要删除的数据！','warning');
            } else {
                //3.选中，提示客户确认是否删除
                $.messager.confirm('确认信息','您确定删除选中数据么?',function(r){
                    if(r){
                        //4.确认删除，循环获取用户id，通过请求发送到后台
                        var array = new Array();
                        for(var i=0; i<rows.length; i++){
                            array.push(rows[i].userId);
                        }
                        //将数组中的数据连接成字符串
                        var ids = array.join(',');
                        //5.通过请求发送到后台
                        $.ajax({
                            type: "get",
                            dataType: "json",
                            url: "${pageContext.request.contextPath}/user/deleteUser.action",
                            data: "ids=" + ids,
                            success: function (result) {
                                // 清除所有选择的行
                                $('#grid').datagrid('clearSelections');
                                $.messager.alert("提示信息", "删除数据成功", "info");
                                $('#grid').datagrid('reload');
                            },
                            error: function (result) {
                                $.messager.alert("提示信息", "删除数据失败", "error");
                            }
                        });
                    }
                });
            }
        }

        function doExport(){
            //发请求到后台，后台查询所有的用户数据，放到一个excel中，将该excel返回到界面保存到本地
            //ajax天生不支持文件下载
            location.href="${pageContext.request.contextPath}/user/download.action";
        }
    </script>
</head>
<body class="easyui-layout" style="visibility:hidden;">
    <div region="center" border="false">
        <table id="grid"></table>
    </div>
    <div class="easyui-window" title="对用户添加或者修改" id="addWindow" collapsible="false" minimizable="false" maximizable="false" cache="false" style="top:20px;left:200px">
        <div region="north" style="height:31px;overflow:hidden;" split="false" border="false">
            <div class="datagrid-toolbar">
                <a id="save" icon="icon-save" href="" class="easyui-linkbutton" plain="true">保存</a>
                <script type="text/javascript">
                    $(function(){
                        //给表单绑定将表单转换成json对象方法
                        $.fn.serializeJson=function(){
                            var serializeObj={};
                            var array=this.serializeArray();
                            var str=this.serialize();
                            $(array).each(function(){
                                if(serializeObj[this.name]){
                                    if($.isArray(serializeObj[this.name])){
                                        serializeObj[this.name].push(this.value);
                                    }else{
                                        serializeObj[this.name]=[serializeObj[this.name],this.value];
                                    }
                                }else{
                                    serializeObj[this.name]=this.value;
                                }
                            });
                            return serializeObj;
                        };

                        $('#save').click(function(){
                            var b = $('#addUserForm').form('validate');
                            if(b){
                                var data = $('#addUserForm').serializeJson();
                                $.ajax({
                                    type: "post",
                                    dataType: "json",
                                    contentType: "application/json;charset=utf-8",
                                    url: "${pageContext.request.contextPath}/user/addCustomer.action",
                                    data: JSON.stringify(data),
                                    success: function (result) {
                                        $('#addWindow').window("close");
                                        $('#addWindow').window("clear");
                                        // 重新载入当前页面数据
                                        $('#grid').datagrid('reload');
                                    },
                                    error: function (result) {
                                        $('#addWindow').window("close");
                                    }
                                });
                            } else {
                                return false;
                            }
                        });
                    });
                </script>
            </div>
        </div>

        <div region="center" style="overflow:auto;padding:5px;" border="false">
            <form id="addUserForm" >
                <table class="table-edit" width="80%" align="center">
                    <tr class="title">
                        <td colspan="4">用户信息</td>
                    </tr>
                    <tr>
                        <td>姓名</td>
                        <td>
                            <input type="text" name="userName" class="easyui-validatebox" required="true" />
                        </td>
                        <td>用户名</td>
                        <td>
                            <input type="text" name="logonName" class="easyui-validatebox" required="true" />
                        </td>
                    </tr>
                    <tr>
                        <td>登录密码</td>
                        <td>
                            <input type="text" name="logonPwd" class="easyui-validatebox" required="true" />
                        </td>
                        <td>性别</td>
                        <td>
                            <input type="text" name="sexId" class="easyui-combobox"
                                   data-options="required:true,valueField:'id',textField:'name',
											url:'${pageContext.request.contextPath}/dict/findDictBySex.action'" />
                        </td>
                    </tr>
                    <tr>
                        <td>所属单位</td>
                        <td>
                            <input type="text" name="jctId" class="easyui-combobox"
                                   data-options="required:true,valueField:'id',textField:'name',
											url:'${pageContext.request.contextPath}/dict/findDictByRegion.action'" />
                        </td>
                        <td>职位</td>
                        <td>
                            <input type="text" name="postId" class="easyui-combobox"
                                   data-options="required:true,valueField:'id',textField:'name',
											url:'${pageContext.request.contextPath}/dict/findDictByPosition.action'" />
                        </td>
                    </tr>
                    <tr>
                        <td>出生日期</td>
                        <td>
                            <input type="text" name="birthday" class= "easyui-datebox" required="true" />
                        </td>
                        <td>联系地址</td>
                        <td>
                            <input type="text" name="address" class="easyui-validatebox" required="true" />
                        </td>
                    </tr>
                    <tr>
                        <td>联系电话</td>
                        <td>
                            <input type="text" name="contactTel" class="easyui-validatebox" required="true" />
                        </td>
                        <td>电子邮箱</td>
                        <td>
                            <input type="text" name="email" class="easyui-validatebox" required="true" />
                        </td>
                    </tr>
                    <tr>
                        <td>入职日期</td>
                        <td>
                            <input type="text" name="onDutyDate" class= "easyui-datebox" required="true" />
                        </td>
                        <td>是否在职</td>
                        <td>
                            <input type="text" name="isDuty" class="easyui-combobox"
                                   data-options="required:true,valueField:'id',textField:'name',
											url:'${pageContext.request.contextPath}/dict/findDictByDuty.action'" />
                        </td>
                    </tr>
                    <tr>
                        <td>备注</td>
                        <td>
                            <input type="text" name="remark" class="easyui-validatebox" required="true" />
                        </td>
                        <td>
                            <input type="hidden" name="userId" />
                        </td>
                    </tr>
                </table>
            </form>
        </div>
    </div>

    <!-- 查询用户窗口-->
    <div class="easyui-window" title="查询用户窗口" closed="true" id="searchWindow" collapsible="false" minimizable="false" maximizable="false" style="width: 400px; top:40px;left:200px">
        <div style="overflow:auto;padding:5px;" border="false">
            <form id="searchForm">
                <table class="table-edit" width="80%" align="center">
                    <tr class="title">
                        <td colspan="2">查询条件</td>
                    </tr>
                    <tr>
                        <td>姓名</td>
                        <td>
                            <input type="text" name="userName" />
                        </td>
                    </tr>
                    <tr>
                        <td>性别</td>
                        <td>
                            <input type="text" name="sexId" class="easyui-combobox"
                                   data-options="valueField:'id',textField:'name',
                                                url:'${pageContext.request.contextPath}/dict/findDictBySex.action'" />
                        </td>
                    </tr>
                    <tr>
                        <td>所属单位</td>
                        <td>
                            <input type="text" name="jctId" class="easyui-combobox"
                                   data-options="valueField:'id',textField:'name',
											url:'${pageContext.request.contextPath}/dict/findDictByRegion.action'" />
                        </td>
                    </tr>
                    <tr>
                        <td>职位</td>
                        <td>
                            <input type="text" name="postId" class="easyui-combobox"
                                   data-options="valueField:'id',textField:'name',
											url:'${pageContext.request.contextPath}/dict/findDictByPosition.action'" />
                        </td>
                    </tr>
                    <tr>
                        <td colspan="2"><a id="searchBtn" href="#" class="easyui-linkbutton"
                                           data-options="iconCls:'icon-search'">查询</a>
                            <script type="text/javascript">
                                $(function(){
                                    //给表单绑定将表单转换成json对象方法
                                    $.fn.serializeJson=function(){
                                        var serializeObj={};
                                        var array=this.serializeArray();
                                        var str=this.serialize();
                                        $(array).each(function(){
                                            if(serializeObj[this.name]){
                                                if($.isArray(serializeObj[this.name])){
                                                    serializeObj[this.name].push(this.value);
                                                }else{
                                                    serializeObj[this.name]=[serializeObj[this.name],this.value];
                                                }
                                            }else{
                                                serializeObj[this.name]=this.value;
                                            }
                                        });
                                        return serializeObj;
                                    };
                                    $('#searchBtn').click(function(){
                                        //1.调用表单的转换方法，获取json数据
                                        var data = $('#searchForm').serializeJson();
                                        $.ajax({
                                            type: "post",
                                            dataType: "json",
                                            contentType: "application/json;charset=utf-8",
                                            url: "${pageContext.request.contextPath}/user/queryUserByExample.action",
                                            data: JSON.stringify(data),
                                            success: function (result) {
                                                //2.调用datagrid的load方法实现组合条件分页查询
                                                $('#grid').datagrid('loadData',result);
                                                //3.关闭查询窗口
                                                $('#searchWindow').window('close');
                                            },
                                            error: function (result) {
                                                $.messager.alert("提示信息","查询数据失败","error");
                                            }
                                        });
                                    });
                                });
                            </script>
                        </td>
                    </tr>
                </table>
            </form>
        </div>
    </div>
</body>
</html>
