/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg35.fungsi.pkgvoid.tanpa.pkgreturn;


 /**
     * Nama : Wildan Purwana
     * NIM  : A2.1900186
     * Kelas: TI-A
     */
public class FungsiVoidTanpaReturn {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          // void itu artinya hampa

        System.out.println(simpel());

        fungsiVoid("apa pun");
        selamatPagi("emak");
        selamatPagi("abah");

    }

    private static void selamatPagi(String nama){
        System.out.println("selamat pagi " + nama);
    }


    // fungsi atau method tanpa kembalian
    private static void fungsiVoid(String input){
        System.out.println(input);
    }

    // fungsi atau method dengan kembalian
    // sehingga menggunakan return untuk
    // mengembalikan nilainya (10.0f)
    private static float simpel(){
        return 10.0f;
    }
    
}
