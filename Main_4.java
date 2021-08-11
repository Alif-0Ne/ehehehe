package com.proRpl;

public class Main_4 {
    public static void main(String[] args) {
        int a = 5;
        int b = 3;
        int c = a;
        int d = a;
        
        System.out.println("deret aritmatikanya adalah : \n");
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j <5-i; j++) {
                System.out.print(c + "\t");
                
                c += b;
                d += c;
            }
            System.out.println("");
        }
        
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <=i; j++) {
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

//segitiga sama kaki = for1j <=i || for2j <?-i;

//segitga gunung terbelah = samakaki invers tapi for1 i<?-i