package com.aric.redis.spring.entity;

import java.io.Serializable;

/**
 * 需要序列化
 * Created by liyuanjun on 16-11-25.
 */
public class User implements Serializable{

    private Integer id;
    private String username;

    public User(){}
    public User(Integer id,String username){
        this.id=id;
        this.username=username;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                '}';
    }
}
