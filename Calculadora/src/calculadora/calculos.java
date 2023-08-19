/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadora;

import java.lang.Math;
import static java.lang.Double.parseDouble;
import javax.swing.JOptionPane;

/**
 *
 * @author aaron
 */
public class calculos {

    double n1;
    double n2;
    double res;

    public calculos(double n1, double n2, double res) {
        this.n1 = n1;
        this.n2 = n2;
        this.res = res;
    }

    public void soma() {
        n1 = parseDouble(JOptionPane.showInputDialog("Insira o primeiro valor da Soma:"));
        n2 = parseDouble(JOptionPane.showInputDialog("Insira o segundo valor de Soma:"));
        res = n1 + n2;
        JOptionPane.showMessageDialog(null, "Resiltado eh:" + res);
    }

    public void subtracao() {
        n1 = parseDouble(JOptionPane.showInputDialog("Insira o primeiro valor da Subtração:"));
        n2 = parseDouble(JOptionPane.showInputDialog("Insira o segundo valor de Subtração:"));
        res = n1 - n2;
        JOptionPane.showMessageDialog(null, "Resiltado eh:" + res);
    }

    public void multi() {
        n1 = parseDouble(JOptionPane.showInputDialog("Insira o primeiro valor da Multiplicação:"));
        n2 = parseDouble(JOptionPane.showInputDialog("Insira o segundo valor de Multiplicação:"));
        res = n1 * n2;
        JOptionPane.showMessageDialog(null, "Resiltado eh:" + res);
    }

    public void divi() {
        n1 = parseDouble(JOptionPane.showInputDialog("Insira o primeiro valor da Divisão:"));
        n2 = parseDouble(JOptionPane.showInputDialog("Insira o segundo valor de Divisão:"));
        res = n1 / n2;
        JOptionPane.showMessageDialog(null, "Resiltado eh:" + res);
    }

    public void potencia() {
        n1 = parseDouble(JOptionPane.showInputDialog("Insira o primeiro valor da Base:"));
        n2 = parseDouble(JOptionPane.showInputDialog("Insira o segundo valor de Expoente:"));
        res = Math.pow(n1, n2);
        JOptionPane.showMessageDialog(null, "Resiltado eh:" + res);
    }

    public void raizquadrada() {
        n1 = parseDouble(JOptionPane.showInputDialog("Insira o Valor para descobrir raiz quadrada"));
        res = Math.sqrt(n1);
        JOptionPane.showMessageDialog(null, "Resiltado eh:" + res);
    }
    
    
}
