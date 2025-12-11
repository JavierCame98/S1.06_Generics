package org.example.S0611;

public class NoGenericMethods {

    private String Element1;
    private String Element2;
    private String Element3;

    public NoGenericMethods (String Element3, String Element1, String Element2){
        this.Element1 = Element1;
        this.Element2 = Element2;
        this.Element3 = Element3;
    }

    public String getElement1() {
        return Element1;
    }

    public String getElement2() {
        return Element2;
    }

    public String getElement3() {
        return Element3;
    }

    public void setFirst(String Element1) {
        this.Element1 = Element1;
    }

    public void setSecond(String Element2) {
        this.Element2 = Element3;
    }

    public void setThird(String Element3) {
        this.Element3 = Element3;
    }

    @Override
    public String toString() {
        return "NoGenericMethods{" +
                "first='" + Element1 + '\'' +
                ", second='" + Element2 + '\'' +
                ", third='" + Element3 + '\'' +
                '}';
    }

}
