package org.example.controladores;

public class Alimentacion {

    private String tipoDeComida;
    private double gastos;

    public Alimentacion() {
    }

    public Alimentacion(String tipoDeComida, double gastos) {
        this.tipoDeComida = tipoDeComida;
        this.gastos = gastos;
    }

    public String getTipoDeComida() {
        return tipoDeComida;
    }

    public void setTipoDeComida(String tipoDeComida) {
        this.tipoDeComida = tipoDeComida;
    }

    public double getGastos() {
        return gastos;
    }

    public void setGastos(double gastos) {
        if(gastos>0){
            this.gastos = gastos;
        }else{
            System.out.println("No se aceptan valores negativos");
        }
    }
}
