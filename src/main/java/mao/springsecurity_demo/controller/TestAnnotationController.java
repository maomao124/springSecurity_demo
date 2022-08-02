package mao.springsecurity_demo.controller;

import mao.springsecurity_demo.entity.Administrators;
import mao.springsecurity_demo.service.IAdministratorsService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.access.prepost.PostAuthorize;
import org.springframework.security.access.prepost.PostFilter;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;


/**
 * Project name(项目名称)：springSecurity_demo
 * Package(包名): mao.springsecurity_demo.controller
 * Class(类名): TestAnnotationController
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/8/2
 * Time(创建时间)： 13:55
 * Version(版本): 1.0
 * Description(描述)： 无
 */


@RestController
@RequestMapping("/test")
public class TestAnnotationController
{

    private static final Logger log = LoggerFactory.getLogger(TestAnnotationController.class);

    /**
     * Role root string.
     *
     * @return the string
     */
    @Secured({"ROLE_root"})
    @GetMapping("/anno/root")
    public String role_root()
    {
        return "注解测试，当前需要root角色，访问成功";
    }

    /**
     * Role root 1 string.
     *
     * @return the string
     */
    @Secured({"ROLE_root1"})
    @GetMapping("/anno/root1")
    public String role_root1()
    {
        return "注解测试，当前需要root1角色，访问成功";
    }

    /**
     * Role admin string.
     *
     * @return the string
     */
    @Secured({"ROLE_admin"})
    @GetMapping("/anno/admin")
    public String role_admin()
    {
        return "注解测试，当前需要admin角色，访问成功";
    }

    /**
     * Role admin 1 string.
     *
     * @return the string
     */
    @Secured({"ROLE_admin1"})
    @GetMapping("/anno/admin1")
    public String role_admin1()
    {
        return "注解测试，当前需要admin角色，访问成功";
    }

    /**
     * Role admin or root string.
     *
     * @return the string
     */
    @Secured({"ROLE_admin", "ROLE_root"})
    @GetMapping("/anno/admin_or_root")
    public String role_admin_or_root()
    {
        return "注解测试，当前需要admin或者root角色，访问成功";
    }

    /**
     * Role admin or root 1 string.
     *
     * @return the string
     */
    @Secured({"ROLE_admin", "ROLE_root1"})
    @GetMapping("/anno/admin_or_root1")
    public String role_admin_or_root1()
    {
        return "注解测试，当前需要admin或者root1角色，访问成功";
    }

    /**
     * Role admin 1 or root 1 string.
     *
     * @return the string
     */
    @Secured({"ROLE_admin1", "ROLE_root1"})
    @GetMapping("/anno/admin1_or_root1")
    public String role_admin1_or_root1()
    {
        return "注解测试，当前需要admin1或者root1角色，访问成功";
    }

    //--------------------------------------------

    /**
     * Authority root string.
     *
     * @return the string
     */
    @PreAuthorize("hasAnyAuthority('root')")
    @GetMapping("/anno2/root")
    public String authority_root()
    {
        return "注解测试，当前需要root权限，访问成功";
    }

    /**
     * Authority root 1 string.
     *
     * @return the string
     */
    @PreAuthorize("hasAnyAuthority('root1')")
    @GetMapping("/anno2/root1")
    public String authority_root1()
    {
        return "注解测试，当前需要root1权限，访问成功";
    }

    /**
     * Authority admin string.
     *
     * @return the string
     */
    @PreAuthorize("hasAnyAuthority('admin')")
    @GetMapping("/anno2/admin")
    public String authority_admin()
    {
        return "注解测试，当前需要admin权限，访问成功";
    }

    /**
     * Authority admin 1 string.
     *
     * @return the string
     */
    @PreAuthorize("hasAnyAuthority('admin1')")
    @GetMapping("/anno2/admin1")
    public String authority_admin1()
    {
        return "注解测试，当前需要admin1权限，访问成功";
    }

    /**
     * Authority admin or root string.
     *
     * @return the string
     */
    @PreAuthorize("hasAnyAuthority('admin','root')")
    @GetMapping("/anno2/admin_or_root")
    public String authority_admin_or_root()
    {
        return "注解测试，当前需要admin或者root权限，访问成功";
    }


    /**
     * Authority admin or root 1 string.
     *
     * @return the string
     */
    @PreAuthorize("hasAnyAuthority('admin','root1')")
    @GetMapping("/anno2/admin_or_root1")
    public String authority_admin_or_root1()
    {
        return "注解测试，当前需要admin或者root1权限，访问成功";
    }

    /**
     * Authority admin 1 or root string.
     *
     * @return the string
     */
    @PreAuthorize("hasAnyAuthority('admin1','root')")
    @GetMapping("/anno2/admin1_or_root")
    public String authority_admin1_or_root()
    {
        return "注解测试，当前需要admin1或者root权限，访问成功";
    }

    /**
     * Authority admin 1 or root 1 string.
     *
     * @return the string
     */
    @PreAuthorize("hasAnyAuthority('admin1','root1')")
    @GetMapping("/anno2/admin1_or_root1")
    public String authority_admin1_or_root1()
    {
        return "注解测试，当前需要admin1或者root1权限，访问成功";
    }


    //----------------------------------------

    /**
     * Authority 2 root string.
     *
     * @return the string
     */
    @PostAuthorize("hasAnyAuthority('root')")
    @GetMapping("/anno3/root")
    public String authority2_root()
    {
        log.info("PostAuthorize注解测试，当前需要root权限");
        return "PostAuthorize注解测试，当前需要root权限，访问成功";
    }

