package org.example.controladores;

public class Transporte {

    private String fechaIda;
    private String fechaRegreso;
    private String internacional;
    private String nacional;
    private String origen;
    private String destino;
    private double valorTiquete;

    public Transporte() {
    }

    public Transporte(String fechaIda, String fechaRegreso, String internacional, String nacional, String origen, String destino, double valorTiquete) {
        this.fechaIda = fechaIda;
        this.fechaRegreso = fechaRegreso;
        this.internacional = internacional;
        this.nacional = nacional;
        this.origen = origen;
        this.destino = destino;
        this.valorTiquete = valorTiquete;
    }

    public String getFechaIda() {
        return fechaIda;
    }

    public void setFechaIda(String fechaIda) {
        this.fechaIda = fechaIda;
    }

    public String getFechaRegreso() {
        return fechaRegreso;
    }

    public void setFechaRegreso(String fechaRegreso) {
        this.fechaRegreso = fechaRegreso;
    }

    public String getInternacional() {
        return internacional;
    }

    public void setInternacional(String internacional) {
        internacional = internacional;
    }

    public String getNacional() {
        return nacional;
    }

    public void setNacional(String nacional) {
        nacional = nacional;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        destino = destino;
    }

    public double getValorTiquete() {
        return valorTiquete;
    }

    public void setValorTiquete(double valorTiquete) {
        this.valorTiquete = valorTiquete;
    }
}
