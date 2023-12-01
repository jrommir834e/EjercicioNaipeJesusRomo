/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package daw;

/**
 *
 * @author jesus
 */
public enum Palos {
    
    ORO("Oro"),
    BASTOS("Basto"),
    ESPADA("Espada"),
    COPAS("Copas");

    private Palos(String nombrePalo) {
        this.nombrePalo = nombrePalo;
    }

    public static Palos getORO() {
        return ORO;
    }

    public static Palos getBASTOS() {
        return BASTOS;
    }

    public static Palos getESPADA() {
        return ESPADA;
    }

    public static Palos getCOPAS() {
        return COPAS;
    }

    public String getNombrePalo() {
        return nombrePalo;
    }
    
    
    
    private String nombrePalo;
}
