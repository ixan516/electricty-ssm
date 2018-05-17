<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <title>电力资源管理系统-首页</title>
    <!-- 导入jquery核心类库 -->
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-1.8.3.js"></script>
    <!-- 导入easyui类库 -->
    <link id="easyuiTheme" rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/js/easyui/themes/default/easyui.css">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/js/easyui/themes/icon.css">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/css/default.css">
    <script type="text/javascript" src="${pageContext.request.contextPath }/js/easyui/jquery.easyui.min.js"></script>
    <!-- 导入ztree类库 -->
    <link rel="stylesheet" href="${pageContext.request.contextPath }/js/ztree/zTreeStyle.css" type="text/css" />
    <script src="${pageContext.request.contextPath }/js/ztree/jquery.ztree.all-3.5.js" type="text/javascript"></script>
    <script src="${pageContext.request.contextPath }/js/easyui/locale/easyui-lang-zh_CN.js" type="text/javascript"></script>
    <script type="text/javascript">
        $(function(){
            // 页面加载后 右下角 弹出窗口
            window.setTimeout(function(){
                $.messager.show({
                    title:"消息提示",
                    msg:'欢迎登录,超级管理员！ <a href="javascript:void" onclick="top.showAbout();">联系管理员</a>',
                    timeout:5000
                });
            },3000);
        });
        /*******顶部特效 *******/
        /**
         * 更换EasyUI主题的方法
         * @param themeName
         * 主题名称
         */
        changeTheme = function(themeName) {
            var $easyuiTheme = $('#easyuiTheme');
            var url = $easyuiTheme.attr('href');
            var href = url.substring(0, url.indexOf('themes')) + 'themes/'
                + themeName + '/easyui.css';
            $easyuiTheme.attr('href', href);
            var $iframe = $('iframe');
            if ($iframe.length > 0) {
                for ( var i = 0; i < $iframe.length; i++) {
                    var ifr = $iframe[i];
                    $(ifr).contents().find('#easyuiTheme').attr('href', href);
                }
            }
        };
        // 退出登录
        function logoutFun() {
            $.messager
                .confirm('系统提示','您确定要退出本次登录吗?',function(isConfirm) {
                    if (isConfirm) {
                        location.href = '${pageContext.request.contextPath}/system/logout.action';
                    }
                });
        }
        // 修改密码
        function editPassword() {
            $('#editPwdWindow').window('open');
        }
        // 版权信息
        function showAbout(){
            $.messager.alert("电力资源管理系统v1.0","设计: 安阳师范学院-软件学院<br/> 管理员邮箱: ixan516@163.com <br/> 管理员电话: 178-3916-6921 <br/>");
        }
    </script>
</head>
<body class="easyui-layout">
<div data-options="region:'north',border:false" style="height:70px;padding:10px;">
    <div>
        <img src="${pageContext.request.contextPath }/images/logo.png" width="138px" height="42px" border="0">
    </div>
    <div id="sessionInfoDiv" style="position: absolute;right: 5px;top:10px;">
        [<strong><c:if test="${not empty user}">${user.logonName}</c:if></strong>]，欢迎你！您使用[<strong><c:if test="${not empty ip}" >${ip}</c:if></strong>]IP登录！
    </div>
    <div style="position: absolute; right: 5px; bottom: 10px; ">
        <a href="javascript:void(0);" class="easyui-menubutton" data-options="menu:'#layout_north_pfMenu',iconCls:'icon-ok'">更换皮肤</a>
        <a href="javascript:void(0);" class="easyui-menubutton" data-options="menu:'#layout_north_kzmbMenu',iconCls:'icon-help'">控制面板</a>
    </div>
    <div id="layout_north_pfMenu" style="width: 120px; display: none;">
        <div onclick="changeTheme('default');">default</div>
        <div onclick="changeTheme('gray');">gray</div>
        <div onclick="changeTheme('black');">black</div>
        <div onclick="changeTheme('bootstrap');">bootstrap</div>
        <div onclick="changeTheme('metro');">metro</div>
    </div>
    <div id="layout_north_kzmbMenu" style="width: 100px; display: none;">
        <div onclick="editPassword();">修改密码</div>
        <div onclick="showAbout();">联系管理员</div>
        <div class="menu-sep"></div>
        <div onclick="logoutFun();">退出系统</div>
    </div>
