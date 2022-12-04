package org.example.controladores;

public class Empleado {

    private String nombre;
    private int id;
    private int edad;
    private String cargo;
    private double salario;

    public Empleado() {
    }

    public Empleado(String nombre, int id, int edad, String cargo, double salario) {
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if(edad<18){
        System.out.println("El empleado es menor de edad");
    }else{
        this.edad=edad;
    }
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


    public void mostrarEmpleado(){
        System.out.println("Identificacion: "+this.id);
        System.out.println("Nombre: "+this.nombre);
        System.out.println("Edad: "+this.edad);
        System.out.println("Cargo: "+this.cargo);
        System.out.println("Salario: "+this.salario);
    }
    }



