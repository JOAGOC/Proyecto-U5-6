/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Angel
 */
class Producto {
    private String nombre;
    private float val;
    private TIPO_DIVISA t;
    private int id;

    public Producto(String nombre, float val, TIPO_DIVISA t, int id) {
        this.nombre = nombre;
        this.val = val;
        this.t = t;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public float getVal() {
        return val;
    }
    
    public String getValS() {
        return val+" "+t.getNombreDivisa();
    }

    public TIPO_DIVISA getT() {
        return t;
    }
    
    public float getRelativeVal(){
        return t.getValorRelativo() * val;
    }
}
