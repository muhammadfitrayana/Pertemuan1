/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kambingglobal;

/**
 *
 * @author 
 * NAMA  : Muhammad Fitrayana
 * Kelas : PBO3
 * NIM   : 10117116
 * Deskripsi Tugas : Program Ini Berisi Program Untuk Penamabahan
 * Jumlah Kambing disertai perubahan Variabel ke instence
 * Dari Keyboard
 */

public class KambingGlobal {

    /**
     * @param args the command line arguments
     */
    
    //Variabel jumlahkambing menjadi variabel instance
    int jumlahKambing = 88;
    
    //Method untuk Menampilkan jumlah Kambing
    public void getJumlahKambing() {
        System.out.println("Jumlah Kambing " + jumlahKambing);
    }
    
    public void tambahKambing() {
    jumlahKambing = jumlahKambing + 5;
    System.out.println("Jumlah Kambing setelah ditambah : " + jumlahKambing);
   
}
    
 public static void main(String[] args) {
        // TODO code application logic here
    KambingGlobal kambingSusu = new KambingGlobal();
 
    //Menampilkan jumlah kambing yang ada saat program pertama x berjalan
    kambingSusu.getJumlahKambing();
    //Menambah satu kambing
    kambingSusu.tambahKambing();
    //Menampilkan Jumlah kambing ada
    kambingSusu.getJumlahKambing();
 
 
 }
    
}
