/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kambingstatic;

/**
 *
 * @author 
 * NAMA  : Muhammad Fitrayana
 * Kelas : PBO3
 * NIM   : 10117116
 * Deskripsi Tugas : Program Ini Berisi Program Untuk Menghubungkan 
 * dua class dan cara pemanggilannya
 */

public class KambingStatic {
    //NAMA_KAMBING sebagai Konstanta
       public static final String NAMA_KAMBING = "MIDUN";
    
    public static void main(String[] args) {
        // TODO code application logic here
        Mamalia.jumlahKambing = 485000;
        System.out.println(NAMA_KAMBING + " memiliki kambing sebanyak "
                           + Mamalia.jumlahKambing);
    
    }
    
}
