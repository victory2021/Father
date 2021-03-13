package com.company;

public class Mother  extends Famyly implements Printable{

    private String home;

    public Mother(String name,int age,String home) {
        super(name, age);
        this.home = home;
    }

    public String getHome() {
        return home;
    }

    public void setHome(String home) {
        this.home = home;
    }

    @Override
    public void print() {
        System.out.println("Name " + getName() + "age " + getAge() + " home " + getHome());
        return;
    }
}
