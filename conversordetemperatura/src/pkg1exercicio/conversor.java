/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg1exercicio;

import java.util.Scanner;

/*
  @author aaron
 */
public class conversor {

    Scanner in = new Scanner(System.in);
    double C, K, Re, Ra, F;

    public conversor(double C, double K, double Re, double Ra, double F) {
        this.C = C;
        this.K = K;
        this.Re = Re;
        this.Ra = Ra;
        this.F = F;
    }

    public void convKelvin() {
        System.out.println("\nDigite a Temperatura em graus celsius ");
        C = in.nextDouble();
        K = C + 273.15;
        System.out.println("\nO valor:" + C + "°" + "\n em Kelvin eh:" + K);
    }

    public void convReaumur() {
        System.out.println("\nDigite a Temperatura em graus celsius ");
        C = in.nextDouble();
        Re = C * 0.8;
        System.out.println("\nO valor:" + C + "°" + "\n em Reaumur eh:" + Re);
    }

    public void convRankine() {
        System.out.println("\nDigite a Temperatura em graus celsius ");
        C = in.nextDouble();
        Ra = C * 1.8 + 32 + 459.67;
        System.out.println("\nO valor:" + C + "°" + "\n em Reaumur eh:" + Ra);

    }

    public void convFahrenheit() {
        System.out.println("\nDigite a Temperatura em graus celsius ");
        C = in.nextDouble();
        F = C * 1.8 + 32;
        System.out.println("\nO valor:" + C + "°" + "\n em Reaumur eh:" + F);
    }

}
