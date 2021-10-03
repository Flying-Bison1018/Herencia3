/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testherencia4;

/**
 *
 * @author PC
 */
public class Portatiles extends PC{
    private int peso;
    
    public Portatiles(String codigo, int precio, String eslogan, int peso){
        super(codigo,precio,eslogan);
        this.peso=peso;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
    
    public String toString(){
        return super.toString()+" "+
                "Peso: "+this.peso;
    }
}
