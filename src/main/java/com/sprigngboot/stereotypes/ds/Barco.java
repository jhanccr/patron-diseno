package com.sprigngboot.stereotypes.ds;

public class Barco implements Transporte {

    @Override
    public void enviar() {
        System.out.println("Barco enviando...");
    }
}
