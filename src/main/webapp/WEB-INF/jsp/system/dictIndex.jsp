<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>数据字典</title>
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
            text : '编辑',
            iconCls : 'icon-edit',
            handler : doEdit
        }, {
            id : 'button-delete',
            text : '删除',
            iconCls : 'icon-remove',
            handler : doDelete
        }, {
            id: 'button-edit',
            text: '取消',
            iconCls: 'icon-cancel',
            handler: doCancel
        }, {
            id : 'button-restore',
            text : '保存',
            iconCls : 'icon-save',
            handler : doSave
        }];

        var columns = [[
            {field: 'item',checkbox:true},
            {field: 'id', title: '当前结点ID', width: 80, align: 'center'},
            {field: 'dictName', title: '结点名称', width: 160, align: 'left'},
            {field: '_parentId', title: '父节点ID', width: 80, align: 'center'}
        ]];
        $(function(){
            // 先将body隐藏，再显示，不会出现页面刷新效果
            $("body").css({visibility:"visible"});

            $('#tg').treegrid({
                iconCls:'icon-ok',               //标题的图标
                title:'数据字典',                 //标题
                method: 'get',                   //请求远程数据方法的类型
                url:'${pageContext.request.contextPath }/dict/getDicts.action',       //获取数据的地址
                fit:true,                        //填充父窗体
                toolbar : toolbar,
                rownumbers: true,                //设置为true，则显示带有行号的列
                idField:'id',                    //指示那个字段是标识字段
                treeField:'dictName',                //定义树节点的字段
                pageList: [10,15,20],
                pagination : true,
                animate:true,                    //是否开启动画
                collapsible:true,                //是否可以折叠
                showFooter:true,                 //定义是否显示行的底部
                columns:columns,
            });
        });


        function doDelete(){
            alert("doDelete...");
        }

        var editIndex ;//保存当前正在编辑的行号
        /**
         * 双击编辑表格
         * @param rowIndex
         * @param rowData
         */
        function doEdit(){
            var row = $("#tg").treegrid("getSelected");
            beginEdit;
        }

        /**
         * 插入一行
         */
        function doAdd(){
            if(editIndex != undefined){
                $("#grid").datagrid('endEdit',editIndex);
            }
            if(editIndex==undefined){
                //alert("快速添加电子单...");
                $("#grid").datagrid('insertRow',{
                    index : 0,
                    row : {}
                });
                $("#grid").datagrid('beginEdit',0);
                editIndex = 0;
            }
        }

        /**
         * 保存
         */
        function doSave(){
            $("#grid").datagrid('endEdit',editIndex );
        }

        /**
         * 取消编辑
         */
        function doCancel(){
            if(editIndex!=undefined){
                $("#grid").datagrid('cancelEdit',editIndex);
                if($('#grid').datagrid('getRows')[editIndex].id == undefined){
                    $("#grid").datagrid('deleteRow',editIndex);
                }
                editIndex = undefined;
            }
        }
    </script>
</head>
<body class="easyui-layout" style="visibility:hidden;">
<div region="center" border="false">
    <table id="tg"></table>
</div>
</body>
</html>
