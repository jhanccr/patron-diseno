package com.sprigngboot.stereotypes.ds;

public class Persona {
    private static String nombrePersona;
    private static String apellidoPaterno;
    private static String apellidoMaterno;
    private static int edad;
    private static double salario;
    private static String empresa;
    private static String direccion;

    public Persona(BuilderPersona builderPersona){
        this.nombrePersona = builderPersona.nombrePersona;
        this.apellidoPaterno = builderPersona.apellidoPaterno;
        this.apellidoMaterno = builderPersona.apellidoMaterno;
        this.edad = builderPersona.edad;
        this.salario = builderPersona.salario;
        this.empresa = builderPersona.empresa;
        this.direccion = builderPersona.direccion;
    }

    public static class BuilderPersona{

        private static String nombrePersona;
        private static String apellidoPaterno;
        private static String apellidoMaterno;
        private static int edad;
        private static double salario;
        private static String empresa;
        private static String direccion;

        public BuilderPersona(String nombrePersona, String apellidoPaterno, String apellidoMaterno){
            this.nombrePersona = nombrePersona;
            this.apellidoPaterno = apellidoPaterno;
            this.apellidoMaterno = apellidoMaterno;
        }

        public BuilderPersona edad(int edad){
            this.edad = edad;
            return this;
        }
        public BuilderPersona salario(double salario){
            this.salario = salario;
            return this;
        }
        public BuilderPersona empresa(String empresa){
            this.empresa = empresa;
            return this;
        }
        public BuilderPersona direccion(String direccion){
            this.direccion = direccion;
            return this;
        }


        public Persona build(){
            return new Persona(this);
        }

    }

}
