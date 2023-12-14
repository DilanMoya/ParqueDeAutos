/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.parquedeautoss;

/**
 *
 * @author xpro3
 */
public class Auto {
    private String placa;
    private String modelo;
    private double valor;
    
    public Auto(String placa, String modelo, double valor){
        this.modelo=modelo;
        this.placa=placa;
        this.valor=valor;
    }
    public double getValor(){
        return valor;
    }
}
