package mao.springsecurity_demo.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.web.authentication.rememberme.PersistentTokenRepository;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

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
    @Autowired
    private PersistentTokenRepository persistentTokenRepository;

    @Autowired
    private UserDetailsService userDetailsService;

    @Override
    protected void configure(HttpSecurity http) throws Exception
    {
        //表单登录配置
        http.formLogin()
                //设置登录页面
                .loginPage("/userLogin")
                //设置哪个是登录的 url
                .loginProcessingUrl("/login")
                //设置登录成功之后跳转到哪个 url
                .defaultSuccessUrl("/index.html", false)
                //.successForwardUrl("/index")
                //设置登录失败之后跳转到哪个url
                .failureUrl("/error.html")
                //.failureForwardUrl("fail")
                //设置表单的用户名项参数名称
                .usernameParameter("username")
                //设置表单的密码项参数名称
                .passwordParameter("password");

        //关闭csrf
        //如果启用csrf，则必须要在表单加入以下标签
        //<input type="hidden" th:if="${_csrf}!=null" th:value="${_csrf.token} " name="_csrf"/>
        //http.csrf().disable();

        //异常处理配置，403页面配置
        http.exceptionHandling().accessDeniedPage("/unAuth.html");

        //退出登录配置
        http.logout()
                //设置退出登录的url
                //如果启用 CSRF 保护（默认），则请求也必须是 POST。这意味着默认情况下需要 POST "/logout" 来触发注销。
                //如果禁用 CSRF 保护，则允许任何 HTTP 方法。
                //对任何更改状态（即注销）的操作使用 HTTP POST 以防止CSRF 攻击 被认为是最好的。
                //如果你真的想使用 HTTP GET，你可以使用logoutRequestMatcher(new AntPathRequestMatcher(logoutUrl, "GET"));
                //.logoutUrl("/logout")
                .logoutRequestMatcher(new AntPathRequestMatcher("/logout", "GET"))
                //设置退出登录成功后要跳转的url
                .logoutSuccessUrl("/thanks.html")
                .permitAll();

        //自动登录配置
        http.rememberMe()
                //指定要使用的PersistentTokenRepository 。默认是使用TokenBasedRememberMeServices
                .tokenRepository(persistentTokenRepository)
                //指定当记住我令牌有效时用于查找UserDetails的UserDetailsService
                .userDetailsService(userDetailsService)
                //设置有效期，单位是秒，默认是2周时间。即使项目重新启动下次也可以正常登录
                .tokenValiditySeconds(2 * 60 * 60)
                //设置表单的记住密码项参数名称，默认是remember-me
                .rememberMeParameter("remember-me");

        //认证配置
        http.authorizeRequests()
                //指定页面不需要验证
                .antMatchers("/login.html", "/login", "/error.html", "/thanks.html",
                        "/css/**", "/js/**", "/img/**",
                        "/test/noauth", "/test/anno5/**","/userLogin")
                .permitAll()
                .antMatchers("/test/root").hasAuthority("root")
                .antMatchers("/test/admin").hasAuthority("admin")
                .antMatchers("/test/rootOrAdmin").hasAnyAuthority("root", "admin")
                .antMatchers("/test/role_root").hasRole("root")
                .antMatchers("/test/role_root_or_admin").hasAnyRole("root", "admin")
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
