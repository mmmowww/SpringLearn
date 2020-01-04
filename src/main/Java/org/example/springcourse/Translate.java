package org.example.springcourse;
import org.springframework.stereotype.Component;

public class Translate {
    public String str;
    public Translate(String str){
        this.str = "("+str+")";
    }
    public String run(){
        System.out.println(this.str);
        return str;
    }
}
