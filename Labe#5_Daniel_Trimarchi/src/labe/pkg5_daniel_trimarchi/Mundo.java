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
public class Mundo {
    private int Peso_tor;
    private String N_Tortuga;
    private ArrayList <Criaturas> criaturas=new ArrayList();

    public Mundo(int Peso_tor, String N_Tortuga) {
        this.Peso_tor = Peso_tor;
        this.N_Tortuga = N_Tortuga;
    }

    public int getPeso_tor() {
        return Peso_tor;
    }

    public void setPeso_tor(int Peso_tor) {
        this.Peso_tor = Peso_tor;
    }

    public String getN_Tortuga() {
        return N_Tortuga;
    }

    public void setN_Tortuga(String N_Tortuga) {
        this.N_Tortuga = N_Tortuga;
    }

    public ArrayList<Criaturas> getCriaturas() {
        return criaturas;
    }

    public void setCriaturas(ArrayList<Criaturas> criaturas) {
        this.criaturas = criaturas;
    }

    @Override
    public String toString() {
        return N_Tortuga ;
    }
    
    
}
