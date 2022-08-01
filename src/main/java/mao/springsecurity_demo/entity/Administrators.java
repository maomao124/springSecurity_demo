package mao.springsecurity_demo.entity;

import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
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


@ApiModel(value = "Administrators对象", description = "")
public class Administrators implements Serializable
{

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("管理员编号")
    @TableId(type = IdType.AUTO)
    private Long administratorNo;

    @ApiModelProperty("管理员姓名")
    private String administratorName;

    @ApiModelProperty("管理员性别")
    private String administratorSex;

    @ApiModelProperty("管理员手机号码")
    private String administratorTelephoneNumber;

    @ApiModelProperty("管理员职务")
    private String administratorJob;

    @ApiModelProperty("管理员身份证号码")
    private String administratorIdcard;


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
     * Gets administrator name.
     *
     * @return the administrator name
     */
    public String getAdministratorName()
    {
        return administratorName;
    }

    /**
     * Sets administrator name.
     *
     * @param administratorName the administrator name
     */
    public void setAdministratorName(String administratorName)
    {
        this.administratorName = administratorName;
    }

    /**
     * Gets administrator sex.
     *
     * @return the administrator sex
     */
    public String getAdministratorSex()
    {
        return administratorSex;
    }

    /**
     * Sets administrator sex.
     *
     * @param administratorSex the administrator sex
     */
    public void setAdministratorSex(String administratorSex)
    {
        this.administratorSex = administratorSex;
    }

    /**
     * Gets administrator telephone number.
     *
     * @return the administrator telephone number
     */
    public String getAdministratorTelephoneNumber()
    {
        return administratorTelephoneNumber;
    }

    /**
     * Sets administrator telephone number.
     *
     * @param administratorTelephoneNumber the administrator telephone number
     */
    public void setAdministratorTelephoneNumber(String administratorTelephoneNumber)
    {
        this.administratorTelephoneNumber = administratorTelephoneNumber;
    }

    /**
     * Gets administrator job.
     *
     * @return the administrator job
     */
    public String getAdministratorJob()
    {
        return administratorJob;
    }

    /**
     * Sets administrator job.
     *
     * @param administratorJob the administrator job
     */
    public void setAdministratorJob(String administratorJob)
    {
        this.administratorJob = administratorJob;
    }

    /**
     * Gets administrator idcard.
     *
     * @return the administrator idcard
     */
    public String getAdministratorIdcard()
    {
        return administratorIdcard;
    }

    /**
     * Sets administrator idcard.
     *
     * @param administratorIdcard the administrator idcard
     */
    public void setAdministratorIdcard(String administratorIdcard)
    {
        this.administratorIdcard = administratorIdcard;
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

        Administrators that = (Administrators) o;

        if (getAdministratorNo() != null ? !getAdministratorNo().equals(that.getAdministratorNo()) : that.getAdministratorNo() != null)
        {
            return false;
        }
        if (getAdministratorName() != null ? !getAdministratorName().equals(that.getAdministratorName()) : that.getAdministratorName() != null)
        {
            return false;
        }
        if (getAdministratorSex() != null ? !getAdministratorSex().equals(that.getAdministratorSex()) : that.getAdministratorSex() != null)
        {
            return false;
        }
        if (getAdministratorTelephoneNumber() != null ? !getAdministratorTelephoneNumber().equals(that.getAdministratorTelephoneNumber()) : that.getAdministratorTelephoneNumber() != null)
        {
            return false;
        }
        if (getAdministratorJob() != null ? !getAdministratorJob().equals(that.getAdministratorJob()) : that.getAdministratorJob() != null)
        {
            return false;
        }
        return getAdministratorIdcard() != null ? getAdministratorIdcard().equals(that.getAdministratorIdcard()) : that.getAdministratorIdcard() == null;
    }

    @Override
    public int hashCode()
    {
        int result = getAdministratorNo() != null ? getAdministratorNo().hashCode() : 0;
        result = 31 * result + (getAdministratorName() != null ? getAdministratorName().hashCode() : 0);
        result = 31 * result + (getAdministratorSex() != null ? getAdministratorSex().hashCode() : 0);
        result = 31 * result + (getAdministratorTelephoneNumber() != null ? getAdministratorTelephoneNumber().hashCode() : 0);
        result = 31 * result + (getAdministratorJob() != null ? getAdministratorJob().hashCode() : 0);
        result = 31 * result + (getAdministratorIdcard() != null ? getAdministratorIdcard().hashCode() : 0);
        return result;
    }

    @Override
    @SuppressWarnings("all")
    public String toString()
    {
        final StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("administratorNo：").append(administratorNo).append('\n');
        stringbuilder.append("administratorName：").append(administratorName).append('\n');
        stringbuilder.append("administratorSex：").append(administratorSex).append('\n');
        stringbuilder.append("administratorTelephoneNumber：").append(administratorTelephoneNumber).append('\n');
        stringbuilder.append("administratorJob：").append(administratorJob).append('\n');
        stringbuilder.append("administratorIdcard：").append(administratorIdcard).append('\n');
        return stringbuilder.toString();
    }
}
