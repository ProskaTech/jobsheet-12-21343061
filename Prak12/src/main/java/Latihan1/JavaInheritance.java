/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Latihan1;

/**
 *
 * Created by Nazwa Nurfadhilla Phitri
 */
public class JavaInheritance {
    public static void main(String args[]) {
       //Membuat objek kendaraan roda dua
       RodaDua sepeda = new RodaDua();
       //Membuat objek kendaraan roda empat
       RodaEmpat mobil = new RodaEmpat();
       
       sepeda.tampilkanHarga();
       sepeda.hargaAkhir();
       
       mobil.tampilkanHarga();
       mobil.hargaAkhir();
    }
}
