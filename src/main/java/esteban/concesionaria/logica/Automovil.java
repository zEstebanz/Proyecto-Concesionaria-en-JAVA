/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package esteban.concesionaria.logica;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity 
public class Automovil implements Serializable {
    @Id 
    @GeneratedValue(strategy=GenerationType.AUTO) //Generacion de valor aleatorio 
    private int id;
    private String modelo;
    private String marca;
    private String motor;
    private String color;
    private String patente;
    //private int Puertas;

    public Automovil() {
      
    }

    public Automovil(int id, String modelo, String marca, String motor, String color, String patente, int Puertas) {
        this.id = id;
        this.modelo = modelo;
        this.marca = marca;
        this.motor = motor;
        this.color = color;
        this.patente = patente;
        //this.Puertas = Puertas;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    /*public int getCantPuertas() {
       return Puertas;
    }

    public void setCantPuertas(int Puertas) {
        this.Puertas = Puertas;
    } 

    void setPuertas(SingularAttribute<Automovil, Integer> Puertas) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    } */

}
