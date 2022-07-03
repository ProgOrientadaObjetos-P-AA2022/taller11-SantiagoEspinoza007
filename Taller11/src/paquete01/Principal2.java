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
public class Principal2 {

    public static void main(String[] args) {

        String[][] datos001 = {{"Niños 01", "2.00", "1", "1.5"},
        {"Niños 02", "3.00", "1", "1.5"},
        {"Niños 03", "2.00", "2", "0.5"},};

        String[][] datos002 = {{"Econo 001", "4", "25"},
        {"Econo 002", "4", "15"},
        {"Econo 003", "4", "35"}
        };

        String[][] datos003 = {{"Dia 001", "5", "1", "1"},
        {"Dia 002", "6", "2", "2"},
        {"Dia 003", "5.5", "3", "1"},};

        String[][] datos004 = {{"Carta 001", "6", "1.5", "2", "10"},
        {"Carta 002", "7", "1.7", "2.1", "5"},
        {"Carta 003", "8", "1.9", "2.2", "5"},
        {"Carta 004", "9", "2.5", "2.9", "5"},};

        ArrayList<Menu> l = new ArrayList<>();
        for (int i = 0; i < datos001.length; i++) {
            String nombrePlato = datos001[i][0];
            double vInicial = Double.parseDouble(datos001[i][1]);
            double vHelado = Double.parseDouble(datos001[i][2]);
            double vPastel = Double.parseDouble(datos001[i][3]);
            MenuNinos mN1 = new MenuNinos();
            mN1.establecerNomPlato(nombrePlato);
            mN1.establecerValorInicialM(vInicial);
            mN1.establecerValorHelado(vHelado);
            mN1.establecerValorPastel(vPastel);
            l.add(mN1);
        }

        for (int i = 0; i < datos002.length; i++) {
            String nombrePlato = datos002[i][0];
            double vInicial = Double.parseDouble(datos002[i][1]);
            double vPorcentaje = Double.parseDouble(datos002[i][2]);
            MenuEconomico mE = new MenuEconomico();
            mE.establecerNomPlato(nombrePlato);
            mE.establecerValorInicialM(vInicial);
            mE.establecerDescuento(vPorcentaje);
            l.add(mE);
        }
        for (int i = 0; i < datos003.length; i++) {
            String nombrePlato = datos003[i][0];
            double vInicial = Double.parseDouble(datos003[i][1]);
            double vPostre = Double.parseDouble(datos003[i][2]);
            double vBebida = Double.parseDouble(datos003[i][3]);
            MenuDia mD = new MenuDia();
            mD.establecerNomPlato(nombrePlato);
            mD.establecerValorInicialM(vInicial);
            mD.establecerValorPostre(vPostre);
            mD.establecerValorBebida(vBebida);
            l.add(mD);
        }
        for (int i = 0; i < datos004.length; i++) {
            String nombrePlato = datos004[i][0];
            double vInicial = Double.parseDouble(datos004[i][1]);
            double vGuarnicion = Double.parseDouble(datos004[i][2]);
            double vBebida = Double.parseDouble(datos004[i][3]);
            double pAdicional = Double.parseDouble(datos004[i][4]);
            MenuCarta mC = new MenuCarta();
            mC.establecerNomPlato(nombrePlato);
            mC.establecerValorInicialM(vInicial);
            mC.establecerValorPorcionGuarnicion(vGuarnicion);
            mC.establecerValorBebida(vBebida);
            mC.establecerPorcentajeAdicional(pAdicional);
            l.add(mC);          
        }
    for (int i = 0; i < l.size(); i++) {
            l.get(i).establecerValorCancelarTotal();
        }

        // Un objeto de tipo Cuenta
        Cuenta c = new Cuenta();
        c.setMenu(l);
        c.setNombreCliente("Luis Andrade");
        c.setIva();
        c.setValorCancelar();
        System.out.printf("%s\n", c);
    }
}
