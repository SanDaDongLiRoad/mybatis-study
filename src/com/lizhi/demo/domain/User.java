package com.lizhi.demo.domain;

import java.io.Serializable;

/**
 * 用户
 *
 * @author xulizhi-lenovo
 * @date 2019/8/2
 */
public class User implements Serializable{

    private static final long serialVersionUID = -6829741594145389497L;
    /**
     * 用户ID
     */
    private int id;
    /**
     * 用户姓名
     */
    private String name;
    /**
     * 年龄
     */
    private int age;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
