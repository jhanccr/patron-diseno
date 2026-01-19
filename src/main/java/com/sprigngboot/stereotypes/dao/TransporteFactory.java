package com.sprigngboot.stereotypes.dao;

import com.sprigngboot.stereotypes.ds.Barco;
import com.sprigngboot.stereotypes.ds.Camion;
import com.sprigngboot.stereotypes.ds.Transporte;

public class TransporteFactory {

    public Transporte getInstance(String tipo){
        if(tipo.equals("Camion")){
            return new Camion();
        }else if(tipo.equals("Barco")){
            return new Barco();
        }
        throw new IllegalArgumentException("Tipo de transporte desconocido");
    }
}
