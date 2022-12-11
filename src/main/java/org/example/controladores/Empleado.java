package org.example.controladores;

import java.util.ArrayList;
import java.util.Scanner;

public class Empleado {
    Scanner entradaPorteclado = new Scanner(System.in);

    private String nombre;
    private int id;
    private int edad;
    private String cargo;
    private double salario;

    public Empleado() {
    }

    public Empleado(Scanner entradaPorteclado, String nombre, int id, int edad, String cargo, double salario) {
        this.entradaPorteclado = entradaPorteclado;
        this.nombre = nombre;
        this.id = id;
        this.edad = edad;
        this.cargo = cargo;
        this.salario = salario;
    }

    public Scanner getEntradaPorteclado() {
        return entradaPorteclado;
    }

    public void setEntradaPorteclado(Scanner entradaPorteclado) {
        this.entradaPorteclado = entradaPorteclado;
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
        while (edad <= 17) {
            System.out.print("El empleado debe ser mayor de edad, ingrese la edad correcta: ");
            edad = entradaPorteclado.nextInt();
        }
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

    public void mostrarEmpleado(){
        System.out.println("Identificacion: "+this.id);
        System.out.println("Nombre: "+this.nombre);
        System.out.println("Edad: "+this.edad);
        System.out.println("Cargo: "+this.cargo);
        System.out.println("Salario: "+this.salario);
    }
//    public Empleado mostrarEmpleado(ArrayList<Empleado> empleados, String id){
//        Empleado empleadoMostrado = null;
//        for (Empleado empleado:empleados){
//            if (empleado.getId().equals(id)){
//                empleadoMostrado = empleado;
//                break;
//            }
//        }
//        return empleadoMostrado;
//    }





    }



