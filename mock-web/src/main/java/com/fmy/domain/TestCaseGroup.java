package com.fmy.domain;

import java.util.Date;

/**
 * @description:
 * @author: fengmengyang
 * @date: 2018/5/1 13:35.
 */
public class TestCaseGroup {
    /**
     * 主键
     */
    private Integer id;

    /**
     * 应用名
     */
    private String appName;

    /**
     * 分组名
     */
    private String groupName;

    /**
     * 创建人
     */
    private String createUser;

    private Date createTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }
}
