/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Sukma Nur
 */
import javax.swing.JOptionPane;
public class L_segitiga {
     public static double luasS(int a, int t){
      return 0.5 *a * t;
     }
    public static void main(String[] args) {
        L_segitiga ml = new L_segitiga();
        int a = Integer.parseInt(JOptionPane.showInputDialog("Masukkan alas :"));
        int t = Integer.parseInt(JOptionPane.showInputDialog("Masukkan tinggi :"));
        double luas = ml.luasS(a, t);
        JOptionPane.showMessageDialog(null,"Luas Segitiga :" +luas);
    }
}
