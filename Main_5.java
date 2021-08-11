package com.proRpl;

public class Main_5 {
    public static void main(String[] args) {
        int a [][] = {{2,3},{3,2}};
        int b [][] = {{4,-7},{1,5}};
        
        System.out.println("hasil A-B : \t");
        
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(a[i][j]-b[i][j]+"\t");
            }
            System.out.println("");
        }
        
        
    }
  
}
