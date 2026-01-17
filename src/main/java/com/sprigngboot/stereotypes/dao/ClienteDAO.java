package com.sprigngboot.stereotypes.dao;

import com.sprigngboot.stereotypes.ds.Cliente;
import org.springframework.stereotype.Service;

@Service
public class ClienteDAO {
    public Cliente crear(){
        System.out.println("Creando Cliente");
        return Cliente.builder()
                .nombre("Juanito")
                .apelido("pruebita")
                .email("juanitoxxx@xxxx")
                .build();
    }
}
