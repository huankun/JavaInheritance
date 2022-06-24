package com.hhk.dao;

/**
 * @author: Kun Hong
 * @create: 20/6/2022 下午 9:49
 **/
public class Animal {
    private Integer age;

    private Integer weight;

    public void run(){
        System.out.println("run run");
    }

    public void sleep(){
        System.out.println("sleep sleep");
    }

    public Animal(Integer age, Integer weight) {
        this.age = age;
        this.weight = weight;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }
}
