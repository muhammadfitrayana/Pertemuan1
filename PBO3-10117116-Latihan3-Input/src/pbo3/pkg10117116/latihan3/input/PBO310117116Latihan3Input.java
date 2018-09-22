/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117116.latihan3.input;

import java.util.Scanner;

/**
 *
 * @author 
 * NAMA  : Muhammad Fitrayana
 * Kelas : PBO3
 * NIM   : 10117116
 * Deskripsi Tugas : Program Ini Berisi Program Untuk Memasukan Nilai
 * Dari Keyboard
 */

public class PBO310117116Latihan3Input {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.print("Masukkan nama anda : ");
        Scanner scanner = new Scanner(System.in); 
        
        String nama = scanner.next();
        System.out.println("Nama anda adalah : "+nama);
    
    
    }
    
}
