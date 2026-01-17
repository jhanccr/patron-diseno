package com.sprigngboot.stereotypes.ds;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class Cliente {
    private String nombre;
    private String apelido;
    private String email;
    private String telefone;
    private int edad;
    private double peso;

    @Override
    public String toString() {
        return "Cliente{" +
                "nombre='" + nombre + '\'' +
                ", apelido='" + apelido + '\'' +
                ", email='" + email + '\'' +
                ", telefone='" + telefone + '\'' +
                ", edad=" + edad +
                ", peso=" + peso +
                '}';
    }
}
