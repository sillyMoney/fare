package com.yushan.flight.data;

import java.util.Date;

/**
 * Created by sillyfrog on 17-6-17.
 * 所有数据表共同的数据
 */
public class SimpleDO {

    /** 逻辑删除标识位*/
    private String delFlag = "0";

    /** 创建用户*/
    private String createUser;

    /** 创建时间*/
    private Date createTime;

    /** 删除用户*/
    private String disUser;

    /** 删除时间*/
    private Date disTime;

    /** 上一条数据*/
    private String lastId;

    public String getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag;
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

    public String getDisUser() {
        return disUser;
    }

    public void setDisUser(String disUser) {
        this.disUser = disUser;
    }

    public Date getDisTime() {
        return disTime;
    }

    public void setDisTime(Date disTime) {
        this.disTime = disTime;
    }

    public String getLastId() {
        return lastId;
    }

    public void setLastId(String lastId) {
        this.lastId = lastId;
    }
}
