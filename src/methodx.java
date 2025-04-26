/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Sukma Nur
 */
import java.util.Scanner;
public class methodx {
    public double luas_lingkaran(int diameter) {
        int jari2 = diameter / 2;
        double luas = Math.PI * Math.pow(jari2, 2);
        return luas;
    }
    public double volume_tabung(int diameter, int tinggi){
        int jari2 = diameter / 2;
        double volume = Math.PI *Math.pow(jari2, 2) * tinggi;
        return volume;
    }
    public static void main(String[] args) {
        methodx mt = new methodx();
        System.out.println("Luas Lingkaran : " + mt.luas_lingkaran(20));
        
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan diameter tabung : ");
        int diameter = input.nextInt();
        System.out.print("Masukkan tinggi tabung : ");
        int tinggi = input.nextInt();
        
        double volume = mt.volume_tabung(diameter, tinggi);
        System.out.println("Volume Tabung : " + volume); 
        System.exit(0);
    }  
}
