package com.proRpl;

public class Main_3 {
    public static void main(String[] args) {
        int a = 5;
        int b = 3;
        int c = a;
        int d = a;
        
        System.out.println("deret aritmatikanya adalah : \n");
        
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <5-i; j++) {
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

//<=i == mengisor || <5-i == menduwur