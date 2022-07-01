/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete01;

import java.util.ArrayList;
import paquete02.Menu;

/**
 *
 * @author Edgar Espinoza
 */
public class Cuenta {

    protected String nombreCliente;
    protected double iva;
    protected double valorCancelarTotal;
    protected double subtotal;
    protected ArrayList<Menu> menu;

    public void setNombreCliente(String n) {
        nombreCliente = n;
    }

    public void setIva() {
        iva = 0.12;
    }

    public void setValorCancelar() {
        for (int i = 0; i < menu.size(); i++) {
            subtotal = subtotal + menu.get(i).obtenerValorMenu();
        }
        iva = subtotal * iva;
        valorCancelarTotal = subtotal + iva;
    }

    public void setSubtotal(double s) {
        subtotal = s;
    }

    public void setMenu(ArrayList<Menu> m) {
        menu = m;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public double getIva() {
        return iva;
    }

    public double getValorCancelarTotal() {
        return valorCancelarTotal;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public ArrayList<Menu> getMenu() {
        return menu;
    }

    @Override
    public String toString() {
        String cadena = String.format("Datos De la cuenta\n"
                + "Nombre del cliente: %s\n",
                getNombreCliente());

        for (int i = 0; i < getMenu().size(); i++) {
            cadena = String.format("%s%s\n",
                    cadena,
                    getMenu().get(i));
        }

        cadena = String.format("\n%s"
                + "Subtotal: %.2f\n"
                + "Valor Del IVA: %.2f\n"
                + "Total a pagar: %.2f\n",
                cadena,
                getSubtotal(),
                getIva(),
                getValorCancelarTotal());

        return cadena;
    }
}
