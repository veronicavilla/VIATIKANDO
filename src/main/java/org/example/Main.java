package org.example;

import org.example.controladores.Alimentacion;
import org.example.controladores.Empleado;
import org.example.controladores.Hospedaje;
import org.example.controladores.Viaje;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    ArrayList <Empleado> empleados = new ArrayList<Empleado>();
    ArrayList <Viaje> viajes = new ArrayList<Viaje>();
    public static void main(String[] args) {
        Scanner entradaPorTeclado=new Scanner(System.in);
        Hospedaje objetoHospedaje =new Hospedaje();
        Alimentacion objetoAlimentacion =new Alimentacion();

        int option=0;

        do {
            System.out.println("--------------------");
            System.out.println("Menu");
            System.out.println("--------------------");
            System.out.println("1. Registra empleado");
            System.out.println("2. Registrar viaje");
            System.out.println("3. Ver empleados");
            System.out.println("4. Ver viajes de un empleado");
            System.out.println("5. SALIR");

            System.out.println("Seleccione una opcion: ");
            entradaPorTeclado.nextInt();

            switch (option) {
                case 1:

                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:

                    break;
                default:
                    System.out.println("Seleccione una opcion valida");

            }
            while (option != 5) {

            }
        }




        // Tiquetes



        // Hospedaje

        // Alimentación



