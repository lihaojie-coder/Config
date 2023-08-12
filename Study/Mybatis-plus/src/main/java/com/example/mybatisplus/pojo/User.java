package com.example.mybatisplus.pojo;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;

@Data
public class User {
    @TableId(type = IdType.ASSIGN_ID)
    private Long id;
    private String name;
    private Integer age;
    private String email;

    @TableField(fill = FieldFill.INSERT)
    private Data create_time;
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Data update_time;

    @Version
    private Integer version;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Data getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Data create_time) {
        this.create_time = create_time;
    }

    public Data getUpdate_time() {
        return update_time;
    }

    public void setUpdate_time(Data update_time) {
        this.update_time = update_time;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }
}