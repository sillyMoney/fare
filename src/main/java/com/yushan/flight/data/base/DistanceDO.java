package com.yushan.flight.data.base;

import com.yushan.flight.data.SimpleDO;

/**
 * Created by sillyfrog on 17-6-17.
 */
public class DistanceDO extends SimpleDO {

    /** 主键id*/
    private Long id;

    /** 出发城市三字码*/
    private String ori;

    /** 目的城市三字码*/
    private String dest;

    /** 航距*/
    private Integer dis;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOri() {
        return ori;
    }

    public void setOri(String ori) {
        this.ori = ori;
    }

    public String getDest() {
        return dest;
    }

    public void setDest(String dest) {
        this.dest = dest;
    }

    public Integer getDis() {
        return dis;
    }

    public void setDis(Integer dis) {
        this.dis = dis;
    }
}
