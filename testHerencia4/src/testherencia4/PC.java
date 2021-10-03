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
public class PC {
    private String codigo;
    private int precio;
    private String eslogan;

    public PC(String codigo, int precio, String eslogan) {
        this.codigo = codigo;
        this.precio = precio;
        this.eslogan = eslogan;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getEslogan() {
        return eslogan;
    }

    public void setEslogan(String eslogan) {
        this.eslogan = eslogan;
    }
    
    public String toString(){
        return "Codigo: "+this.codigo+" "+
                "Precio: "+this.precio+" "+
                "Eslogan: "+this.eslogan;
    }
}
