package cn.ixan.elec.controller;

import cn.ixan.elec.domain.ElecUser;
import cn.ixan.elec.enums.CodeEnums;
import cn.ixan.elec.service.ElecUserService;
import cn.ixan.elec.utils.DateUtils;
import cn.ixan.elec.utils.FileUtils;
import cn.ixan.elec.utils.POIUtils;
import cn.ixan.elec.utils.UUIDUtils;
import cn.ixan.elec.vo.ResultBean;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.ServletContext;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 全局Controller
 * 负责跳转页面
 */
@Controller
public class GlobalController {
    private static Logger logger = LoggerFactory.getLogger(SystemController.class);

    @Autowired
    private ElecUserService elecUserService;

    @RequestMapping("/user/download")
    public void download(HttpServletRequest request, HttpServletResponse response) throws IOException {
        //1.查询所有的用户数据
        List<ElecUser> list = elecUserService.findAll();
        //2.创建空excel，创建sheet，创建标题
        HSSFWorkbook wb = new HSSFWorkbook();
        HSSFSheet sheet = wb.createSheet();
        HSSFRow row = sheet.createRow(0);//创建标题行
        row.createCell(0).setCellValue("所属单位");
        row.createCell(1).setCellValue("姓名");
        row.createCell(2).setCellValue("用户名");
        row.createCell(3).setCellValue("密码");
        row.createCell(4).setCellValue("性别");
        row.createCell(5).setCellValue("出生日期");
        row.createCell(6).setCellValue("联系地址");
        row.createCell(7).setCellValue("联系电话");
        row.createCell(8).setCellValue("电子邮箱");
        row.createCell(9).setCellValue("是否在职");
        row.createCell(10).setCellValue("职位");
        row.createCell(11).setCellValue("入职时间");
        row.createCell(12).setCellValue("离职时间");
        row.createCell(13).setCellValue("备份");
        //3.遍历分区数据，填充到创建好的excel中
        if (null != list && list.size() > 0) {
            //有分区要导出
            int index = 1;
            for (ElecUser user : list) {
                //3.1创建新行
                row = sheet.createRow(index++);
                //3.2在新行中创建新列，赋值
                row.createCell(0).setCellValue(getCellValue(user.getJctId()));
                row.createCell(1).setCellValue(getCellValue(user.getUserName()));
                row.createCell(2).setCellValue(getCellValue(user.getLogonName()));
                row.createCell(3).setCellValue(getCellValue(user.getLogonPwd()));
                row.createCell(4).setCellValue(getCellValue(user.getSexId()));
                row.createCell(5).setCellValue(getCellValue(user.getBirthday()));
                row.createCell(6).setCellValue(getCellValue(user.getAddress()));
                row.createCell(7).setCellValue(getCellValue(user.getContactTel()));
                row.createCell(8).setCellValue(getCellValue(user.getEmail()));
                row.createCell(9).setCellValue(getCellValue(user.getIsDuty()));
                row.createCell(10).setCellValue(getCellValue(user.getPostId()));
                row.createCell(11).setCellValue(getCellValue(user.getOnDutyDate()));
                row.createCell(12).setCellValue(getCellValue(user.getOffDutyDate()));
                row.createCell(13).setCellValue(getCellValue(user.getRemark()));
            }

        }

        //4.设置response的响应参数：文件名和一个流两个头
        String filename = "用户数据报表.xls";
        //从请求头信息中获取浏览器类型
        String agent = request.getHeader("User-Agent");
        ServletContext context = request.getSession().getServletContext();
        String mimeType = context.getMimeType(filename);
        filename = FileUtils.encodeDownloadFilename(request, filename, agent);
        //4.1一个流：response的输出流
        ServletOutputStream os = response.getOutputStream();
        //4.2两个头之一：content-type，通知浏览器返回的数据格式
        response.setContentType(mimeType);
        //4.3两个头之二：content-disposition，通知浏览器数据在浏览中打开的方式，以弹出窗口的方式打开数据，该值必须设置为attachment;filename=【文件名】
        response.setHeader("content-disposition", "attachment;filename=" + filename);
        //5.通过response的输出流将文件返回到界面
        wb.write(os);
    }

    private String  getCellValue(Object obj) {
        if(null != obj){
            if(obj.getClass().equals(String.class)){
                return (String) obj;
            }
            if(obj.getClass().equals(Date.class)){
                return DateUtils.date2String((Date) obj);
            }
        }

        return "";
    }


