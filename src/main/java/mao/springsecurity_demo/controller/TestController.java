package mao.springsecurity_demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Project name(项目名称)：springSecurity_demo
 * Package(包名): mao.springsecurity_demo.controller
 * Class(类名): TestController
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/7/30
 * Time(创建时间)： 20:52
 * Version(版本): 1.0
 * Description(描述)： 无
 */

@RestController
@RequestMapping("/test")
public class TestController
{
    @GetMapping("")
    public String success()
    {
        return "success";
    }

    @GetMapping("/noauth")
    public String noAuth()
    {
        return "noAuth";
    }

    @GetMapping("/root")
    public String root()
    {
        return "root权限，访问成功";
    }

    @GetMapping("/admin")
    public String admin()
    {
        return "admin权限，访问成功";
    }

    @GetMapping("/rootOrAdmin")
    public String rootOrAdmin()
    {
        return "admin或者root权限，访问成功";
    }

}
