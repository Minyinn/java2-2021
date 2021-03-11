package com.fju;

public class Person {
    String id;
    String cost;
    String sale;
    String total;
    public Person(String id, String cost, String sale, String total){
        this.id = id;
        this.cost = cost;
        this.sale = sale;
        this.total = total;
    }
    public void print() {

        System.out.println(id + "\t" + cost + "\t" + sale + "\t" + total + "\t");
    }
}
