


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Sukma Nur
 * 
 */
import javax.swing.JOptionPane;
public class luasLingkaran {  
    public static void main(String[] args) {
        luasLingkaran ml = new luasLingkaran();
        int r = Integer.parseInt(JOptionPane.showInputDialog("Masukkan jari-jari :"));
        double PHI = 3.14;
        double luas = PHI * r *r;
        JOptionPane.showMessageDialog(null,"Luas Lingkaran:" +luas);
        System.out.println("Luas Lingkaran : " +luas);
    }
    
}
