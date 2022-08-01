package mao.springsecurity_demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Project name(项目名称)：springSecurity_demo
 * Package(包名): mao.springsecurity_demo.controller
 * Class(类名): PageController
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/8/1
 * Time(创建时间)： 16:39
 * Version(版本): 1.0
 * Description(描述)： 无
 */


@Controller
@RequestMapping()
public class PageController
{
    @RequestMapping("index")
    public ModelAndView index()
    {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("index.html");
        return modelAndView;
    }
}
