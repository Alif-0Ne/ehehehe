package com.proRpl;

public class Main_2 {
    public static void main(String[] args) {
        int a = 5;
        int b = 3;
        int c = a;
        int d = a;
        
        System.out.println("deret aritmatikanya adalah : \n");
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(c + "\t");
                
                c += b;
                d += c;
            }
            System.out.println("");
        }
                d -=c;

        System.out.println("\njumlah deret aritmaka nya adalah : " + d);
    }
}
