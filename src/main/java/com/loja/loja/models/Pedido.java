package com.loja.loja.models;

import java.time.LocalDateTime;

public class Pedido {

    private int idCliente;
    private double valorTotal;
    private LocalDateTime dat;

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public LocalDateTime getDat() {
        return dat;
    }

    public void setDat(LocalDateTime dat) {
        this.dat = dat;
    }

}
