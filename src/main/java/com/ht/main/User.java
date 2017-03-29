package com.ht.main;

/**
 * Created by Administrator on 2017/3/22.
 */
public class User {

    private  String id;
    private  String name;
    private  String age;
    private  String address;
    private  String password;
    private  int sex;


    public User(String id, String name, String age, String address, String password, int sex) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
        this.password = password;
        this.sex = sex;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }
}
