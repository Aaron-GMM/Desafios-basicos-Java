/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package questão.pkg1.da.obi;
import java.util.Scanner;
/**
 *
 * @author aaron
 */
public class Questão1DaOBI {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int V = in.nextInt();
        int A = in.nextInt();
        int F = in.nextInt();
        int P = in.nextInt();

        if (V >= A + F + P) {
            System.out.println(3);
        } else if (V >= A + F || V >= A + P || V >= F + P) {
            System.out.println(2);
        }else if (V >= A || V>=F || V>=P) {
            System.out.println(1);
        }  else if (V < A + F + P) {
            System.out.println(0);
        }
    }
}
