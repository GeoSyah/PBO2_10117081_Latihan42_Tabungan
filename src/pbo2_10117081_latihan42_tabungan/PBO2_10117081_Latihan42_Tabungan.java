/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2_10117081_latihan42_tabungan;

import java.util.Scanner;

/**
 *
 * @author Geo Syah Alkautsar
 * NIM : 10117081
 * Kelas : IF2/PBO2
 * Deskripsi Program : Memperlihatkan saldo sebelum dan setelah penarikan uang
 */
public class PBO2_10117081_Latihan42_Tabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scn1 = new Scanner(System.in);
        Tabungan tabung = new Tabungan();

        System.out.println("=== Program Penarikan Uang ===");
        System.out.print("Masukkan Saldo Awal : ");
        int x = tabung.tabungan(scn1.nextInt());
        System.out.print("Jumlah Uang yang Diambil : ");
        int y = tabung.ambilUang(scn1.nextInt());
        System.out.println("Saldo Anda Sekarang : "+(tabung.tabungan(x)-
                tabung.ambilUang(y)));

    }
    
}
