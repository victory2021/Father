package com.company;

public class Father extends Famyly implements Printable{
    private String car;


    public Father(String name, int age, String car) {
        super(name, age);
        this.car = car;
    }

    public String getCar() {
        return car;
    }

    public void setCar(String car) {
        this.car = car;
    }

    @Override
    public void print() {
        System.out.println("Name: " + getName()+ " age: " + getAge() + " Car: " + getCar());
        return ;
    }
}
