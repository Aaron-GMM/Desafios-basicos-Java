/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package televisão;
import static java.lang.Integer.parseInt;
import javax.swing.JOptionPane;
/**
 *
 * @author aaron
 */
public class controle {
    int volume;
    int canal;
    String status;
    public controle(int volume, int canal, String status) {
        this.volume = volume;
        this.canal = canal;
        this.status = status;
    }
    public int getVolume() {
        return volume;
    }
    public void setVolume(int volume) {
        this.volume = volume;
    }
    public int getCanal() {
        return canal;
    }
    public void setCanal(int canal) {
        this.canal = canal;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public void status() {
        if(canal==0||canal>5){
            canal=0;
        JOptionPane.showMessageDialog(null, "Tv:" + this.status + "\nCanal:" + this.canal+ "\nVolume" + this.volume);
        }
        switch (canal) {
            case 1:
                JOptionPane.showMessageDialog(null, "Tv:" + this.status + "\nCanal:" + this.canal + "Tv Verdes Mares"
                        + "\nVolume" + this.volume);
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "Tv:" + this.status + "\nCanal:" + this.canal + "Rede Tv"
                        + "\nVolume" + this.volume);
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "Tv:" + this.status + "\nCanal:" + this.canal + "PremierTv"
                        + "\nVolume" + this.volume);
                break;
            case 4:
                JOptionPane.showMessageDialog(null, "Tv:" + this.status + "\nCanal:" + this.canal + "SporTv"
                        + "\nVolume" + this.volume);
                break;
            case 5:
                JOptionPane.showMessageDialog(null, "Tv:" + this.status + "\nCanal:" + this.canal + "CazeTv"
                        + "\nVolume" + this.volume);
                break;  
        }
        System.out.println(this.status);
    }
    public void ligartv() {
        this.status = "Ligada";
        JOptionPane.showMessageDialog(null, "TV:" + this.status);
        System.out.println("TV:" + this.status);
    }
    public void desligartv(){
      this.status="Desligada";
       JOptionPane.showMessageDialog(null, "TV:" + this.status);
        System.out.println("TV:" + this.status);
    }
    public void aumentarvolume() {
        if (this.status == "Ligada") {
            this.volume = parseInt(JOptionPane.showInputDialog("Digite o valor do volume maior que zero e menor oou igual a 100"));
            if (this.volume > 0 && this.volume <= 100) {
                JOptionPane.showMessageDialog(null, "Aumentando Volume para:" + this.volume);
                for (int i = 0; i < this.volume; i++) {
                    System.out.println("||");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Insira um numero valido");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Error,tv está desligada");
        }
    }
    public void mudarcanal() {
        if (this.status == "Ligada") {
            
                this.canal = parseInt(JOptionPane.showInputDialog("Canais Disponiveis"
                        + "(1)-Tv Verdes Mares \n"
                        + "(2)-Rede Tv\n"
                        + "(3)-PremierTv\n"
                        + "(4)-SportTv\n"
                        + "(5)-CazeTv\n"));
                switch (canal) {
                    case 1:
                        JOptionPane.showMessageDialog(null, "Canal:" + this.canal + "-Tv Verdes Mares ");
                        System.out.println("Canal:" + this.canal + "-Tv Verdes Mares ");
                        break;
                    case 2:
                        JOptionPane.showMessageDialog(null, "Canal:" + this.canal + "-Rede Tv ");
                        System.out.println("Canal:" + this.canal + "-Rede Tv ");
                        break;
                    case 3:
                        JOptionPane.showMessageDialog(null, "Canal:" + this.canal + "-PremierTv");
                        System.out.println("Canal:" + this.canal + "-PremierTv");
                        break;
                    case 4:
                        JOptionPane.showMessageDialog(null, "Canal:" + this.canal + "-SportTv ");
                        System.out.println("Canal:" + this.canal + "-SportTv");
                        break;
                    case 5:
                        JOptionPane.showMessageDialog(null, "Canal:" + this.canal + "-CazeTv ");
                        System.out.println("Canal:" + this.canal + "-CazeTv ");
                        break;
                    case 6:
                        JOptionPane.showMessageDialog(null, "Error,Numero Invalido");
                        break;
                }
            }else {
            JOptionPane.showMessageDialog(null, "Error,tv está desligada");
        }
        } 
    }
