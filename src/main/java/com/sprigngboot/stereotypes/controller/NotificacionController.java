package com.sprigngboot.stereotypes.controller;

import com.sprigngboot.stereotypes.dao.NotificacionFactory;
import com.sprigngboot.stereotypes.ds.NotificacionService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/notificar")
public class NotificacionController {
    private final NotificacionFactory notificacionFactory;

    public NotificacionController(NotificacionFactory notificacionFactory) {
        this.notificacionFactory = notificacionFactory;
    }

    @GetMapping
    public void enviar( @PathVariable String tipo, @RequestParam String msg) {
        NotificacionService notificacion = notificacionFactory.getInstancia("sms");
        notificacion.notificar("mensajito chingon");
    }
}
