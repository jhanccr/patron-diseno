package com.sprigngboot.stereotypes.ds;

public class Camion implements Transporte {

    @Override
    public void enviar() {
        System.out.println("Camion enviando...");
    }
}
