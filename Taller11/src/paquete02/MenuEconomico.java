/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete02;

/**
 *
 * @author Edgar Espinoza
 */
public class MenuEconomico extends Menu {
    private double descuento;
    
    public void establecerDescuento(double d) {
        descuento = (d * valorInicialMenu) / 100;
    }
    
    public double obtenerDescuento() {
        return descuento;
    }

    @Override
    public void establecerValorCancelarTotal() {
        valorMenu = valorInicialMenu - descuento;
    }

    @Override
    public String toString() {
        String cadena = String.format("------------------------------------------\n"
                + "Menu Economico\n%s\n", super.toString());

        cadena = String.format("%s"
                + "Descuento: %.2f\n",
                cadena,
                descuento);
        return cadena;
    }
}
