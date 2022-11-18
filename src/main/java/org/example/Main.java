package org.example;

import org.example.controladores.Alimentacion;
import org.example.controladores.Empleado;
import org.example.controladores.Hospedaje;
import org.example.controladores.Transporte;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner entradaPorTeclado=new Scanner(System.in);
        Empleado objetoEmpleado =new Empleado();
        Transporte objetoTransporte =new Transporte();
        Hospedaje objetoHospedaje =new Hospedaje();
        Alimentacion objetoAlimentacion =new Alimentacion();

        System.out.println("--------------------");
        System.out.println("Menu");
        System.out.println("--------------------");
        System.out.println("0. SALIR");
        System.out.println("1. Registra empleado");
        System.out.println("2. Registrar viaje");
        System.out.println("3. Ver empleados");
        System.out.println("4. Ver viajes de un empleado");
    }
}
