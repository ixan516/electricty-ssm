<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>运行监控模块编辑</title>
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

</head>
<body>
<div style="padding:10px;">
    <div style="margin-bottom:8px;">请在下方填写运行监控信息:
        <br />
    </div>
    <form id="bug_form" method="post" enctype="application/x-www-form-urlencoded">
        <textarea name="bug_c" id="bug_c" cols="50" rows="7" style=" border:solid 3px #E2E2E2;line-height:16px; padding:5px;"></textarea>
        <br />
        <div style="margin-top:8px;"><a href="javascript:void(0);" onclick="$('#bug_form').submit();" id="bug_form_but" class="easyui-linkbutton">提交</a></div>
    </form>
</div>
<script>
    //功能相对独立，应该单独放置
    $('#bug_form').form({
        url:"post.html",
        onSubmit: function(){
            if($('#bug_c').val()==""){
                $.messager.alert('Warning',"内容太少");
                return false;
            }
        },
        success:function(data){
            $.messager.alert('Warning',"提交成功");
            $('#bug_c').val("");
        }
    });
</script>
</body>
</html>
