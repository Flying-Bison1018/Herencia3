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
public class Sobremesa extends PC{
    private String tipoTorre;
    
    public Sobremesa(String codigo,int precio,String eslogan,String tipoTorre ){
        super(codigo,precio,eslogan);
        this.tipoTorre=tipoTorre;
        
    }

    public String getTipoTorre() {
        return tipoTorre;
    }

    public void setTipoTorre(String tipoTorre) {
        this.tipoTorre = tipoTorre;
    }
    
    public String toString(){
        return super.toString()+" "+
                "Tipo Torre: "+this.tipoTorre;
    }
}
