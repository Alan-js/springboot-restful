package com.company.project.model;

import java.util.Date;
import javax.persistence.*;

public class Department {
    /**
     * id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 部门名称
     */
    private String name;

    /**
     * 编码
     */
    private String code;

    /**
     * 类型
     */
    private String type;

    /**
     * 状态
     */
    private String status;

    /**
     * 描述
     */
    private String description;

    /**
     * 创建时间
     */
    @Column(name = "crt_time")
    private Date crtTime;

    /**
     * 创建用户
     */
    @Column(name = "crt_user")
    private String crtUser;

    /**
     * 创建人
     */
    @Column(name = "crt_name")
    private String crtName;

    /**
     * 更新时间
     */
    @Column(name = "upd_time")
    private Date updTime;

    /**
     * 更新用户
     */
    @Column(name = "upd_user")
    private String updUser;

    /**
     * 更新人
     */
    @Column(name = "upd_name")
    private String updName;

    /**
     * 获取id
     *
     * @return id - id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置id
     *
     * @param id id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取部门名称
     *
     * @return name - 部门名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置部门名称
     *
     * @param name 部门名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取编码
     *
     * @return code - 编码
     */
    public String getCode() {
        return code;
    }

    /**
     * 设置编码
     *
     * @param code 编码
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * 获取类型
     *
     * @return type - 类型
     */
    public String getType() {
        return type;
    }

    /**
     * 设置类型
     *
     * @param type 类型
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * 获取状态
     *
     * @return status - 状态
     */
    public String getStatus() {
        return status;
    }

    /**
     * 设置状态
     *
     * @param status 状态
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * 获取描述
     *
     * @return description - 描述
     */
    public String getDescription() {
        return description;
    }

    /**
     * 设置描述
     *
     * @param description 描述
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * 获取创建时间
     *
     * @return crt_time - 创建时间
     */
    public Date getCrtTime() {
        return crtTime;
    }

    /**
     * 设置创建时间
     *
     * @param crtTime 创建时间
     */
    public void setCrtTime(Date crtTime) {
        this.crtTime = crtTime;
    }

    /**
     * 获取创建用户
     *
     * @return crt_user - 创建用户
     */
    public String getCrtUser() {
        return crtUser;
    }

    /**
     * 设置创建用户
     *
     * @param crtUser 创建用户
     */
    public void setCrtUser(String crtUser) {
        this.crtUser = crtUser;
    }

    /**
     * 获取创建人
     *
     * @return crt_name - 创建人
     */
    public String getCrtName() {
        return crtName;
    }

    /**
     * 设置创建人
     *
     * @param crtName 创建人
     */
    public void setCrtName(String crtName) {
        this.crtName = crtName;
    }

    /**
     * 获取更新时间
     *
     * @return upd_time - 更新时间
     */
    public Date getUpdTime() {
        return updTime;
    }

    /**
     * 设置更新时间
     *
     * @param updTime 更新时间
     */
    public void setUpdTime(Date updTime) {
        this.updTime = updTime;
    }

    /**
     * 获取更新用户
     *
     * @return upd_user - 更新用户
     */
    public String getUpdUser() {
        return updUser;
    }

    /**
     * 设置更新用户
     *
     * @param updUser 更新用户
     */
    public void setUpdUser(String updUser) {
        this.updUser = updUser;
    }

    /**
     * 获取更新人
     *
     * @return upd_name - 更新人
     */
    public String getUpdName() {
        return updName;
    }

    /**
     * 设置更新人
     *
     * @param updName 更新人
     */
    public void setUpdName(String updName) {
        this.updName = updName;
    }
}