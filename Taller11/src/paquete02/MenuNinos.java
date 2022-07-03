/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete02;

/**
 *
 * @author Edgar Espinoza
 */
public class MenuNinos extends Menu {
    private double valorHelado;
    private double valorPastel;

    public void establecerValorHelado(double v) {
        valorHelado = v;
    }

    public void establecerValorPastel(double v) {
        valorPastel = v;
    }

    @Override
    public void establecerValorCancelarTotal() {
        valorMenu = valorInicialMenu + valorHelado + valorPastel;
    }

    public double obtenerValorHelado() {
        return valorHelado;
    }

    public double obtenerValorPastel() {
        return valorPastel;
    }

    @Override
    public String toString() {
        String cadena = String.format("------------------------------------------\n"
                + "Menu Para Niños\n%s\n", super.toString());

        cadena = String.format("%s"
                + "Valor Helado: %.2f\n"
                + "Valor Pastel: %.2f\n",
                cadena,
                valorHelado,
                valorPastel);
        return cadena;
    }
}
