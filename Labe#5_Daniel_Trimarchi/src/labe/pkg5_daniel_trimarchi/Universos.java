/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labe.pkg5_daniel_trimarchi;

import java.util.ArrayList;

/**
 *
 * @author X
 */
public class Universos {
    private String Codigo;
    private int edad;
    private int peso;
    ArrayList<Mundo> Mundos= new ArrayList();

    public Universos() {
    }

    public Universos(String Codigo, int edad, int peso) {
        this.Codigo = Codigo;
        this.edad = edad;
        this.peso = peso;
    }

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public ArrayList<Mundo> getMundos() {
        return Mundos;
    }

    public void setMundos(ArrayList<Mundo> Mundos) {
        this.Mundos = Mundos;
    }

    @Override
    public String toString() {
        return "Universos{" + "Mundos=" + Mundos + '}';
    }
    
}
