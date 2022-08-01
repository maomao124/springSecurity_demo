package mao.springsecurity_demo.service;

import mao.springsecurity_demo.entity.AdministratorsPassword;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 * Project name(项目名称)：springSecurity_demo
 * Package(包名): mao.springsecurity_demo.service
 * Class(类名): AdministratorsLoginService
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/8/1
 * Time(创建时间)： 14:23
 * Version(版本): 1.0
 * Description(描述)： 无
 */

@Service
public class AdministratorsLoginService implements UserDetailsService
{

    @Autowired
    private IAdministratorsPasswordService administratorsPasswordService;


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException
    {
        //判空
        if (username == null || username.equals(""))
        {
            throw new UsernameNotFoundException("用户名不能为空！");
        }
        Long id = null;
        try
        {
            id = Long.parseLong(username);
        }
        catch (Exception e)
        {
            throw new UsernameNotFoundException("用户名必须为数字！");
        }
        //查数据库
        AdministratorsPassword administratorsPassword = administratorsPasswordService.query().eq("administrator_no", id).one();
        //判断是否存在
        if (administratorsPassword == null || administratorsPassword.getAdministratorNo() == null)
        {
            throw new UsernameNotFoundException("用户名不存在！");
        }
        //将数据放入user对象里并返回
        return new User(administratorsPassword.getAdministratorNo().toString(),
                administratorsPassword.getAdministratorPassword(),
                AuthorityUtils.createAuthorityList("administrator"));
    }
}
