package com.sprigngboot.stereotypes.ds;

import org.springframework.stereotype.Component;

@Component("sms")
public class SmsService implements NotificacionService {
    public void notificar(String mensaje) {
        System.out.println("Notificacion por SMS" +  mensaje);
    }
}
