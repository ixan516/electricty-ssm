<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>设备购置计划</title>
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
            iconCls : 'icon-redo',
            handler : doImport
        },{
            id : 'button-export',
            text : '导出',
            iconCls : 'icon-print',
            handler : doExport
        }];
        // 定义列
        var columns = [ [ {
            field : 'id',
            checkbox : true
        },{
            field : 'devName',
            title : '设备名称',
            width : 80,
            align : 'center'
        },{
            field : 'quality',
            title : '数量',
            width : 120,
            align : 'center'
        }, {
            field : 'devExpense',
            title : '金额',
            width : 80,
            align : 'center'
        },{
            field : 'specType',
            title : '规格型号',
            width : 80,
            align : 'center'
        },{
            field : 'useness',
            title : '用途',
            width : 120,
            align : 'center'
        },{
            field : 'useUnit',
            title : '使用单位',
            width : 80,
            align : 'center'
        }, {
            field : 'configure',
            title : '是否购置',
            width : 120,
            align : 'center'
        } ] ];

        $(function(){
            // 先将body隐藏，再显示，不会出现页面刷新效果
            $("body").css({visibility:"visible"});

            // 用户信息表格
            $('#grid').datagrid( {
                idField : 'id', //唯一标识
                iconCls : 'icon-forward',
                fit : true,
                border : false,
                rownumbers : true,
                striped : true,
                method : 'get',
                pageList: [10,15,20],
                pagination : true,
                toolbar : toolbar,
                url : "${pageContext.request.contextPath }/equapment/findAllDevPlan.action",
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
                resizable:false,
                onClose:function () {
                    // 清除表单数据
                    $('#addUserForm').form('clear');
                    $('.easyui-combobox').combobox({required:false});
                    $('.easyui-validatebox').validatebox({required:false});
                    $('.easyui-datebox').datebox({required:false});
                }
            });


        });

        function doDblClickRow(){
            alert("双击表格数据...");
        }
        function doSearch(){
            $('#searchWindow').window('open');
        }

        function doAdd(){
            $('#addWindow').window('open');
        }

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
                    url: "${pageContext.request.contextPath}/equapment/getDevicePlanById.action",
                    data: "id="+rows[0].id,
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
                        //4.确认删除，循环获取快递员id，通过请求发送到后台
                        var array = new Array();
                        for(var i=0; i<rows.length; i++){
                            array.push(rows[i].id);
                        }
                        //将数组中的数据连接成字符串
                        var ids = array.join(',');
                        //5.通过请求发送到后台
                        $.ajax({
                            type: "get",
                            dataType: "json",
                            url: "${pageContext.request.contextPath}/equapment/deleteDevicePlan.action",
                            data: "ids="+ids,
                            success: function (result) {
                                // 清除所有选择的行
                                $('#grid').datagrid('clearSelections');
                                $.messager.alert("提示信息","删除数据成功","info");
                                $('#grid').datagrid('reload');
                            },
                            error: function (result) {
                                $.messager.alert("提示信息","删除数据失败","error");
                            }
                        });
                    }
                });
            }
        }

        function doImport(){
            alert("doImport...");
        }
        function doExport(){
            alert("doExport...");
        }
    </script>
</head>
<body class="easyui-layout" style="visibility:hidden;">
<div region="center" border="false">
    <table id="grid"></table>
</div>

</body>
</html>
