package org.example.Non_Generic_Methods;

public class Main {

    public static void main(String[] args) {

        System.out.println("##Checking that the arguments can be put in a different order");

        NoGenericMethods ngm1 = new NoGenericMethods("Albacete", "Barcelona", "Cáceres");
        System.out.println(ngm1);
        NoGenericMethods ngm2 = new NoGenericMethods("Cáceres", "Albacete", "Barcelona");
        System.out.println(ngm2);

        System.out.println("##Checking setters and getters");

        ngm1.setFirst("Madrid");
        ngm1.setSecond("Oviedo");
        ngm1.setThird("Sevilla");
        System.out.println(ngm1);

        System.out.println("First city: " + ngm1.getElement1());
        System.out.println("Second city: " + ngm1.getElement2());
        System.out.println("Third city: " + ngm1.getElement3());


    }
}
