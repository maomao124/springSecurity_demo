package mao.springsecurity_demo.mapper;

import mao.springsecurity_demo.entity.Administrators;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;


/**
 * <p>
 * Mapper 接口
 * </p>
 *
 * @author mao
 * @since 2022-08-01
 */

@Mapper
public interface AdministratorsMapper extends BaseMapper<Administrators>
{

}