    /**
     * Authority 2 root 1 string.
     *
     * @return the string
     */
    @PostAuthorize("hasAnyAuthority('root1')")
    @GetMapping("/anno3/root1")
    public String authority2_root1()
    {
        log.info("PostAuthorize注解测试，当前需要root1权限");
        return "PostAuthorize注解测试，当前需要root1权限，访问成功";
    }

    /**
     * Authority 2 admin string.
     *
     * @return the string
     */
    @PostAuthorize("hasAnyAuthority('admin')")
    @GetMapping("/anno3/admin")
    public String authority2_admin()
    {
        log.info("PostAuthorize注解测试，当前需要admin权限");
        return "PostAuthorize注解测试，当前需要admin权限，访问成功";
    }

    /**
     * Authority 2 admin 1 string.
     *
     * @return the string
     */
    @PostAuthorize("hasAnyAuthority('admin1')")
    @GetMapping("/anno3/admin1")
    public String authority2_admin1()
    {
        log.info("PostAuthorize注解测试，当前需要admin1权限");
        return "PostAuthorize注解测试，当前需要admin1权限，访问成功";
    }

    //-------------------------------------

    @PostFilter("filterObject.administratorNo==10002L")
    @GetMapping("/anno4/1")
    public List<Administrators> anno4_1()
    {
        log.info("执行/anno4/1");
        List<Administrators> list = new ArrayList<>();
        Administrators administrators = new Administrators();
        administrators.setAdministratorNo(10002L);
        list.add(administrators);
        return list;
    }

    @PostFilter("filterObject.administratorNo==10003L")
    @GetMapping("/anno4/2")
    public List<Administrators> anno4_2()
    {
        log.info("执行/anno4/2");
        List<Administrators> list = new ArrayList<>();
        Administrators administrators = new Administrators();
        administrators.setAdministratorNo(10002L);
        list.add(administrators);
        return list;
    }

    @PostFilter("filterObject.administratorNo==10003L")
    @GetMapping("/anno4/3")
    public List<Administrators> anno4_3()
    {
        log.info("执行/anno4/3");
        List<Administrators> list = new ArrayList<>();
        Administrators administrators1 = new Administrators();
        administrators1.setAdministratorNo(10002L);
        Administrators administrators2 = new Administrators();
        administrators2.setAdministratorNo(10003L);
        Administrators administrators3 = new Administrators();
        administrators3.setAdministratorNo(10004L);
        list.add(administrators1);
        list.add(administrators2);
        list.add(administrators3);
        return list;
    }

    @PostFilter("filterObject.administratorNo!=10003L")
    @GetMapping("/anno4/4")
    public List<Administrators> anno4_4()
    {
        log.info("执行/anno4/4");
        List<Administrators> list = new ArrayList<>();
        Administrators administrators1 = new Administrators();
        administrators1.setAdministratorNo(10002L);
        Administrators administrators2 = new Administrators();
        administrators2.setAdministratorNo(10003L);
        Administrators administrators3 = new Administrators();
        administrators3.setAdministratorNo(10004L);
        list.add(administrators1);
        list.add(administrators2);
        list.add(administrators3);
        return list;
    }

    @PostFilter("filterObject.administratorName!=null")
    @GetMapping("/anno4/5")
    public List<Administrators> anno4_5()
    {
        log.info("执行/anno4/5");
        List<Administrators> list = new ArrayList<>();
        Administrators administrators1 = new Administrators();
        administrators1.setAdministratorNo(10002L);
        administrators1.setAdministratorName("张三");
        Administrators administrators2 = new Administrators();
        administrators2.setAdministratorNo(10003L);
        Administrators administrators3 = new Administrators();
        administrators3.setAdministratorNo(10004L);
        list.add(administrators1);
        list.add(administrators2);
        list.add(administrators3);
        return list;
    }

    @PostFilter("(filterObject.administratorName!=null)&&(filterObject.administratorSex.equals('男'))")
    @GetMapping("/anno4/6")
    public List<Administrators> anno4_6()
    {
        log.info("执行/anno4/6");
        List<Administrators> list = new ArrayList<>();
        Administrators administrators1 = new Administrators();
        administrators1.setAdministratorNo(10002L);
        administrators1.setAdministratorName("张三");
        administrators1.setAdministratorSex("女");
        Administrators administrators2 = new Administrators();
        administrators2.setAdministratorNo(10003L);
        Administrators administrators3 = new Administrators();
        administrators3.setAdministratorNo(10004L);
        Administrators administrators4 = new Administrators();
        administrators4.setAdministratorNo(10005L);
        administrators4.setAdministratorName("李四");
        administrators4.setAdministratorSex("男");
        list.add(administrators1);
        list.add(administrators2);
        list.add(administrators3);
        list.add(administrators4);
        return list;
    }

    @Autowired
    private IAdministratorsService administratorsService;

    /**
     * 需求：从数据库查询性别为女的数据
     *
     * @return List<Administrators>对象
     */
    @PostFilter("filterObject.administratorSex.equals('女')")
    @GetMapping("/anno4/7")
    public List<Administrators> anno4_7()
    {
        log.info("执行/anno4/7");
        List<Administrators> list = administratorsService.query().list();
        return list;
    }

    /**
     * 需求：从数据库查询性别为女的数据
     *
     * @return List<Administrators>对象
     */
    @PostFilter("filterObject.administratorSex.equals('男')")
    @GetMapping("/anno4/8")
    public List<Administrators> anno4_8()
    {
        log.info("执行/anno4/8");
        List<Administrators> list = administratorsService.query().list();
        return list;
    }

}
