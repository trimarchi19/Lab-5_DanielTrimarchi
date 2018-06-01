/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labe.pkg5_daniel_trimarchi;

/**
 *
 * @author X
 */
public class Criaturas {
    private int peso_cria;
    private int edad_max;
    private int energia;
    private String region;
    private int cant_vivas;
    private String raza;
    public Criaturas() {
    }

    public Criaturas(int peso_cria, int edad_max, int energia, String region, int cant_vivas, String raza) {
        this.peso_cria = peso_cria;
        this.edad_max = edad_max;
        this.energia = energia;
        this.region = region;
        this.cant_vivas = cant_vivas;
        this.raza = raza;
        System.out.println("");
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
    

 

    public int getPeso_cria() {
        return peso_cria;
    }

    public void setPeso_cria(int peso_cria) {
        this.peso_cria = peso_cria;
    }

    public int getEdad_max() {
        return edad_max;
    }

    public void setEdad_max(int edad_max) {
        this.edad_max = edad_max;
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public int getCant_vivas() {
        return cant_vivas;
    }

    public void setCant_vivas(int cant_vivas) {
        this.cant_vivas = cant_vivas;
    }

    @Override
    public String toString() {
        return raza ;
    }
    
}
