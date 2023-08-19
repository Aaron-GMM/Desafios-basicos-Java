/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadora;
import static java.lang.Integer.parseInt;
import javax.swing.JOptionPane;
/**
 *
 * @author aaron
 */
public class Calculadora {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        calculos calc = new calculos(0, 0, 0);
        boolean e = true;
        while (e == true) {
            int c = parseInt(JOptionPane.showInputDialog("Digite \n (1)-Operaçoes basicas\n"
                    + "(2)-Operaçoes raiz/potencia\n"
                    + "(3)-Sair"));
            if (c == 1) {
                boolean controle = true;
                while (controle == true) {
                    int s = parseInt(JOptionPane.showInputDialog("Digite\n  (1)-Soma\n"
                            + "(2)-Subtração\n"
                            + "(3)-Multiplicação\n"
                            + "(4)-Divisão\n"
                            + "(5)-sair"));
                    switch (s) {
                        case 1:
                            calc.soma();
                            break;
                        case 2:
                            calc.subtracao();
                            break;
                        case 3:
                            calc.multi();
                            break;
                        case 4:
                            calc.divi();
                            break;
                        case 5:
                            controle = false;
                            break;
                        case 6:
                            JOptionPane.showMessageDialog(null, "Digite o numero corretamente");
                           break;
                    }
                }
            } else if (c == 2) {
                boolean controle = true;
                while (controle == true) {
                    int con = parseInt(JOptionPane.showInputDialog("Digite\n"
                            + "(1)-potenciação\n"
                            + "(2)-Radiciação\n"
                            + "(3)-sair"));
                    if (con == 1) {
                        calc.potencia();
                    } else if (con == 2) {
                        calc.raizquadrada();
                    } else if (con == 3) {
                        controle = false;
                    } else {
                        JOptionPane.showMessageDialog(null, "Digite o numero corretamente");
                    }
                }
            } else if (c == 3) {
                e = false;
            } else {
                JOptionPane.showMessageDialog(null, "Digite o numero corretamente");
            }
        }
    }
}