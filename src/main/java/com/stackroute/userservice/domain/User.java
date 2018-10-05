package com.stackroute.userservice.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class User {

    @Id
    private int id;//Rest service has to be divided into layers:controller(request response),service (logic)and repository(database).
    private int age;//,Entities will be unique
    private String name;// domain have two kinds of objects :-Entity and value object


    public User(int id, int age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }

    public User() {
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
