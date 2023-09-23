/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg1exercicio;

import java.util.Scanner;

/**
 *
 * @author aaron
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        conversor c = new conversor(0, 0, 0, 0, 0);
        boolean e = true;
        while (e == true) {
            System.out.println("\nDigite para converter  \n(1)-Fahrenheit \n"
                    + "(2)-Kelvin \n"
                    + "(3)-Rankine\n"
                    + "(4)-Réaumur\n"
                    + "(5)-sair");
            int con = in.nextInt();

            switch (con) {
                case 1:
                    c.convFahrenheit();
                    break;
                case 2:
                    c.convKelvin();
                    break;
                case 3:
                    c.convRankine();
                    break;
                case 4:
                    c.convReaumur();
                    break;
                case 5:
                    e=false;
                    break;
            }

        }
    }

}
