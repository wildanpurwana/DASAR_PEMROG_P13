/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg45.array.multidimensi;

import java.util.Arrays;

 /**
     * Nama : Wildan Purwana
     * NIM  : A2.1900186
     * Kelas: TI-A
     */
public class ArrayMultidimensi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // cara membuat array 2 dimensi dengan assignment

        int[][] array_2D = {
                {1,2},
                {3,4}
        };

        printArray2D(array_2D);


        // cara membuat array 2 dimensi dengan deklarasi
        // int[baris][kolom]
        int[][] arrayAngka = new int[5][4];

        printArray2D(arrayAngka);


        // looping lengkap secara manual

//        for(int i = 0; i < arrayAngka.length; i++){
//           System.out.print("[");
//           for(int j = 0; j < arrayAngka[i].length; j++){
//               System.out.print(arrayAngka[i][j] + ",");
//           }
//            System.out.print("]\n");
//        }

        // looping foreach

//        for (int[] baris: arrayAngka) {
//            System.out.print("[");
//            for(int angka: baris){
//                System.out.print(angka + ",");
//            }
//            System.out.print("]\n");
//        }

        // array secara manual, untuk pembuktian

        int[][] array_2D_2 = {
                {1,2,3,4,5},
                {6,7,8,9,10},
                {11,12,13,14,15},
        };

        printArray2D(array_2D_2);


        int[][] array_ragged = {
                {1,2,3},
                {4,5,6,7},
                {8},
        };

        printArray2D(array_ragged);


    }

    private static void printArray2D(int[][] dataArray){
        System.out.print("{\n");
        for (int[] baris: dataArray) {
            System.out.print("{");
            for(int angka: baris){
                System.out.print(angka + ",");
            }
            System.out.print("}\n");
        }
        System.out.print("}\n");
    }
    
}
