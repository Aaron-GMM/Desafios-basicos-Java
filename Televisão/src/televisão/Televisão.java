/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package televisão;

import static java.lang.Integer.parseInt;
import javax.swing.JOptionPane;

/**
 *
 * @author aaron
 */
public class Televisão {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        controle c1 = new controle(0, 0, "Desligada");
        int con = parseInt(JOptionPane.showInputDialog("Digite\n"
                + "(1)-LigarTv"));
        if (con == 1) {
            c1.ligartv();
            boolean e = true;
            while (e == true) {
                int c = parseInt(JOptionPane.showInputDialog("Digite\n"
                        + "(1)-Selecionar Canal\n"
                        + "(2)-Alterar Volume\n"
                        + "(3)-Olhar status da TV\n"
                        + "(4)-Desligar"));
                switch (c) {
                    case 1:
                        c1.mudarcanal();
                        break;
                    case 2:
                        c1.aumentarvolume();
                        break;
                    case 3:
                        c1.status();
                        break;
                    case 4:
                         c1.desligartv();
                         e=false;
                         break;
                    case 5:
                        JOptionPane.showMessageDialog(null,"error,informe um numero valido");
                        
                }
               
                
            }
        } else {
            System.out.println(c1.getStatus());
        }
    }
}
