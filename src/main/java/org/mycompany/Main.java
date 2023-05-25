package org.mycompany;

public class Main {
    public static void main(String[] args) {
        Coche myCoche = new Coche();
        myCoche.agregarPuerta();
        System.out.println(myCoche.puertas);
    }
}

class Coche {
    int puertas = 0;

    public void agregarPuerta(){
        this.puertas++;
    }

}