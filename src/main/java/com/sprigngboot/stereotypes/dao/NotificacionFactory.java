package com.sprigngboot.stereotypes.dao;

import com.sprigngboot.stereotypes.ds.NotificacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class NotificacionFactory {

    @Autowired
    private Map<String, NotificacionService> notificaciones;

    public NotificacionService getInstancia(String tipo) {
        NotificacionService notificacionService = notificaciones.get(tipo.toLowerCase());
        if (notificacionService == null) {
            throw new IllegalArgumentException("No se encontro el notificacion con tipo " + tipo);
        }
        return notificacionService;
    }


}
