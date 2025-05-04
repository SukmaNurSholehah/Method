/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Sukma Nur
 */
import javax.swing.JOptionPane;
public class method2 {
    void kalkulator(String operasi, double bil1, double bil2) {
    double hasil;
    
    switch(operasi) {
        case "penjumlahan" :
           hasil = bil1+bil2;
           break;
        case "pengurangan" :
           hasil = bil1-bil2;
           break;    
        case "perkalian" :
           hasil = bil1*bil2;
           break;       
        case "pembagian" :
              hasil = bil1 / bil2;
           break;
           default:
              hasil = 0; 
               
    }
    String txtMessage = " Hasil operasi " + operasi + " " + bil1 + " dan " + bil2 + " adalah " + hasil;
    JOptionPane.showMessageDialog(null, txtMessage, "Hasil Operasi", JOptionPane.PLAIN_MESSAGE);
    }
    public static void main(String[] args) {
        method2 lm = new method2();
        
        lm.kalkulator("pembagian", 7, 7);
        
    }
    
}
