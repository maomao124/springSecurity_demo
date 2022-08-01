package mao.springsecurity_demo.service.impl;

import mao.springsecurity_demo.entity.AdministratorsPassword;
import mao.springsecurity_demo.mapper.AdministratorsPasswordMapper;
import mao.springsecurity_demo.service.IAdministratorsPasswordService;
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
public class AdministratorsPasswordServiceImpl extends ServiceImpl<AdministratorsPasswordMapper, AdministratorsPassword> implements IAdministratorsPasswordService
{

}
