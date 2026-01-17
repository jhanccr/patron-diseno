package com.sprigngboot.stereotypes.ds;

public class Usuario {
    private final String nombre;
    private final String apellido;
    private final String email;
    private final int edad;

    public Usuario(UsuarioBuilder usuarioBuilder) {
        this.nombre = usuarioBuilder.nombre;
        this.apellido = usuarioBuilder.apellido;
        this.email = usuarioBuilder.email;
        this.edad = usuarioBuilder.edad;
    }

    public static class UsuarioBuilder{
        private final String nombre;
        private final String apellido;
        private String email;
        private int edad;

        public UsuarioBuilder (String nombre, String apellido) {
            this.nombre = nombre;
            this.apellido = apellido;
        }

        public UsuarioBuilder email(String email) {
            this.email = email;
            return this;
        }

        public UsuarioBuilder edad(int edad) {
            this.edad = edad;
            return this;
        }

        public Usuario build() {
            return new Usuario(this);
        }
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", email='" + email + '\'' +
                ", edad=" + edad +
                '}';
    }
}
