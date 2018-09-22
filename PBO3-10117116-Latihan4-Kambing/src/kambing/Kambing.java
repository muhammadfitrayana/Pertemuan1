/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kambing;

/**
 *
 * @author 
 * NAMA  : Muhammad Fitrayana
 * Kelas : PBO3
 * NIM   : 10117116
 * Deskripsi Tugas : Program Ini Berisi Program Untuk Penamabahan
 * Jumlah Kambing
 * Dari Keyboard
 */
public class Kambing {

   public void tambahKambing() {
    //Deklarasi Variabel lokal
    int jumlahKambing = 0;
    
    jumlahKambing = jumlahKambing + 5;
    System.out.println("Jumlah Kambing setelah ditambah : " + jumlahKambing);
   
}
    
public static void main(String[] args) {
        // TODO code application logic here
   Kambing kambingJantan = new Kambing(); 
   kambingJantan.tambahKambing();
}
    
}
