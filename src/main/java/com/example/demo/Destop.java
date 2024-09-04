package com.example.demo;


import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component

public class Destop implements Computer {
    public void compile(){
        System.out.println("Compilling with 404 bugs but faster");
    }
}
