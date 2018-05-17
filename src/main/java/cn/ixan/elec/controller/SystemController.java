package cn.ixan.elec.controller;

import cn.ixan.elec.domain.ElecCommonmsg;
import cn.ixan.elec.domain.ElecUser;
import cn.ixan.elec.enums.CodeEnums;
import cn.ixan.elec.service.ElecSystemService;
import cn.ixan.elec.utils.DateUtils;
import cn.ixan.elec.utils.UUIDUtils;
import cn.ixan.elec.vo.ResultBean;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

@Controller
@RequestMapping("/system")
public class SystemController {
    private static Logger logger = LoggerFactory.getLogger(SystemController.class);
    @Autowired
    private ElecSystemService elecSystemService;

    /**
     * 用户退出
     */
    @RequestMapping("/logout")
    public String logout() {
        Subject subject = SecurityUtils.getSubject();
        if (subject.isAuthenticated()) {
            ElecUser user = (ElecUser) subject.getSession().getAttribute("user");
            logger.debug("用户" + user.getLogonName() + "退出登录!");
            // session 会销毁，在SessionListener监听session销毁，清理权限缓存
            subject.logout();
        }
        return "redirect:/";
    }

    /**
     * 进入首页
     * @return
     */
    @RequestMapping("/index")
    public ModelAndView index(HttpServletRequest request){
        ModelAndView modelAndView = new ModelAndView();
        // 获取访问者IP地址
        String ip = getRemortIP(request);
        modelAndView.addObject("ip",ip);
        // 设置返回的页面
        modelAndView.setViewName("/index");
        return modelAndView;
    }

    /**
     * 用户登录校验
     */
    @RequestMapping("/login")
    @ResponseBody
    public ResultBean login(@RequestBody ElecUser elecUser) {
        ResultBean resultBean = new ResultBean();
        Subject subject = SecurityUtils.getSubject();//获取当前用户对象
        //生成令牌(传入用户输入的账号和密码)
        UsernamePasswordToken token = new UsernamePasswordToken(elecUser.getLogonName(),
                elecUser.getLogonPwd());
        //认证登录
        try {
            //这里会加载自定义的realm
            subject.login(token);//把令牌放到login里面进行查询,如果查询账号和密码时候匹配,如果匹配就把user对象获取出来,失败就抛异常
            ElecUser user = (ElecUser) subject.getPrincipal();//获取登录成功的用户对象(以前是直接去service里面查)
            subject.getSession().setAttribute("user", user);
            resultBean.setCode(CodeEnums.SUCCESS.getCode());
        } catch (Exception e) {
            //认证登录失败抛出异常
            logger.error("用户名和密码不匹配...");
            resultBean.setCode(CodeEnums.FAILURE.getCode());
        }
        return resultBean;
    }

    /**
     * 保存运行监控信息,异步请求
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public Map<String, Object> save(@RequestBody ElecCommonmsg elecCommonmsg) {
        // 生成主键ID
        elecCommonmsg.setComId(UUIDUtils.getUUID());
        //创建时间
        elecCommonmsg.setCreateDate(DateUtils.getTimestamp());
        Map<String, Object> map = null;
        try {
            // 保存
            map = elecSystemService.save(elecCommonmsg);
        } catch (Exception e) {
            logger.error("保存运行监控信息失败:", e);
        }
        return map;
    }

    /**
     * 获取ip方式2
     * @param request
     * @return
     */
    public String getRemortIP(HttpServletRequest request) {
        if (request.getHeader("x-forwarded-for") == null) {
            return request.getRemoteAddr();
        }
        return request.getHeader("x-forwarded-for");
    }
    /**
     * 获取ip方式1
     * @param request
     * @return
     */
    public String getIpAddr(HttpServletRequest request) {
        String ip = request.getHeader("x-forwarded-for");
        if(ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("Proxy-Client-IP");
        }
        if(ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("WL-Proxy-Client-IP");
        }
        if(ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getRemoteAddr();
        }
        return ip;
    }
}
