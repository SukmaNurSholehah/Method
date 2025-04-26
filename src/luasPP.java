/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Sukma Nur
 */
import javax.swing.JOptionPane;
public class luasPP {
    public static int luasPP(int p, int l){
       return p * l;
    }
    public static void main(String[] args) {
        luasPP ml = new luasPP();
        int p = Integer.parseInt(JOptionPane.showInputDialog("Masukkan panjang :"));
        int l = Integer.parseInt(JOptionPane.showInputDialog("Masukkan lebar :"));
        double luas = ml.luasPP(p, l);
        JOptionPane.showMessageDialog(null,"Luas Persegi Panjang :" +luas);
    }            
}
