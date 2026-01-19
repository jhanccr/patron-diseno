package com.sprigngboot.stereotypes;

import com.sprigngboot.stereotypes.dao.ClienteDAO;
import com.sprigngboot.stereotypes.dao.TransporteFactory;
import com.sprigngboot.stereotypes.ds.Persona;
import com.sprigngboot.stereotypes.ds.Transporte;
import com.sprigngboot.stereotypes.ds.Usuario;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Usuario user = new Usuario.UsuarioBuilder("Juan", "Pérez")
                //.email("juan@ejemplo.com")
                .edad(30)
                .build();
        System.out.println(user.toString());

        Persona persona = new Persona.BuilderPersona("Jose", "Lopez","Ruiz")
                .edad(40)
                .empresa("SCB")
                .direccion("AV. JUAN DE ARONA")
                .salario(3500.90)
                .build();
        System.out.println(persona.toString());

        TransporteFactory fabrica = new TransporteFactory();
        Transporte trasporte = fabrica.getInstance("Camion");
        trasporte.enviar();

        AnnotationConfigApplicationContext context = getSpringContext();

        ClienteDAO clienteDAO = context.getBean(ClienteDAO.class);
        System.out.println(clienteDAO.crear());
        context.close();

    }

    private static AnnotationConfigApplicationContext getSpringContext() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(Configuration.class);
        context.refresh();
        return context;
    }
}