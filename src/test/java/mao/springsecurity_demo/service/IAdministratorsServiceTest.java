package mao.springsecurity_demo.service;

import mao.springsecurity_demo.entity.Administrators;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Project name(项目名称)：springSecurity_demo
 * Package(包名): mao.springsecurity_demo.service
 * Class(测试类名): IAdministratorsServiceTest
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/8/1
 * Time(创建时间)： 13:41
 * Version(版本): 1.0
 * Description(描述)： 测试类
 */

@SpringBootTest
class IAdministratorsServiceTest
{

    @Autowired
    private IAdministratorsService administratorsService;

    @Test
    void test()
    {
        List<Administrators> list = administratorsService.query().list();
        System.out.println(list);
    }
}