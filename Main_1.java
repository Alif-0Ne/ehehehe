package com.proRpl;

public class Main_1 {
    public static void main(String[] args) {
        int a = 5;
        int b = 3;
        int c = a + ((3-1)*b); //c adalah nilai awal yang akan ditampilkan
        int d = a;
        
        System.out.println("deret aritmatika nya adalah : ");
            for (int i = 5; i <= 8; i++) {
                System.out.print(c + " ");
                
                c += b;
                d += c;
            }
                d -=c;
        
        System.out.println("\njumlah deret aritmaka nya adalah : " + d);
    }
}
