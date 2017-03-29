package com.ht.main;

/**
 * Created by Administrator on 2017/3/21.
 */
public class UserDomain extends  BaseDomain {

    private  Integer id;
    private  String uname;
    private  String sex;



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }



}
