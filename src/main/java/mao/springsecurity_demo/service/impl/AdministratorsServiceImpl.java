package mao.springsecurity_demo.service.impl;

import mao.springsecurity_demo.entity.Administrators;
import mao.springsecurity_demo.mapper.AdministratorsMapper;
import mao.springsecurity_demo.service.IAdministratorsService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author mao
 * @since 2022-08-01
 */
@Service
public class AdministratorsServiceImpl extends ServiceImpl<AdministratorsMapper, Administrators> implements IAdministratorsService
{

}
