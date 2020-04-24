package com.company;

import java.util.Scanner;

public class AgeInFiveYears {
    public void calculateAge(){
        Scanner s = new Scanner(System.in);

        int age;
        String name;

        System.out.println("Hello. what is your name?");
        name = s.nextLine();

        System.out.println("Hi, " + name + "!" + " How old are you?" );
        age = s.nextInt();

        System.out.println("Did you know that in five years you will be " + addAge(age) + " years old?" );

        System.out.println("And five years ago you were " + subAge(age) + " imagine that!");

    }

    public int addAge(int age){
        int total5;
        total5 = age + 5;
        return total5;

    }

    public int subAge(int age){
        int total5;
        total5 = age - 5;
        return total5;
    }
}
