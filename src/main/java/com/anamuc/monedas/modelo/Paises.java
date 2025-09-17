package com.anamuc.monedas.modelo;

/* author: moleculax
* Emilio J. Gomez
*  */
public class Paises {
    private String codigo;
    private String moneda;
    private String pais;
    private String cotizacion;

    public Paises(String codigo, String moneda, String pais) {
        this.codigo = codigo;
        this.moneda = moneda;
        this.pais = pais;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getMoneda() {
        return moneda;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getCotizacion() {
        return cotizacion;
    }

    public void setCotizacion(String cotizacion) {
        this.cotizacion = cotizacion;
    }
}// END  Class
