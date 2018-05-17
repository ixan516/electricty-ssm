package cn.ixan.elec.controller;

import cn.ixan.elec.domain.ElecUser;
import cn.ixan.elec.service.ElecUserService;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class UserRealm extends AuthorizingRealm {
    private static final Logger logger = LoggerFactory.getLogger(UserRealm.class);
    @Autowired
    private ElecUserService elecUserService;

    /**
     * 授权
     * @param principalCollection
     * @return
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        AuthorizationInfo authorizationInfo = new SimpleAuthorizationInfo();

        return null;
    }

    /**
     * 身份认证
     * @param authenticationToken
     * @return
     * @throws AuthenticationException
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        //1.根据用户名查询用户对象
        UsernamePasswordToken usernamePasswordToken = (UsernamePasswordToken) authenticationToken;
        String username = usernamePasswordToken.getUsername();
        ElecUser elecUser = elecUserService.findByUserName(username);
        if (null != elecUser) {
            // 2.查询到用户，通过AuthenticationInfo将用户对象和密码返回给安全管理器，安全管理器会自动校验密码，
            // 校验通过,正常执行，
            // 校验不通过，直接抛异常
            // 参数1：可以放任意对象，该对象可以在任何位置获取到，一般放用户对象
            // 参数2：放要校验的密码
            // 参数3：当前realm的名称
            return new SimpleAuthenticationInfo(elecUser, elecUser.getLogonPwd(), this.getName());
        }
        // 3.查询不到用户，直接返回null给安全管理器，安全管理会认为用户不存在，直接抛异常
        return null;
    }

}
