/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Sukma Nur
 */
public class Method {
     void luasSegitiga(int a, int t){
        double luas = 0.5 * a * t;
        System.out.println("Luas Segitiga : " + luas);
    }
    void luasPP(int panjang, int lebar){
        int luas = panjang * lebar;
        System.out.println("Luas Persegi Panjang : " +luas);
    }
    void tampilnama(String nama, String alamat){
        System.out.println("Nama saya " +nama+ ", Alamat saya " +alamat);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Method ml = new Method();
        
        ml.luasSegitiga(15, 20);
        ml.luasPP(20, 20);
        
        ml.tampilnama("Sukma","Ngebrugan");
        
    }
    
}
