
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Sukma Nur
 */
public class L_lingkaran {
    public static double luasLingkaran(int r){
       return Math.PI * r * r;
    }
    public static void main(String[] args) {
        L_lingkaran ml = new L_lingkaran();
        int r = Integer.parseInt(JOptionPane.showInputDialog("Masukkan jari-jari:"));
        double luas = ml.luasLingkaran(r);
        JOptionPane.showMessageDialog(null,"Luas Lingkaran :" +luas);
    }            
    
}
