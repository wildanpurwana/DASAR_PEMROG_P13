/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg29.pkgfor.loop;


 /**
     * Nama : Wildan Purwana
     * NIM  : A2.1900186
     * Kelas: TI-A
     */
public class ForLoop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //        for (inisialisasi; kondisi; step nilai){
//
//            aksi;
//
//        }


        System.out.println("ini adalah awal program");

        System.out.println("loop pertama");

        for(int nilai = 0; nilai <= 10 ; nilai++){

            System.out.println("for loop ke-" + nilai);

        }


        System.out.println("loop kedua");

        for(int nilai = 0; nilai < 10 ; nilai++){

            System.out.println("for loop ke-" + nilai);

        }

        System.out.println("loop ketiga");

        for(int nilai = 10; nilai >= 5 ; nilai--){

            System.out.println("for loop ke-" + nilai);

        }

        System.out.println("loop keempat");

        int nilai = 0;

        for(; nilai < 10 ;){

            System.out.println("for loop ke-" + nilai);
            nilai++;
        }

        System.out.println("ini adalah akhir program");
    }
    
}
