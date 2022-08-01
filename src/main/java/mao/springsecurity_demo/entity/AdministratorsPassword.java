package mao.springsecurity_demo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 *
 * </p>
 *
 * @author mao
 * @since 2022 -08-01
 */

@TableName("administrators_password")
@ApiModel(value = "AdministratorsPassword对象", description = "")
public class AdministratorsPassword implements Serializable
{

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("管理员编号")
    @TableId(type = IdType.AUTO)
    private Long administratorNo;

    @ApiModelProperty("管理员密码，散列值")
    private String administratorPassword;


    /**
     * Gets administrator no.
     *
     * @return the administrator no
     */
    public Long getAdministratorNo()
    {
        return administratorNo;
    }

    /**
     * Sets administrator no.
     *
     * @param administratorNo the administrator no
     */
    public void setAdministratorNo(Long administratorNo)
    {
        this.administratorNo = administratorNo;
    }

    /**
     * Gets administrator password.
     *
     * @return the administrator password
     */
    public String getAdministratorPassword()
    {
        return administratorPassword;
    }

    /**
     * Sets administrator password.
     *
     * @param administratorPassword the administrator password
     */
    public void setAdministratorPassword(String administratorPassword)
    {
        this.administratorPassword = administratorPassword;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o)
        {
            return true;
        }
        if (o == null || getClass() != o.getClass())
        {
            return false;
        }

        AdministratorsPassword that = (AdministratorsPassword) o;

        if (getAdministratorNo() != null ? !getAdministratorNo().equals(that.getAdministratorNo()) : that.getAdministratorNo() != null)
        {
            return false;
        }
        return getAdministratorPassword() != null ? getAdministratorPassword().equals(that.getAdministratorPassword()) : that.getAdministratorPassword() == null;
    }

    @Override
    public int hashCode()
    {
        int result = getAdministratorNo() != null ? getAdministratorNo().hashCode() : 0;
        result = 31 * result + (getAdministratorPassword() != null ? getAdministratorPassword().hashCode() : 0);
        return result;
    }

    @Override
    @SuppressWarnings("all")
    public String toString()
    {
        final StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("administratorNo：").append(administratorNo).append('\n');
        stringbuilder.append("administratorPassword：").append(administratorPassword).append('\n');
        return stringbuilder.toString();
    }
}
