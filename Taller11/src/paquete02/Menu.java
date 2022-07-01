/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete02;

/**
 *
 * @author Edgar Espinoza
 */
public abstract class Menu {
    protected String nombrePlato;
    protected double valorMenu;
    protected double valorInicialMenu;

    public void establecerNomPlato(String n) {
        nombrePlato = n;
    }

    public void establecerValorMenu(double v) {
        valorMenu = v;
    }

    public void establecerValorInicialM(double v) {
        valorInicialMenu = v;
    }

    public abstract void establecerValorCancelarTotal();

    public String obtenerNombPlato() {
        return nombrePlato;
    }

    public double obtenerValorMenu() {
        return valorMenu;
    }

    public double obtenerValorInicialM() {
        return valorInicialMenu;
    }

    @Override
    public String toString() {
        String c = String.format("Nombre del plato: %s\n"
                + "Valor del menu inicial: %.2f\n",
                 obtenerNombPlato(),
                 obtenerValorInicialM());
        return c;
    }
}
