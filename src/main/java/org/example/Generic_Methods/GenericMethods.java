package org.example.Generic_Methods;

public class GenericMethods {

    public <T> GenericMethods(T first, T second, T third){
        System.out.println("The first element is: " + first);
        System.out.println("The second element is: " + second);
        System.out.println("The third element is: " + third);
    }
}
