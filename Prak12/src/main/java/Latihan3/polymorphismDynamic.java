/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Latihan3;

/**
 *
 * Created by Nazwa Nurfadhilla Phitri
 */
public class polymorphismDynamic {
    public static void main(String args[]) {
        //creating variable of Bank class
        Bank B;
        B = new BRI();
        System.out.println("Tingkat Suku Bunga BRI adalah: " +B.sukuBunga());
        B = new BNI();
        System.out.println("Tingkat Suku Bunga BNI adalah: " +B.sukuBunga());
        B = new Mandiri();
        System.out.println("Tingkat Suku Bunga Mandiri adalah: " +B.sukuBunga());
    }
}
