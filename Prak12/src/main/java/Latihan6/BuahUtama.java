/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Latihan6;

/**
 *
 * Created by Nazwa Nurfadhilla Phitri
 */
public class BuahUtama {
    public static void main(String[] args) {
        //Menggunakan constructor untuk menginisialisasi
        EncapsulationBuah Apel = new EncapsulationBuah("Apel", "Rp.3000", "Merah");
        //Menggunakan getter ke nilai
        System.out.println("Nama Buah: "+ Apel.getName()+"\nHarga"+Apel.getPrice()+"\nWarna: "+Apel.getColor());
        //update harga dan warna menggunakan setter
        Apel.setColor("Hijau");
        Apel.setPrice("Rp.7000");
        System.out.println("\nInformasi terkait Apel setelah di Update");
        //Menggubakan getter untuk mendapatkan nilai
        System.out.println("Nama Buah: "+ Apel.getName()+"\nHarga"+Apel.getPrice()+"\nWarna: "+Apel.getColor());
    }
    
}
