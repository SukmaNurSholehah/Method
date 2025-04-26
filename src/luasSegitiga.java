/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Sukma Nur
 */
import javax.swing.JOptionPane;
public class luasSegitiga {
    public static void main(String[] args) {
        luasSegitiga ml = new luasSegitiga();
        int a = Integer.parseInt(JOptionPane.showInputDialog("Masukkan alas :"));
        int t = Integer.parseInt(JOptionPane.showInputDialog("Masukkan tinggi :"));
        double luas = 0.5 * a * t;
        JOptionPane.showMessageDialog(null,"Luas Segitiga :" +luas);
    }
    
}
