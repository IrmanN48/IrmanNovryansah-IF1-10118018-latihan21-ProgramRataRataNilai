/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan21.programrataratanilai;

import java.util.Scanner;

/**
 *
 * @author Aero
 * NAMA  : IRMAN NOVRYANSAH
 * KELAS : IF 1
 * NIM   : 10118018
 * Deskripsi Program : Program ini untuk menampilkan proses looping dari 
 *                     inputan nilai mahasiswa dan rata-rata dari semua nilai
 */
public class Latihan21ProgramRataRataNilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Deklarasi variabel
        int maks, nilai[];
        double rataRata, jumlah = 0;
        
        Scanner scanner = new Scanner(System.in);
        
        //input
        System.out.print("Masukkan Banyaknya Mahasiswa : ");
        maks = scanner.nextInt();
        
        //inisialisasi array
        nilai = new int[maks];
        
        //proses looping
        for (int i = 0; i <= maks-1; i++){
            System.out.print("Nilai Mahasiswa Ke-"+(i+1)+" : ");
            nilai[i] = scanner.nextInt();
        }
        
        //hitung jumlah
        for (int j = 0; j <= maks-1; j++){
            jumlah = jumlah + nilai[j];
        }
        
        //menghitung rata rata
        rataRata = jumlah / maks;
        
        //output
        System.out.println("Maka Rata-rata Nilainya adalah "+rataRata);
        System.out.println(+jumlah);
    }
    
}
