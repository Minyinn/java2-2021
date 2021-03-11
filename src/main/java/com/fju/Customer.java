package com.fju;;

public class Customer {
    public static void main(String[] args) {

        System.out.println("id      Cost    Sale    Total");
        Person[] persons = {
                new Person("0013", "490 ", "0   ", "490 "),
                new Person("0052", "1000", "100 ", "900 "),
                new Person("0081", "290 ", "0   ", "290 "),
                new Person("2122", "2000", "200 ", "1800")
        };
        for (int i = 0; i < persons.length; i++){
            persons[i].print();


        }
    }

}
