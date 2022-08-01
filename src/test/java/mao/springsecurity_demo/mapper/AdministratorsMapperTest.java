package mao.springsecurity_demo.mapper;

import mao.springsecurity_demo.entity.Administrators;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Project name(项目名称)：springSecurity_demo
 * Package(包名): mao.springsecurity_demo.mapper
 * Class(测试类名): AdministratorsMapperTest
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/8/1
 * Time(创建时间)： 13:51
 * Version(版本): 1.0
 * Description(描述)： 测试类
 */

@SpringBootTest
class AdministratorsMapperTest
{
    @Autowired
    private AdministratorsMapper administratorsMapper;

    @Test
    void test()
    {
        List<Administrators> administratorsList = administratorsMapper.selectList(null);
        System.out.println(administratorsList);
    }
}