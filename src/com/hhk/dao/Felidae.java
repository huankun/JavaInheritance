package com.hhk.dao;

/**
 * @author: Kun Hong
 * @create: 20/6/2022 下午 9:54
 **/
public class Felidae extends Animal{

    public Felidae(Integer age, Integer weight) {
        super(age, weight);
    }

    public void sound(){
        System.out.println("meowing meowing");
    }
}
