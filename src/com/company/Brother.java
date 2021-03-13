package com.company;

public class Brother  extends Famyly implements Printable{
    private double rost;

    public Brother(String name, int age, double rost) {
        super(name, age);
        this.rost = rost;
    }

    public double getRost() {
        return rost;
    }

    public void setRost(double rost) {
        this.rost = rost;
    }

    @Override
    public void print() {
        System.out.println("name " + getName() + " age " +getAge() + " rost " + getRost());
        return;
    }
}
