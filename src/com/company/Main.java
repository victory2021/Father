package com.company;

import java.io.PrintStream;

public class Main {

    public static void main(String[] args) {
	creactObject("Father");
	creactObject("Mother");
	creactObject("Brother");
    }public static Famyly creactObject(String className) {
        Father father = new Father("Akyl", 55, "Kia");
        switch (className) {
            case "Father":
                father.print();
                return father;
            case "Mother":
                Mother mother = new Mother("Aaa", 45, "Dom");
                mother.print();
                return mother;


            case "Brother":
                Brother brother = new Brother("Nurik", 30, 176.5);
                brother.print();


        }
        return null;


    }}
