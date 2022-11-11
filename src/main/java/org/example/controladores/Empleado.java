package org.example.controladores;

public class Empleado {

    private String nombre;
    private String id;
    private int edad;
    private String cargo;
    private double salario;

    public Empleado() {
    }

    public Empleado(String nombre, String id, int edad, String cargo, double salario) {
        this.nombre = nombre;
        this.id = id;
        this.edad = edad;
        this.cargo = cargo;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}



