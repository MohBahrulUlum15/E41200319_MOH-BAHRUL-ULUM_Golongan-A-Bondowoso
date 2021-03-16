/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.belajarkoding.workshop;

/**
 *
 * @author My Computer
 */

class book{
    int price;
    int pages;
    String name;
    
    public void set(String name, int price, int pages){
        this.name = name;
        this.price = price;
        this.pages = pages;
    }
    
    public void show(){
        System.out.println("books information");
        System.out.println("books name : " +name);
        System.out.println("books price : " +price);
        System.out.println("number of pages : " +pages);
    }
    
}

public class latihan3 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        book javabook = new book();
        javabook.set("jadul", 60000, 100);
        javabook.show();
    }
    
}
