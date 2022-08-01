package mao.springsecurity_demo.service;

import mao.springsecurity_demo.entity.AdministratorsPassword;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Project name(项目名称)：springSecurity_demo
 * Package(包名): mao.springsecurity_demo.service
 * Class(测试类名): IAdministratorsPasswordServiceTest
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/8/1
 * Time(创建时间)： 13:50
 * Version(版本): 1.0
 * Description(描述)： 测试类
 */

@SpringBootTest
class IAdministratorsPasswordServiceTest
{

    @Autowired
    private IAdministratorsPasswordService administratorsPasswordService;

    @Test
    void test()
    {
        List<AdministratorsPassword> list = administratorsPasswordService.list();
        System.out.println(list);
    }
}