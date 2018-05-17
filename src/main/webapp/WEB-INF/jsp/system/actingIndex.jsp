<%@ page language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page trimDirectiveWhitespaces="true" %>

<html>
<head>
    <title>运行监控模块编辑</title>
    <link href="${pageContext.request.contextPath }/css/Style.css" type="text/css" rel="stylesheet">
    <link href="${pageContext.request.contextPath }/css/showText.css" type="text/css" rel="stylesheet">
    <%--引入jquery-1.8.3.js--%>
    <script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery-1.8.3.js"></script>
    <script language="javascript" src="${pageContext.request.contextPath }/js/function.js"></script>
    <script language="javascript" src="${pageContext.request.contextPath }/js/limitedTextarea.js"></script>
    <script language="javascript" src="${pageContext.request.contextPath }/js/showText.js"></script>
    <script language="javascript">
        // 将表单数据序列化为json数据
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

        function checkchar() {
            if (document.Form2.stationRun.value.length > 200) {
                alert("站点运行情况字数不能超过200字");
                return;
            }
            if (document.Form2.devRun.value.length > 200) {
                alert("设备运行情况字数不能超过200字");
                return;
            }
            var data = $('#Form2').serializeJson();
            $.ajax({
                type: "post",//方法类型
                dataType: "json",//预期服务器返回的数据类型
                contentType: "application/json;charset=utf-8",
                url: "${pageContext.request.contextPath }/system/save.action",//url
                data: JSON.stringify(data),
                success: function (result) {
                    console.log("ok"+result.createDate);
                    $("#stationRunVal").text(result.stationRun);
                    $("#devRunVal").text(result.devRun);
                    $("#createDateVal").text(result.createDate);
                },
                error: function (result) {
                    console.log("error"+result);
                }
            });
        }

        function addEnter(element) {
            document.getElementById(element).value = document.getElementById(element).value + "<br>";
        }

        function checkTextAreaLen() {
            var stationRun = new Bs_LimitedTextarea('stationRun', 200);
            stationRun.infolineCssStyle = "font-family:arial; font-size:11px; color:gray;";
            stationRun.draw();
            var devRun = new Bs_LimitedTextarea('devRun', 200);
            devRun.infolineCssStyle = "font-family:arial; font-size:11px; color:gray;";
            devRun.draw();
        }

        window.onload = function () {
            checkTextAreaLen();
        }
        // 页面加载成功
    </script>


</head>

