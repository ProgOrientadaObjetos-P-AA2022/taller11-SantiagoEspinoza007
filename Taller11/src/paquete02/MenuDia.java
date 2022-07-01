/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete02;

/**
 *
 * @author Edgar Espinoza
 */
public class MenuDia extends Menu {

    private double valorPostre;
    private double valorBebida;

    public double obtenerValorPostre() {
        return valorPostre;
    }

    public void establecerValorPostre(double v) {
        valorPostre = v;
    }

    public double obtenerValorBebida() {
        return valorBebida;
    }

    public void establecerValorBebida(double v) {
        valorBebida = v;
    }

    @Override
    public void establecerValorCancelarTotal() {
        valorMenu = valorInicialMenu + valorPostre + valorBebida;
    }

    @Override
    public String toString() {
        String cadena = String.format("------------------------------------------\n"
                + "Menu Del Dia\n%s\n", super.toString());

        cadena = String.format("%s"
                + "Valor Del Postre: %.2f\n"
                + "Valor bebida: %.2f\n",
                cadena,
                valorPostre,
                valorBebida);
        return cadena;
    }
}
