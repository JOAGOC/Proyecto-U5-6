/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Angel
 */
public enum TIPO_DIVISA {
    Peso("MXN",1), Dolar("USD", (float) 20.96), Euro("€", (float) 23.69), LibraEsterlina("£", (float) 27.73), YenJaponés("¥", (float) 0.18), FrancoSuizo("Fr", (float) 22.68);
    
    private String nombreDivisa;
    private float valorRelativo;

    private TIPO_DIVISA(String nombreDivisa, float valorRelativo){
        this.nombreDivisa = nombreDivisa;
        this.valorRelativo = valorRelativo;
    }

    public String getNombreDivisa() {
        return nombreDivisa;
    }

    public float getValorRelativo() {
        return valorRelativo;
    }
}
