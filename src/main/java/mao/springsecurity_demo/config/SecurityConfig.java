package mao.springsecurity_demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * Project name(项目名称)：springSecurity_demo
 * Package(包名): mao.springsecurity_demo.config
 * Class(类名): SecurityConfig
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/7/30
 * Time(创建时间)： 20:30
 * Version(版本): 1.0
 * Description(描述)： 无
 */

@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter
{
    @Override
    protected void configure(HttpSecurity http) throws Exception
    {
        //表单登录
        http.formLogin()
                //设置登录页面
                .loginPage("/login.html")
                //设置哪个是登录的 url
                .loginProcessingUrl("/login")
                //设置登录成功之后跳转到哪个 url
                .defaultSuccessUrl("/index.html", false)
                //.successForwardUrl("/index")
                //设置登录失败之后跳转到哪个url
                .failureUrl("/error.html")
                //设置表单的用户名项参数名称
                .usernameParameter("username")
                //设置表单的密码项参数名称
                .passwordParameter("password");

        //关闭csrf
        http.csrf().disable();

        //认证配置
        http.authorizeRequests()
                //指定页面不需要验证
                .antMatchers("/login.html", "/login", "/error.html",
                        "/css/**", "/js/**", "/img/**", "/test/noauth")
                .permitAll()
                //其它请求都需要身份认证
                .anyRequest()
                .authenticated();

    }


/*
    @Bean
    public PasswordEncoder passwordEncoder()
    {
        return new BCryptPasswordEncoder();
    }
*/

}
