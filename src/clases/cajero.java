/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author monica
 */
public class cajero {
        public String nombre;
        public String sucursal;

    public cajero(String nombre, String sucursal) {
        this.nombre = nombre;
        this.sucursal = sucursal;
    }
        
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSucursal() {
        return sucursal;
    }

    public void setSucursal(String sucursal) {
        this.sucursal = sucursal;
    }
        
        
}
