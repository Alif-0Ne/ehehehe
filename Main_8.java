package com.proRpl;

import java.util.Scanner;

public class Main_8 {
    static int hitung(int gol, int jumlah){
        int hasil = 0;
        switch (gol) {
            case 1:
                hasil = jumlah * 1000;
                break;
            case 2:
                hasil = jumlah * 1300;
                break;
            case 3:
                hasil = jumlah * 1500;
                break;
            default:
                System.out.println("input anda salah");
                break;
        }
        
        if(hasil < 50000) {
            hasil = 50000;
        }
        
        int hasilakhir = hasil + 13000;
        
        return hasilakhir;
        
        
        
    }
    public static void main(String[] args) {
        String np[] = {"Galuh", "Indro", "Jedi", "Kanu"};
        int gp[] = {1, 3, 2, 3}; 
        String ap[] = {"Sawojajar", "Kedungkandang", "Ijen", "Dinoyo"};
        
        System.out.print("Inputkan ID Pelanggan : ");
        Scanner inputID = new Scanner(System.in);
        int a = inputID.nextInt();
        System.out.print("Inputkan Jumlah pemakaian kwh : ");
        Scanner inputJumlah = new Scanner(System.in);
        int b = inputJumlah.nextInt();
        
        int tagihan = hitung(gp[a-1], b);
        
        System.out.println("\nID Pelanggan: " + a);
        System.out.println("Nama Pelanggan: " + np[a-1]);
        System.out.println("Golongan : " + gp[a-1]);
        System.out.println("Alamat : " + ap[a-1]);
        System.out.println("Jumlah kwh : " + b);
        System.out.println("Tagihan : Rp. " + tagihan);
    }
}
