package com.proRpl;

public class Main_6 {
    public static void main(String[] args) {
        int a [][] = {{2,3},{3,2}};
        int b [][] = {{-7},{5}};
        int h [][] = {{0},{0}};
        
        System.out.println("hasil AxB : \t");
        
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 1; j++) {
                for (int k = 0; k < 2; k++) {
                    h[i][j] = h[i][j]+a[i][k]*b[k][j];
                }
            }
        }
        
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 1; j++) {
                System.out.println(h[i][j]+"\t");
            }
            System.out.println("");
        }
        
    }
  
}

//h[i][j]+a[i][k]*b[k][j]