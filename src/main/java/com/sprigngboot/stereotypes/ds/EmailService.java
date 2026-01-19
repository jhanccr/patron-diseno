package com.sprigngboot.stereotypes.ds;

import org.springframework.stereotype.Component;

@Component("email")
public class EmailService implements NotificacionService {
    @Override
    public void notificar(String mensaje) {
        System.out.println("Notificacion por email" +  mensaje);
    }
}
