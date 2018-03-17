package com.wangsen.learn1.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;

import javax.management.relation.Role;
import java.io.Serializable;

/**
 * <p>
 * 用户账户表
 * </p>
 *
 * @author wangsen
 * @since 2018-03-10
 */
public class TbUser implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 用户id
     */
    @TableId(value = "u_id", type = IdType.AUTO)
    private Integer uId;
    /**
     * 真实姓名
     */
    private String uName;
    /**
     * 账户名称
     */
    private String uAccountName;
    /**
     * 用户密码
     */
    private String uPassword;
    /**
     * 逻辑删除状态
     */
    private Integer uDeleteStatus;
    /**
     * 是否锁定
     */
    private Integer uLocked;
    /**
     * 用户描述
     */
    private String uDescription;
    /**
     * 加密盐
     */
    private String uCredentialsSalt;
    /**
     * 创建者
     */
    private String uCreatorName;
    /**
     * 创建时间
     */
    private Date uCreateTime;
    /**
     * 更新时间
     */
    private Date uUpdateTime;
    private Integer uDeptId;
    private String uImg;
    private String uEmail;

    @TableField(exist = false)
    private TbRole tbRole;

    public TbRole getTbRole() {
        return tbRole;
    }

    public void setTbRole(TbRole tbRole) {
        this.tbRole = tbRole;
    }

    public Integer getuId() {
        return uId;
    }

    public void setuId(Integer uId) {
        this.uId = uId;
    }

    public String getuName() {
        return uName;
    }

    public void setuName(String uName) {
        this.uName = uName;
    }

    public String getuAccountName() {
        return uAccountName;
    }

    public void setuAccountName(String uAccountName) {
        this.uAccountName = uAccountName;
    }

    public String getuPassword() {
        return uPassword;
    }

    public void setuPassword(String uPassword) {
        this.uPassword = uPassword;
    }

    public Integer getuDeleteStatus() {
        return uDeleteStatus;
    }

    public void setuDeleteStatus(Integer uDeleteStatus) {
        this.uDeleteStatus = uDeleteStatus;
    }

    public Integer getuLocked() {
        return uLocked;
    }

    public void setuLocked(Integer uLocked) {
        this.uLocked = uLocked;
    }

    public String getuDescription() {
        return uDescription;
    }

    public void setuDescription(String uDescription) {
        this.uDescription = uDescription;
    }

    public String getuCredentialsSalt() {
        return uCredentialsSalt;
    }

    public void setuCredentialsSalt(String uCredentialsSalt) {
        this.uCredentialsSalt = uCredentialsSalt;
    }

    public String getuCreatorName() {
        return uCreatorName;
    }

    public void setuCreatorName(String uCreatorName) {
        this.uCreatorName = uCreatorName;
    }

    public Date getuCreateTime() {
        return uCreateTime;
    }

    public void setuCreateTime(Date uCreateTime) {
        this.uCreateTime = uCreateTime;
    }

    public Date getuUpdateTime() {
        return uUpdateTime;
    }

    public void setuUpdateTime(Date uUpdateTime) {
        this.uUpdateTime = uUpdateTime;
    }

    public Integer getuDeptId() {
        return uDeptId;
    }

    public void setuDeptId(Integer uDeptId) {
        this.uDeptId = uDeptId;
    }

    public String getuImg() {
        return uImg;
    }

    public void setuImg(String uImg) {
        this.uImg = uImg;
    }

    public String getuEmail() {
        return uEmail;
    }

    public void setuEmail(String uEmail) {
        this.uEmail = uEmail;
    }

    @Override
    public String toString() {
        return "TbUser{" +
                ", uId=" + uId +
                ", uName=" + uName +
                ", uAccountName=" + uAccountName +
                ", uPassword=" + uPassword +
                ", uDeleteStatus=" + uDeleteStatus +
                ", uLocked=" + uLocked +
                ", uDescription=" + uDescription +
                ", uCredentialsSalt=" + uCredentialsSalt +
                ", uCreatorName=" + uCreatorName +
                ", uCreateTime=" + uCreateTime +
                ", uUpdateTime=" + uUpdateTime +
                ", uDeptId=" + uDeptId +
                ", uImg=" + uImg +
                ", uEmail=" + uEmail +
                "}";
    }
}
