package org.example.controladores;

public class Hospedaje {

    private String fechaDeCheckin;
    private String fechaDeCheckout;
    private double valor;

    public Hospedaje() {
    }

    public Hospedaje(String fechaDeCheckin, String fechaDeCheckout, double valor) {
        this.fechaDeCheckin = fechaDeCheckin;
        this.fechaDeCheckout = fechaDeCheckout;
        this.valor = valor;
    }

    public String getFechaDeCheckin() {
        return fechaDeCheckin;
    }

    public void setFechaDeCheckin(String fechaDeCheckin) {
        this.fechaDeCheckin = fechaDeCheckin;
    }

    public String getFechaDeCheckout() {
        return fechaDeCheckout;
    }

    public void setFechaDeCheckout(String fechaDeCheckout) {
        this.fechaDeCheckout = fechaDeCheckout;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
