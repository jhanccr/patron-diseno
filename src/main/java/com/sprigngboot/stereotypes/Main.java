package com.sprigngboot.stereotypes;

import com.sprigngboot.stereotypes.dao.ClienteDAO;
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

        AnnotationConfigApplicationContext context = getSpringContext("xls-reports");

        ClienteDAO clienteDAO = context.getBean(ClienteDAO.class);
        System.out.println(clienteDAO.crear());
        context.close();

    }

    private static AnnotationConfigApplicationContext getSpringContext(String profile) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.getEnvironment().setActiveProfiles(profile);
        context.register(Configuration.class);
        context.refresh();
        return context;
    }
}