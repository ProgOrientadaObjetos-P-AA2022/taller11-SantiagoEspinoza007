/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete01;

import java.util.ArrayList;
import paquete02.Menu;
import paquete02.MenuCarta;
import paquete02.MenuDia;
import paquete02.MenuEconomico;
import paquete02.MenuNinos;

/**
 *
 * @author Edgar Espinoza
 */
public class Ejecutor01 {
    public static void main(String[] args) {
        ArrayList<Menu> menu = new ArrayList<>();
        Cuenta c = new Cuenta();
        c.setMenu(menu);
        c.setNombreCliente("René Elizalde");
        
        MenuNinos mN1 = new MenuNinos();
        MenuNinos mN2 = new MenuNinos();
        mN1.establecerNomPlato("Niños 01");
        mN1.establecerValorInicialM(2);
        mN1.establecerValorHelado(1);
        mN1.establecerValorPastel(1.50);
        mN1.establecerValorCancelarTotal();
        mN2.establecerNomPlato("Niños 02");
        mN2.establecerValorInicialM(3);
        mN2.establecerValorHelado(1);
        mN2.establecerValorPastel(1.50);
        mN2.establecerValorCancelarTotal();
        
        MenuEconomico mE = new MenuEconomico();
        mE.establecerNomPlato("Econo 001");
        mE.establecerValorInicialM(4);
        mE.establecerDescuento(25);
        mE.establecerValorCancelarTotal();
        
        MenuDia mD = new MenuDia();
        mD.establecerNomPlato("Dia 001");
        mD.establecerValorInicialM(5);
        mD.establecerValorPostre(1);
        mD.establecerValorBebida(1);
        mD.establecerValorCancelarTotal();
        
        MenuCarta mC = new MenuCarta();
        mC.establecerNomPlato("Carta 001");
        mC.establecerValorInicialM(6);
        mC.establecerValorPorcionGuarnicion(1.5);
        mC.establecerValorBebida(2);
        mC.establecerPorcentajeAdicional(10);
        mC.establecerValorCancelarTotal();
        
        menu.add(mC);
        menu.add(mD);
        menu.add(mN1);
        menu.add(mN2);
        menu.add(mE);
        
        c.setIva();
        c.setValorCancelar();
        
        System.out.printf("Factura\n"
                + "Cliente: %s\n"
                + "Menu Niños 1:\n"
                + "\tPlato: %s\n"
                + "\tValor Inicial: %.2f\n"
                + "\tValor helado: %.2f\n"
                + "\tValor pastel: %.2f\n"
                + "\tValor del menú: %.2f\n"
                + "\nMenu Niños 2:\n"
                + "\tPlato: %s\n"
                + "\tValor Inicial: %.2f\n"
                + "\tValor helado: %.2f\n"
                + "\tValor pastel: %.2f\n"
                + "\tValor del menú: %.2f\n",
                c.getNombreCliente(), mN1.obtenerNombPlato(),
                mN1.obtenerValorInicialMenu(), mN1.obtenerValorHelado(),
                mN1.obtenerValorPastel(), mN1.obtenerValorMenu(),
                mN2.obtenerNombPlato(),mN2.obtenerValorInicialMenu(),
                mN2.obtenerValorHelado(), mN2.obtenerValorPastel(), 
                mN2.obtenerValorMenu());
        
        System.out.printf("\nMenu Económico:\n"
                + "\tPlato: %s\n"
                + "\tValor Inicial: %.2f\n"
                + "\tPorcentaje Descuento: %.2f\n"
                + "\tValor del menú: %.2f\n",
                mE.obtenerNombPlato(), mE.obtenerValorInicialMenu(),
                mE.obtenerDescuento(), mE.obtenerValorMenu());
        
        System.out.printf("\nMenu del Día:\n"
                + "\tPlato: %s\n"
                + "\tValor Inicial: %.2f\n"
                + "\tValor bebida: %.2f\n"
                + "\tValor postre: %.2f\n"
                + "\tValor del menú: %.2f\n",
                mD.obtenerNombPlato(), mD.obtenerValorInicialMenu(),
                mD.obtenerValorBebida(), mD.obtenerValorPostre(),
                mD.obtenerValorMenu());
        
        System.out.printf("\nMenu a la Carta:\n"
                + "\tPlato: %s\n"
                + "\tValor Inicial: %.2f\n"
                + "\tValor guarnición: %.2f\n"
                + "\tValor bebida: %.2f\n"
                + "\tPorcentaje Adicional: %.2f\n"
                + "\tValor del menú: %.2f\n",
                mC.obtenerNombPlato(), mC.obtenerValorInicialMenu(),
                mC.obtenerValorPorcionGuarnicion(), mC.obtenerValorBebida(),
                mC.obtenerPorcentajeAdicional(), mC.obtenerValorMenu());
        
        System.out.printf("\nSubtotal: %.2f\n"
                + "IVA: %.2f\n"
                + "Total a pagar: %.2f\n",
                c.getSubtotal(),
                c.getIva(),
                c.getValorCancelarTotal());
    }
}
//Double.parseDouble(datos001[i][1]);