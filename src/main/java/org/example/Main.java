package org.example;

import org.example.controladores.Alimentacion;
import org.example.controladores.Empleado;
import org.example.controladores.Hospedaje;
import org.example.controladores.Viaje;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entradaPorTeclado = new Scanner(System.in);
        Hospedaje objetoHospedaje = new Hospedaje();
        Alimentacion objetoAlimentacion = new Alimentacion();
        

        ArrayList<Empleado> empleados = new ArrayList<Empleado>();
        ArrayList<Viaje> viajes = new ArrayList<Viaje>();

        int option = 0;

        System.out.println();
        System.out.println("********VIATIKANDO********");
        System.out.println("**************************");

        do {
            System.out.println();
            System.out.println("****");
            System.out.println("Menu");
            System.out.println("****");
            System.out.println();
            System.out.println("1. Registrar empleado");
            System.out.println("2. Registrar viaje");
            System.out.println("3. Ver empleado");
            System.out.println("4. Ver viajes de un empleado");
            System.out.println("5. SALIR");

            System.out.println();
            System.out.print("Seleccione una opcion: ");

           option = entradaPorTeclado.nextInt();

           switch (option){

               case 1:

                       if (empleados.size()<10){
                           Empleado objetoEmpleado = new Empleado();

                               System.out.println();
                               System.out.print("Ingrese el Id del empleado: ");
                               objetoEmpleado.setId(entradaPorTeclado.nextInt());

                               System.out.print("Ingrese el nombre del empleado: ");
                               objetoEmpleado.setNombre(entradaPorTeclado.next());

                               System.out.print("Ingrese la edad: ");
                               objetoEmpleado.setEdad(entradaPorTeclado.nextInt());

                               System.out.print("Ingrese el cargo del empleado: ");
                               objetoEmpleado.setCargo(entradaPorTeclado.next());

                               System.out.print("Ingrese el valor del salario: ");
                               objetoEmpleado.setSalario(entradaPorTeclado.nextDouble());

                               empleados.add(objetoEmpleado);

                       }else{
                       System.out.println("Maximo de empleados ingresados por mes");
                       }
                   break;

               case 2:
                   if (viajes.size()<10){
                       Viaje objetoViaje = new Viaje();
                       Empleado objetoEmpleado = new Empleado();

                       System.out.println();

                       System.out.print("Ingrese el Id del empleado: ");
                       objetoEmpleado.setId(entradaPorTeclado.nextInt());

                       System.out.print("Ingrese la fecha de ida: ");
                       objetoViaje.setFechaIda(entradaPorTeclado.next());

                       System.out.print("Ingrese la fecha de regreso: ");
                       objetoViaje.setFechaRegreso(entradaPorTeclado.next());

                       System.out.print("Ingrese el origen: ");
                       objetoViaje.setOrigen(entradaPorTeclado.next());

                       System.out.print("Ingrese el destino: ");
                       objetoViaje.setDestino(entradaPorTeclado.next());

                       System.out.print("Ingrese el valor del tiquete: ");
                       objetoViaje.setValorTiquete(entradaPorTeclado.nextDouble());

                       viajes.add(objetoViaje);

                   }else{
                       System.out.println("Maximo de viajes ingresados por mes");
                   }
                   break;

               case 3:
                   System.out.println();
                   System.out.print("Ingrese el Id del empleado que desea ver: ");
                   int verEmpleado = entradaPorTeclado.nextInt();
                   boolean encontrado = false;



                   for (Empleado empleado:empleados){
                       if(empleado.getId() == verEmpleado){
                           encontrado = true;
                           System.out.println();
                           System.out.println("Se encontro un empleado con los siguientes datos: ");
                           System.out.println();
                           System.out.println("Id: "+ empleado.getId());
                           System.out.println("Nombre: "+empleado.getNombre());
                           System.out.println("Edad: "+empleado.getEdad());
                           System.out.println("Cargo: "+empleado.getCargo());
                           System.out.println("Salario: "+empleado.getSalario());
                           break;
                       }else {
                           encontrado = false;
                       }

                   }

                   if (!encontrado){
                       System.out.println("Empleado no fue encontrado");
                   }


                   break;

               case 4:
                   System.out.println();
                   System.out.print("Ingrese el Id del empleado del cual desea ver sus viajes: ");
                    int verViajesEmpledo = entradaPorTeclado.nextInt();

                    for (Empleado empleado:empleados){
                        for (Viaje viaje:viajes){
                            if (empleado.getId()==verViajesEmpledo){
                                System.out.println();
                                System.out.print("Se encontro un viaje asociado al empleado " +empleado.getNombre());
                                System.out.print(" con Id "+empleado.getId());
                                System.out.println();
                                System.out.println("Fecha de ida: "+viaje.getFechaIda());
                                System.out.println("Fecha de regreso: "+viaje.getFechaRegreso());
                                System.out.println("Origen: "+viaje.getOrigen());
                                System.out.println("Destino: "+viaje.getDestino());
                                System.out.print("Valor de los tiquetes: "+viaje.getValorTiquete());

                            }else {
                                System.out.println("El empleado no tiene viajes asosciados");
                            }
                        }
                    }
                   break;
                        default: System.out.println("Selecciona una opcion valida");
           }
        }while (option !=5);

    }

}
