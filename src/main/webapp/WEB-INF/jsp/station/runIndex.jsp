<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>运行情况</title>
    <!-- 导入jquery核心类库 -->
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-1.8.3.js"></script>
    <!-- 导入easyui类库 -->
    <link rel="stylesheet" type="text/css"
          href="${pageContext.request.contextPath}/js/easyui/themes/default/easyui.css">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/js/easyui/themes/icon.css">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/js/easyui/ext/portal.css">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/default.css">
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/easyui/jquery.easyui.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/easyui/ext/jquery.portal.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/easyui/ext/jquery.cookie.js"></script>
    <script src="${pageContext.request.contextPath}/js/easyui/locale/easyui-lang-zh_CN.js"
            type="text/javascript"></script>
    <script type="text/javascript">
        //工具栏
        var toolbar = [{
            id: 'button-add',
            text: '增加',
            iconCls: 'icon-add',
            handler: doAdd
        }, {
            id: 'button-delete',
            text: '删除',
            iconCls: 'icon-cancel',
            handler: doDelete
        }, {
            id: 'button-edit',
            text: '编辑',
            iconCls: 'icon-edit',
            handler: doEdit
        }, {
            id: 'button-search',
            text: '查询',
            iconCls: 'icon-search',
            handler: doSearch
        }, {
            id: 'button-import',
            text: '导入',
            iconCls: 'icon-redo',
            handler: doImport
        }, {
            id: 'button-export',
            text: '导出',
            iconCls: 'icon-print',
            handler: doExport
        }];
        // 定义列
        var columns = [[{
            field: 'id',
            checkbox: true
        }, {
            field: 'jctId',
            title: '所属单位',
            width: 120,
            align: 'center'
        }, {
            field: 'stationName',
            title: '站点名称',
            width: 120,
            align: 'center'
        }, {
            field: 'bugType',
            title: '故障类型',
            width: 120,
            align: 'center'
        }, {
            field: 'occurDate',
            title: '故障发生时间',
            width: 120,
            align: 'center'
        }, {
            field: 'bugReason',
            title: '故障原因',
            width: 120,
            align: 'center'
        }, {
            field: 'comment',
            title: '恢复情况',
            width: 120,
            align: 'center'
        }]];

        $(function () {
            // 先将body隐藏，再显示，不会出现页面刷新效果
            $("body").css({visibility: "visible"});

            // 用户信息表格
            $('#grid').datagrid({
                idField: 'id', //唯一标识
                iconCls: 'icon-forward',
                fit: true,
                border: false,
                rownumbers: true,
                striped: true,
                method: 'get',
                pageList: [10, 15, 20],
                pagination: true,
                toolbar: toolbar,
                url: "${pageContext.request.contextPath }/station/getAllRunInfo.action",
                columns: columns,
                onDblClickRow: doDblClickRow
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


        });

        function doDblClickRow() {
            alert("双击表格数据...");
        }

        function doSearch() {
            $('#searchWindow').window('open');
        }

        function doAdd() {
            $('#addWindow').window('open');
        }

        function doEdit() {
            //1.获取客户选中数据
            var rows = $('#grid').datagrid('getSelections');
            if (rows.length != 1) {
                //2.判断，如果客户未选中或选择了多条，提示客户
                $.messager.alert('提示信息', '请您选择一条要修改的数据！', 'warning');
            } else {
                $.ajax({
                    type: "get",
                    dataType: "json",
                    url: "${pageContext.request.contextPath}/station/getStationById.action",
                    data: "id=" + rows[0].id,
                    success: function (result) {
                        //3.打开修改窗口
                        $('#addWindow').window('open');
                        //4.调用form表单的load方法回显数据
                        $('#addUserForm').form('load', result);
                    },
                    error: function (result) {
                        $.messager.alert("提示信息", "获取数据失败", "error");
                    }
                });
            }
        }

        function doDelete() {
            //1.获取客户选中的数据
            var rows = $('#grid').datagrid('getSelections');
            if (rows.length <= 0) {
                //2.未选中，提示客户选择数据
                $.messager.alert('提示信息', '请您选择要删除的数据！', 'warning');
            } else {
                //3.选中，提示客户确认是否删除
                $.messager.confirm('确认信息', '您确定删除选中数据么?', function (r) {
                    if (r) {
                        //4.确认删除，循环获取快递员id，通过请求发送到后台
                        var array = new Array();
                        for (var i = 0; i < rows.length; i++) {
                            array.push(rows[i].id);
                        }
                        //将数组中的数据连接成字符串
                        var ids = array.join(',');
                        //5.通过请求发送到后台
                        $.ajax({
                            type: "get",
                            dataType: "json",
                            url: "${pageContext.request.contextPath}/station/deleteRunInfo.action",
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

        function doImport() {
            alert("doImport...");
        }

        function doExport() {
            alert("doExport...");
        }
    </script>
</head>
<body class="easyui-layout" style="visibility:hidden;">
<div region="center" border="false">
    <table id="grid"></table>
    <div class="easyui-window" title="对建筑添加或者修改" id="addWindow" collapsible="false" minimizable="false"
         maximizable="false"
         cache="false" style="top:20px;left:200px">
        <div region="north" style="height:31px;overflow:hidden;" split="false" border="false">
            <div class="datagrid-toolbar">
                <a id="save" icon="icon-save" href="" class="easyui-linkbutton" plain="true">保存</a>
                <script type="text/javascript">
                    $(function () {
                        //给表单绑定将表单转换成json对象方法
                        $.fn.serializeJson = function () {
                            var serializeObj = {};
                            var array = this.serializeArray();
                            var str = this.serialize();
                            $(array).each(function () {
                                if (serializeObj[this.name]) {
                                    if ($.isArray(serializeObj[this.name])) {
                                        serializeObj[this.name].push(this.value);
                                    } else {
                                        serializeObj[this.name] = [serializeObj[this.name], this.value];
                                    }
                                } else {
                                    serializeObj[this.name] = this.value;
                                }
                            });
                            return serializeObj;
                        };

                        $('#save').click(function () {
                            var b = $('#addUserForm').form('validate');
                            if (b) {
                                var data = $('#addUserForm').serializeJson();
                                $.ajax({
                                    type: "post",
                                    dataType: "json",
                                    contentType: "application/json;charset=utf-8",
                                    url: "${pageContext.request.contextPath}/station/addRunInfo.action",
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
            <form id="addUserForm">
                <table class="table-edit" width="80%" align="center">
                    <tr class="title">
                        <td colspan="4">运行情况</td>
                    </tr>
                    <tr>
                        <td>站点名称</td>
                        <td>
                            <input type="text" name="stationId" class="easyui-combobox"
                                   data-options="required:true,valueField:'id',textField:'name',
											url:'${pageContext.request.contextPath}/station/getStationNames.action'"/>
                        </td>
                        <td>故障类型</td>
                        <td>
                            <input type="text" name="bugType" class="easyui-combobox"
                                   data-options="required:true,valueField:'id',textField:'name',
											url:'${pageContext.request.contextPath}/dict/findDictByBugType.action'"/>
                        </td>
                    </tr>
                    <tr>
                        <td>发生时间</td>
                        <td>
                            <input type="text" name="occurDate" class="easyui-datebox" required="true"/>
                        </td>
                        <td>生产厂家</td>
                        <td>
                            <input type="text" name="produceHome" class="easyui-validatebox" required="true"/>
                        </td>
                    </tr>
                    <tr>
                        <td>故障描述</td>
                        <td>
                            <input type="text" name="bugDesc" class="easyui-validatebox" required="true"/>
                        </td>
                        <td>故障原因</td>
                        <td>
                            <input type="text" name="bugReason" class="easyui-validatebox" required="true"/>
                        </td>
                    </tr>
                    <tr>
                        <td>处理方法</td>
                        <td>
                            <input type="text" name="resolveMethod" class="easyui-validatebox" required="true"/>
                        </td>
                        <td>处理时间</td>
                        <td>
                            <input type="text" name="resolveDate" class="easyui-datebox" required="true"/>
                        </td>
                    </tr>
                    <tr>
                        <td>上报月份</td>
                        <td>
                            <input type="text" name="sbMonth" class="easyui-validatebox" required="true"/>
                        </td>
                        <td>恢复情况</td>
                        <td>
                            <input type="text" name="comment" class="easyui-validatebox" required="true"/>
                        </td>
                        <input type="hidden" name="id"/>
                    </tr>
                </table>
            </form>
        </div>
    </div>

    <!-- 查询运行情况窗口-->
    <div class="easyui-window" title="查询运行情况窗口" closed="true" id="searchWindow" collapsible="false" minimizable="false"
         maximizable="false" style="width: 400px; top:40px;left:200px">
        <div style="overflow:auto;padding:5px;" border="false">
            <form id="searchForm">
                <table class="table-edit" width="80%" align="center">
                    <tr class="title">
                        <td colspan="2">查询条件</td>
                    </tr>
                    <tr>
                        <td>所属单位</td>
                        <td>
                            <input type="text" name="jctId" class="easyui-combobox"
                                   data-options="valueField:'id',textField:'name',
											url:'${pageContext.request.contextPath}/dict/findDictByRegion.action'"/>
                        </td>
                    </tr>
                    <tr>
                        <td>站点名称</td>
                        <td>
                            <input type="text" name="stationId" class="easyui-combobox"
                                   data-options="valueField:'id',textField:'name',
											url:'${pageContext.request.contextPath}/station/getStationNames.action'"/>
                        </td>
                    </tr>
                    <tr>
                        <td>故障类型</td>
                        <td>
                            <input type="text" name="bugType" class="easyui-combobox"
                                   data-options="valueField:'id',textField:'name',
											url:'${pageContext.request.contextPath}/dict/findDictByBugType.action'"/>
                        </td>
                    </tr>
                    <tr>
                        <td colspan="2"><a id="searchBtn" href="#" class="easyui-linkbutton"
                                           data-options="iconCls:'icon-search'">查询</a>
                            <script type="text/javascript">
                                $(function () {
                                    //给表单绑定将表单转换成json对象方法
                                    $.fn.serializeJson = function () {
                                        var serializeObj = {};
                                        var array = this.serializeArray();
                                        var str = this.serialize();
                                        $(array).each(function () {
                                            if (serializeObj[this.name]) {
                                                if ($.isArray(serializeObj[this.name])) {
                                                    serializeObj[this.name].push(this.value);
                                                } else {
                                                    serializeObj[this.name] = [serializeObj[this.name], this.value];
                                                }
                                            } else {
                                                serializeObj[this.name] = this.value;
                                            }
                                        });
                                        return serializeObj;
                                    };
                                    $('#searchBtn').click(function () {
                                        //1.调用表单的转换方法，获取json数据
                                        var data = $('#searchForm').serializeJson();
                                        $.ajax({
                                            type: "post",
                                            dataType: "json",
                                            contentType: "application/json;charset=utf-8",
                                            url: "${pageContext.request.contextPath}/station/queryRunInfoByExample.action",
                                            data: JSON.stringify(data),
                                            success: function (result) {
                                                //2.调用datagrid的load方法实现组合条件分页查询
                                                $('#grid').datagrid('loadData', result);
                                                //3.关闭查询窗口
                                                $('#searchWindow').window('close');
                                            },
                                            error: function (result) {
                                                $.messager.alert("提示信息", "查询数据失败", "error");
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
</div>
</body>
</html>
