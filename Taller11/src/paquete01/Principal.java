/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
public class Principal {    
     public static void main(String[] args) {
        ArrayList<Menu> menu = new ArrayList<>();
        Cuenta c = new Cuenta();

        c.setMenu(menu);
        c.setNombreCliente("Cristian McGuire");
        
        MenuCarta mC = new MenuCarta();
        mC.establecerNomPlato("Arroz marinero");
        mC.establecerValorInicialM(5);
        mC.establecerValorPorcionGuarnicion(4.50);
        mC.establecerValorBebida(1);
        mC.establecerPorcentajeAdicional(15);
        mC.establecerValorCancelarTotal();
        
        MenuDia mD = new MenuDia();
        mD.establecerNomPlato("Guata");
        mD.establecerValorInicialM(3);
        mD.establecerValorPostre(1.5);
        mD.establecerValorBebida(1.75);
        mD.establecerValorCancelarTotal();
        
        MenuNinos mN1 = new MenuNinos();
        MenuNinos mN2 = new MenuNinos();
        mN1.establecerNomPlato("Pollo");
        mN1.establecerValorInicialM(3);
        mN1.establecerValorHelado(1.50);
        mN1.establecerValorPastel(2);
        mN1.establecerValorCancelarTotal();
        mN2.establecerNomPlato("sopa Brocoli");
        mN2.establecerValorInicialM(3);
        mN2.establecerValorHelado(1.50);
        mN2.establecerValorPastel(2);
        mN2.establecerValorCancelarTotal();

        MenuEconomico mE = new MenuEconomico();
        mE.establecerNomPlato("Pollo Asado");
        mE.establecerValorInicialM(2);
        mE.establecerDescuento(20);
        mE.establecerValorCancelarTotal();

        menu.add(mC);
        menu.add(mD);
        menu.add(mN1);
        menu.add(mN2);
        menu.add(mE);
        
        c.setIva();
        c.setValorCancelar();
        System.out.println(c);
    }
}
