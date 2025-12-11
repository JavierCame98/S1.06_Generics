package org.example.S0612;

public class GenericMethods {

    public <A, B, C> GenericMethods(A first, B second, C third){
        System.out.println("The first element is: " + first);
        System.out.println("The second element is: " + second);
        System.out.println("The third element is: " + third);
    }
}
