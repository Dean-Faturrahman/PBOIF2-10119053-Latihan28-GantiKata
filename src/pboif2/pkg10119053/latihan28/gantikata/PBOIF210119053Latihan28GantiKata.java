/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119053.latihan28.gantikata;

import java.util.Scanner;

/**
 *
 * @author Dean
 * Nama  : Dean Ghifari Faturrahman
 * Kelas : PBOIF2
 * NIM   : 10119053
 * Deskripsi Program : Program ini berisi program untuk mengganti kata
 */
public class PBOIF210119053Latihan28GantiKata {
    
    public static void gantiKata(String kalimat, String ganti, String jadi){
        String hasil = kalimat.replace(ganti,jadi);
        System.out.println("Kalimat awal : " + kalimat);
        System.out.println("Kalimat baru : " + hasil);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String kalimat, ganti, jadi;
        
        System.out.println("====Program Mengganti Kata====");
        System.out.println("");
        System.out.print("Masukkan Kalimat : ");
        kalimat = input.nextLine();
        System.out.print("Ganti Kata : ");
        ganti = input.nextLine();
        System.out.print("Menjadi Kata : ");
        jadi = input.nextLine();
        
        System.out.println("");
        System.out.println("====Hasil Formating====");
        gantiKata(kalimat,ganti,jadi);
    }
    
}
