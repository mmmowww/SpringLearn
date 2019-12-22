package org.example.springcourse;

public class MyTestBean {
    public String name;
    public MyTestBean(String name){
        this.name = name;
    }
    public String GET(){
        return this.name;
    }
    public String SET(String name){
        this.name = name;
        return this.name;
    }
}
