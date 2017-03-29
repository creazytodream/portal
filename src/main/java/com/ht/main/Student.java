package com.ht.main;

/**
 * Created by Administrator on 2017/3/22.
 */
public class Student {
    private String name;
    private String sex;
    private String date;
    private int count;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public Student(String name, String sex, String date, int count) {
        this.name = name;
        this.sex = sex;
        this.date = date;
        this.count = count;
    }
}
