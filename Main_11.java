package com.proRpl;

import java.util.Scanner;

public class Main_11 {
    static int hitung(String cot, int day, String har){
        int total = 0;
        int tarif = 0;
        if ("duku".equals(cot) || "jeruk".equals(cot)) {
            if ("weekday".equals(har)) {
                tarif =915000;
            } else if ("weekend".equals(har)) {
                tarif =1025000;
            } else if ("holiday".equals(har)) {
                tarif=1225000;
            }
        } else if("alpukat".equals(cot) || "jambu air".equals(cot)){
            if ("weekday".equals(har)) {
                tarif =575000;
            } else if ("weekend".equals(har)) {
                tarif =695000;
            } else if ("holiday".equals(har)) {
                tarif=895000;
            }
        } else if("durian".equals(cot) || "melon".equals(cot)){
            if ("weekday".equals(har)) {
                tarif =595000;
            } else if ("weekend".equals(har)) {
                tarif =715000;
            } else if ("holiday".equals(har)) {
                tarif=915000;
            }
        } else if("belimbing".equals(cot) || "mangga".equals(cot) || "kedondong".equals(cot)){
            if ("weekday".equals(har)) {
                tarif =495000;
            } else if ("weekend".equals(har)) {
                tarif =575000;
            } else if ("holiday".equals(har)) {
                tarif=755000;
            } else {
                tarif = 0;      
            }
        }
        
        total = day * tarif;
        
        return total;
        }
    
    public static void main(String[] args) {
        int ID[] = {1, 2, 3, 4, 5};
        String nama[] = {"Ali", "Budi", "Dani", "Edi", "Umar"};
        
        System.out.println("======Selamat Datang Di Loket Pemesanan Cottage======");
        Scanner xid = new Scanner(System.in);
        System.out.print("Masukan id : ");
        int a = xid.nextInt();
        
        Scanner xc = new Scanner(System.in);
        System.out.print("Masukan Jenis Cottage : ");
        String b = xc.nextLine();
        
        Scanner xg = new Scanner(System.in);
        System.out.print("Masukan Golongan Hari : ");
        String c = xg.nextLine();
        
        Scanner xl = new Scanner(System.in);
        System.out.print("Masukan Lama Menginap : ");
        int d = xl.nextInt();
        
        System.out.println("\n======Tiket Cottage======");
        System.out.println("ID Pelanggan : " + a);
        System.out.println("Nama Pelanggan : " + nama[a-1]);
        System.out.println("Jumlah Hari : " + d );
        System.out.println("Tipe Cottage : " + b );
        System.out.println("Total Biaya : " + hitung(b,d,c));
    }
}
