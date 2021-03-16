/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.belajarkoding;

/**
 *
 * @author My Computer
 */

class Person{

    String getName;
    int getAge;

    Person(String getName, int getAge){
        this.getName = getName;
        this.getAge = getAge;
    }
    
    public int getAge() {
        return getAge;
    }
}

public class ManagingPeople {
    public static void main(String[] args) {
        
        Person p1 = new Person("Arial", 37);
        Person p2 = new Person("Joseph", 15);

        if(p2.getAge() == p1.getAge())
        {
            System.out.println(p1.getName +" is the same age as "+ p2.getName);
        }
        else
        {
            System.out.println(p1.getName +" is NOT the same age as "+ p2.getName);
        }
    }  
}