<body>
<form name="Form1" id="Form1" method="post">
    <table cellSpacing="1" cellPadding="0" width="90%" align="center" bgColor="#f5fafe" border="0">
        <tbody>
        <TR height=10>
            <td></td>
        </TR>
        <tr>
            <td>
                <table style="WIDTH: 105px; HEIGHT: 20px" border="0">
                    <tr>
                        <td align="center" background="${pageContext.request.contextPath }/images/cotNavGround.gif"><img
                                src="${pageContext.request.contextPath }/images/yin.gif" width="15"></td>
                        <td class="DropShadow" background="${pageContext.request.contextPath }/images/cotNavGround.gif">
                            运行监控列表
                        </td>
                    </tr>
                </table>
            </td>
        </tr>
        <tr>
            <td class="ta_01" align="center" bgColor="#f5fafe" colspan=3>
                <table cellspacing="0" cellpadding="1" rules="all" bordercolor="gray" border="1" id="DataGrid1"
                       style="BORDER-RIGHT:gray 1px solid; BORDER-TOP:gray 1px solid; BORDER-LEFT:gray 1px solid; WIDTH:100%; WORD-BREAK:break-all; BORDER-BOTTOM:gray 1px solid; BORDER-COLLAPSE:collapse; BACKGROUND-COLOR:#f5fafe; WORD-WRAP:break-word">
                    <tr style="FONT-WEIGHT:bold;FONT-SIZE:12pt;HEIGHT:25px;BACKGROUND-COLOR:#afd1f3">

                        <td align="center" width="40%" height=22
                            background="${pageContext.request.contextPath }/images/tablehead.jpg">站点运行情况
                        </td>
                        <td align="center" width="40%" height=22
                            background="${pageContext.request.contextPath }/images/tablehead.jpg">设备运行情况
                        </td>
                        <td align="center" width="20%" height=22
                            background="${pageContext.request.contextPath }/images/tablehead.jpg">创建日期
                        </td>
                    </tr>
                    <div id="showInfomation" style="visibility: hidden"></div>
                    <tr onmouseover="this.style.backgroundColor = 'white'"
                        onmouseout="this.style.backgroundColor = '#F5FAFE';">
                        <td style="HEIGHT:22px" align="center" width="40%">
                            <div class="scrollStyle" id="stationRunVal" align="left" onmouseover="showInfoWithPanel(this)"
                                 onmouseout="hiddenInfoPanel(this)" style="table-layout:fixed;">
                                <c:if test="${not empty commonMsg}">
                                    ${commonMsg.stationRun}
                                </c:if>
                            </div>
                        </td>
                        <td style="HEIGHT:22px" align="center" width="40%">
                            <div class="scrollStyle" id="devRunVal" align="left" onmouseover="showInfoWithPanel(this)"
                                 onmouseout="hiddenInfoPanel(this)" style="table-layout:fixed;">
                                <c:if test="${not empty commonMsg}">
                                    ${commonMsg.devRun}
                                </c:if>
                            </div>
                        </td>
                        <td id="createDateVal" style="HEIGHT:22px" align="center" width="20%">
                            <c:if test="${not empty commonMsg}">
                                ${commonMsg.createDate}
                            </c:if>
                        </td>
                    </tr>

                </table>

            </td>
        </tr>

        </tbody>
    </table>
</form>
<form name="Form2" id="Form2" method="post">
    <table cellspacing="1" cellpadding="5" width="90%" align="center" bgcolor="#f5fafe" style="border:1px solid #8ba7e3"
           border="0">

        <tr>
            <td class="ta_01" colspan=2 align="center"
                background="${pageContext.request.contextPath }/images/b-info.gif">
                <font face="宋体" size="2"><strong>运行监控编辑</strong></font>
            </td>
        </tr>
        <TR height=10>
            <td></td>
            <td></td>
        </TR>

        <tr>
            <td class="ta_01" align="center" bgcolor="#f5fafe" width="15%">站点运行情况：</td>
            <td class="ta_01" bgcolor="#ffffff" style="word-break: break-all">

                <textarea name="stationRun" id="stationRun"
                          style="width: 500px; height: 160px; padding: 1;FONT-FAMILY: 宋体; FONT-SIZE: 9pt"
                          onkeydown="if(event.keyCode==13)addEnter('stationRun');"><c:if test="${not empty commonMsg}">${commonMsg.stationRun}</c:if>
                </textarea>
            </td>

        </tr>
        <tr>
            <td class="ta_01" align="center" bgcolor="#f5fafe" width="15%">设备运行情况：</td>
            <td class="ta_01" bgcolor="#ffffff" style="word-break: break-all">
                <textarea name="devRun" id="devRun"
                          style="width: 500px; height: 160px; padding: 1;FONT-FAMILY: 宋体; FONT-SIZE: 9pt"
                          onkeydown="if(event.keyCode==13)addEnter('devRun');"><c:if test="${not empty commonMsg}">${commonMsg.devRun}</c:if>
                </textarea>
            </td>

        </tr>
        <tr>
            <td class="ta_01" style="width: 100%" align="center" bgcolor="#f5fafe" colspan="2">
                <input type="button" name="BT_Submit" value="保存" onclick="checkchar()" id="BT_Submit"
                       style="font-size:12px; color:black; height=20;width=50">&nbsp;&nbsp;
                <input style="font-size:12px; color:black; height=20;width=80" id="BT_Export" type="button" value="导出设置"
                       name="BT_Export"
                       onclick="openWindow('${pageContext.request.contextPath }/system/exportExcel.jsp?belongTo=5-3','700','400')">&nbsp;&nbsp;
            </td>
        </tr>
    </table>
</form>
</body>
</html>