package com.proRpl;

public class Main_7 {
    public static void main(String[] args) {
        int a [][] = {{2,3,4},{3,2,1}};
        int b [][] = {{-7,2},{5,-6},{7,-9}};
        int h [][] = {{0,0},{0,0}};
        
        System.out.println("hasil AxB : \t");
        
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 3; k++) {
                    h[i][j] = h[i][j]+a[i][k]*b[k][j];
                }
            }
        }
        
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(h[i][j]+"\t");
            }
            System.out.println("");
        }
        
    }
  
}

//h[i][j]+a[i][k]*b[k][j]
//