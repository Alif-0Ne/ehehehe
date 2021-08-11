package com.proRpl;

import java.util.Scanner;


public class Main_9 {
    static String kat(int g){
        String kategori = null;
        if (g <2000000){
            kategori = "A";
        } else if (g >= 2000000 && g <= 10000000){
            kategori = "B";
        } else if (g > 1000000){
            kategori = "C";
        }
        
        return kategori;
    }
    
    static int bayar(String jalur, String gol, int bul){
        int total = 0;
        
        int dsp = 0;
        int spp = 0;
        if("SBMPTN".equals(jalur)) {
            if("A".equals(gol)) {
                dsp = 5000000;
                spp = 500000;
            }
            else if("B".equals(gol)) {
                dsp = 15000000;
                spp = 1000000;
            }
            else if("C".equals(gol)) {
                dsp = 30000000;
                spp = 2000000;
            }
        }
        else if("SNMPTN".equals(jalur)) {
            if("A".equals(gol)) {
                dsp = 7000000;
                spp = 500000;
            }
            else if("B".equals(gol)) {
                dsp = 17000000;
                spp = 1000000;
            }
            else if("C".equals(gol)) {
                dsp = 35000000;
                spp = 2000000;
            }
        }
        else if("Mandiri".equals(jalur)) {
            if("A".equals(gol)) {
                dsp = 10000000;
                spp = 1000000;
            }
            else if("B".equals(gol)) {
                dsp = 25000000;
                spp = 2000000;
            }
            else if("C".equals(gol)) {
                dsp = 50000000;
                spp = 3000000;
            }
        }
        total = dsp + (bul * spp);
        return total;
        
    }
    
    public static void main(String[] args) {
        int ID[] = {1, 2, 3, 4};
        String nama[] = {"Mira", "Nina", "Oemar", "Pena"};
        String jalur[] = {"SBMPTN", "SNMPTN", "Mandiri", "SBMPTN"}; 
        String alamat[] = {"Sawojajar", "Kedungkandang", "Ijen", "Dinoyo"};
        
        //input
        //masukkan adalah id Mahasiswa, Pendapatan orang tua dan jumlah bulan SPP yang akan dibayar
        System.out.println("=====Loket Pembayaran SPP=====");
        Scanner xid = new Scanner(System.in);
        System.out.print("Masukan id : ");
        int a = xid.nextInt();
        Scanner xp = new Scanner(System.in);
        System.out.print("Masukan Pendapatan Orang Tua : ");
        int b = xp.nextInt();
        Scanner xj = new Scanner(System.in);
        System.out.print("Masukkan Jumlah Bulan SPP : ");
        int c = xj.nextInt();
        
        //output
        //id mahasiswa, nama mahasiswa, jalur masuk, kategori Pendapatan, jumlah biaya yang dikeluarkan,alamat   
        System.out.println("\nID Mahasiswa : " + a);
        System.out.println("Nama : " + nama[a-1]);
        System.out.println("Alamat : " + alamat[a-1]);
        System.out.println("Jalur : " + jalur[a-1]);
        System.out.println("Kategori Pendapatan : " + kat(b));
        System.out.println("jumlah biaya dikeluarkan : " + bayar( jalur[a-1], kat(b), c));
    }
}