</div>
<div title="菜单导航" data-options="region:'west'"  style="width:200px">
    <!-- 折叠面板
            fit:填充满父容器
        -->
    <div class="easyui-accordion" fit="true">
        <div title="系统管理">
            <!-- 基于ajax请求加载树节点数据-->
            <!-- 1.提供一个容器：ul标签 -->
            <ul id="ztree3" class="ztree"></ul>
            <script type="text/javascript">
                //删除Tabs函数
                function closeTab(menu, type){
                    var allTabs = $("#tabs").tabs('tabs');
                    var allTabtitle = [];
                    $.each(allTabs,function(i,n){
                        var opt=$(n).panel('options');
                        if(opt.closable)
                            allTabtitle.push(opt.title);
                    });

                    switch (type) {
                        case 'Close' :
                            var curTabTitle = $(menu).data("tabTitle");
                            $("#tabs").tabs("close", curTabTitle);
                            return false;
                            break;
                        case 'CloseOthers' :
                            var curTabTitle = $(menu).data("tabTitle");
                            for (var i = 0; i < allTabtitle.length; i++) {
                                if (allTabtitle[i] != curTabTitle) {
                                    $('#tabs').tabs('close', allTabtitle[i]);
                                }
                            }
                            break;
                        case "CloseAll" :
                            for (var i = 0; i < allTabtitle.length; i++) {
                                $('#tabs').tabs('close', allTabtitle[i]);
                            }
                            break;
                    }

                }
                $(function(){
                    //2.定义核心变量setting
                    var setting = {
                        data:{
                            simpleData:{
                                enable:true//开启简单json数据功能
                            }
                        },
                        callback:{
                            onClick:function(event, treeId, treeNode){
                                //1.获取page属性,typeof为string
                                var page = treeNode.page;
                                if(undefined != page && null != page && "" != page){
                                    //2.表示是子节点，可以打开选项卡
                                    //3.判断选项卡是否存在
                                    var b = $('#tabs').tabs('exists',treeNode.name);
                                    if(b){
                                        //4.存在，选中
                                        $('#tabs').tabs('select',treeNode.name);
                                    } else {
                                        //5.不存在，添加新的
                                        //动态添加选项卡
                                        $('#tabs').tabs('add',{
                                            title:treeNode.name,
                                            content:'<iframe src="${pageContext.request.contextPath}/'+page+'" style="height:100%;width:100%" frameborder="0"></iframe>',
                                            closable:true
                                        });
                                    }
                                }
                            }
                        }
                    };//当使用标准json构建ztree，setting可以是{}，此时setting使用的是api中的默认值
                    //3.发送ajax请求加载树节点数据
                    var url = "${pageContext.request.contextPath}/menu/getMenuTree.action";
                    $.post(url,{},function(data){
                        //4.初始化树
                        $.fn.zTree.init($("#ztree3"), setting, data);
                    },'json');
                    //4.加载右键菜单
                    //监听右键事件，创建右键菜单
                    $('#tabs').tabs({
                        onContextMenu:function(e, title,index){
                            e.preventDefault();
                            if(index>0){
                                $('#mm').menu('show', {
                                    left: e.pageX,
                                    top: e.pageY
                                }).data("tabTitle", title);
                            }
                        }
                    });
                    //右键菜单click
                    $("#mm").menu({
                        onClick : function (item) {
                            console.log(item.name);
                            closeTab(this, item.name);
                        }
                    });
                });
            </script>
        </div>
    </div>
</div>
<div data-options="region:'center'">
    <!-- 选项卡面板
        fit:填充满父容器
    -->
    <div id="tabs" fit="true" class="easyui-tabs" border="false">
        <div title="消息中心" id="subWarp" style="width:100%;height:100%;overflow:hidden">
            <iframe src="${pageContext.request.contextPath}/system/home.action" style="width:100%;height:100%;border:0;"></iframe>
        </div>
    </div>
</div>
<%--<div data-options="region:'east'"  style="width:100px">东部区域</div>--%>
<div data-options="region:'south',border:false" style="height:50px;padding:10px;">
    <table style="width: 100%;">
        <tbody>
        <tr>
            <td style="width: 400px;">
                <div style="color: #999; font-size: 8pt;">
                    电力资源管理系统 | Powered by <a href="http://www.itcast.cn/">安阳师范学院-软件学院</a>
                </div>
            </td>
            <td style="width: 400px;" class="co1"><span id="online" style="background: url(${pageContext.request.contextPath }/images/online.png) no-repeat left;padding-left:18px;margin-left:3px;font-size:8pt;color:#005590;">在线人数:1</span>
            </td>
        </tr>
        </tbody>
    </table>
</div>
<!--修改密码窗口-->
<div id="editPwdWindow" class="easyui-window" title="修改密码" collapsible="false" minimizable="false" modal="true" closed="true" resizable="false" maximizable="false" icon="icon-save" style="width: 300px; height: 160px; padding: 5px;
    background: #fafafa">
    <div class="easyui-layout" fit="true">
        <div region="center" border="false" style="padding: 10px; background: #fff; border: 1px solid #ccc;">
            <table cellpadding=3>
                <tr>
                    <td>新密码：</td>
                    <td>
                        <input id="txtNewPass" type="Password" class="txt01" />
                    </td>
                </tr>
                <tr>
                    <td>确认密码：</td>
                    <td>
                        <input id="txtRePass" type="Password" class="txt01" />
                    </td>
                </tr>
            </table>
        </div>
        <div region="south" border="false" style="text-align: right; height: 30px; line-height: 30px;">
            <a id="btnEp" class="easyui-linkbutton" icon="icon-ok" href="javascript:void(0)">确定</a>
            <a id="btnCancel" class="easyui-linkbutton" icon="icon-cancel" href="javascript:void(0)">取消</a>
        </div>
    </div>
</div>

<div id="mm" class="easyui-menu" style="width:120px;">
    <div data-options="name:'Close'">关闭当前窗口</div>
    <div data-options="name:'CloseOthers'">关闭其它窗口</div>
    <div class="menu-sep"></div>
    <div data-options="name:'CloseAll'">关闭全部窗口</div>
</div>
</body>
</html>