    /**
     * 文件上传
     * @param excelFile
     */
    @RequestMapping("/user/upload")
    @ResponseBody
    public ResultBean readExcel(@RequestParam(value = "userFile") MultipartFile excelFile,
                                HttpServletRequest req, HttpServletResponse resp){
        ResultBean resultBean = new ResultBean();
        List<ElecUser> allUsers = new ArrayList<>();
        try {
            List<String[]> userList = POIUtils.readExcel(excelFile);
            for(int i = 0;i<userList.size();i++){
                String[] users = userList.get(i);
                ElecUser user = new ElecUser();
                user.setUserId(UUIDUtils.getUUID());
                user.setJctId(users[0]);
                user.setUserName(users[1]);
                user.setLogonName(users[2]);
                user.setLogonPwd(users[3]);
                user.setSexId(users[4]);
                user.setBirthday(DateUtils.string2Date(users[5]));
                user.setAddress(users[6]);
                user.setContactTel(users[7]);
                user.setEmail(users[8]);
                user.setIsDuty(users[9]);
                user.setPostId(users[10]);
                user.setOnDutyDate(DateUtils.string2Date(users[11]));
                user.setOffDutyDate(DateUtils.string2Date(users[12]));
                user.setRemark(users[13]);
                allUsers.add(user);
            }
            elecUserService.addCustomers(allUsers);
            resultBean.setCode(CodeEnums.SUCCESS.getCode());
        } catch (IOException e) {
            logger.info("读取excel文件失败", e);
            resultBean.setCode(CodeEnums.FAILURE.getCode());
        } catch (ParseException e) {
            e.printStackTrace();
            resultBean.setCode(CodeEnums.FAILURE.getCode());
        }
        return resultBean;
    }
    /**
     * 跳转菜单管理
     */
    @RequestMapping("/system/menuInfo.action")
    public String menuInfo() {
        return "/system/menuInfo";
    }
    /**
     * 跳转gonggao
     */
    @RequestMapping("/static/gonggao")
    public String gonggao() {
        return "/static/gonggao";
    }
    /**
     * 跳转daiban
     */
    @RequestMapping("/static/daiban")
    public String daiban() {
        return "/static/daiban";
    }
    /**
     * 跳转yujing
     */
    @RequestMapping("/static/yujing")
    public String yujing() {
        return "/static/yujing";
    }
    /**
     * 跳转bug
     */
    @RequestMapping("/static/bug")
    public String bug() {
        return "/static/bug";
    }
    /**
     * 跳转home
     */
    @RequestMapping("/system/home")
    public String home() {
        return "/home";
    }
    /**
     * 跳转检测台建筑管理
     */
    @RequestMapping("/build/buildIndex")
    public String buildIndex() {
        return "/build/buildIndex";
    }

    /**
     * 跳转资料图纸管理
     */
    @RequestMapping("/dataChart/dataChartIndex")
    public String dataChartIndex() {
        return "/dataChart/dataChartIndex";
    }

    /**
     * 跳转仪器设备管理
     */
    @RequestMapping("/equapment/equapIndex")
    public String equapIndex() {
        return "/equapment/equapIndex";
    }

    /**
     * 跳转设备校准检修
     */
    @RequestMapping("/equapment/repairIndex")
    public String repairIndex() {
        return "equapment/repairIndex";
    }

    /**
     * 跳转设备购置计划
     */
    @RequestMapping("/equapment/planIndex")
    public String planIndex() {
        return "/equapment/planIndex";
    }

    /**
     * 跳转站点基本信息
     */
    @RequestMapping("/station/infoIndex")
    public String infoIndex() {
        return "/station/infoIndex";
    }

    /**
     * 跳转站点运行情况
     */
    @RequestMapping("/station/runIndex")
    public String runIndex() {
        return "station/runIndex";
    }

    /**
     * 跳转站点维护情况
     */
    @RequestMapping("/station/siteMaintainIndex")
    public String siteMaintainIndex() {
        return "/station/siteMaintainIndex";
    }

    /**
     * 跳转到system/activeIndex.jsp
     * @return
     */
    @RequestMapping("/system/activeIndex")
    public String activeIndex() {
        return "/system/activeIndex";
    }
    /**
     * 跳转角色管理首页
     */
    @RequestMapping("/system/roleIndex")
    public String roleIndex() {
        return "/system/roleIndex";
    }

    /**
     * 跳转用户管理首页
     */
    @RequestMapping("/system/userIndex")
    public String userIndex() {
        return "/system/userIndex";
    }

    /**
     * 跳转数据字典维护首页
     */
    @RequestMapping("/system/dictionaryIndex")
    public String dictionaryIndex() {
        return "/system/dictIndex";
    }
}
