package org.example.S0612;

public class Main {

    public static void main(String[] args) {

        Person person = new Person("Javi", "Castillo", 28);

        GenericMethods gm = new GenericMethods(person, "Hellow", 12344);

        System.out.println(gm);
    }
}
