/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package coletacalcdados;

import java.util.Scanner;

/**
 *
 * @author aaron
 */
public class Coletacalcdados {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sexo = 0, qtd_h = 0, qtd_m = 0;
        float altura = 0, somaH = 0, somaM = 0, maior = 0, menor = 0;
        for (int i = 0; i <= 10; i++) {
            System.out.println("Informe o sexo\n "
                    + "(1)-Homem\n"
                    + "(2)-Mulher");
            sexo = in.nextInt();
            System.out.print("Digite a altura: ");
            altura = in.nextFloat();
            if (sexo == 1) {
                qtd_h++;
                somaH = somaH + altura;
            } else if (sexo == 2) {
                qtd_m++;
                somaM = somaM + altura;
            } else {
                System.out.println("Valor Errado digite apenas 1 e 2");
            }
        
        if (altura >= maior) {
            maior = altura;
            
        }
        }
        
        float media_homen= somaH/qtd_h;
        float media_mulheres= somaM/qtd_m;
        System.out.println("A maior altura do grupo é de " + maior + " m, \n e a menor é de " + menor + " m \n");
        System.out.println("\nO número de homens é " + qtd_m);
        System.out.println("\nA média de altura dos homens é " + media_homen + " m");
        System.out.println("\nO número de mulheres é " + qtd_m);
        System.out.println("\nA média de altura das mulheres é " + media_mulheres + " m");
  
        
    }

}
