package com.pactera.actionReport.dao;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Repository;

import java.util.Date;



@Repository
public class User {
    private Date data_date; //数据日期
    private String country;
    private String province;
    private String city;
    private String count;
    private String usercount;
    private String pageid;
    private String actionid;


    public void setData_date(Date data_date) {
        this.data_date = data_date;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setCount(String count) {
        this.count = count;
    }

    public void setUsercount(String usercount) {
        this.usercount = usercount;
    }

    public void setPageid(String pageid) {
        this.pageid = pageid;
    }

    public void setActionid(String actionid) {
        this.actionid = actionid;
    }

    public Date getData_date() {
        return data_date;
    }

    public String getCountry() {
        return country;
    }

    public String getProvince() {
        return province;
    }

    public String getCity() {
        return city;
    }

    public String getCount() {
        return count;
    }

    public String getUsercount() {
        return usercount;
    }

    public String getPageid() {
        return pageid;
    }

    public String getActionid() {
        return actionid;
    }
}
