/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg31.latihan.deret.fibonacci;
import java.util.*;

 /**
     * Nama : Wildan Purwana
     * NIM  : A2.1900186
     * Kelas: TI-A
     */
public class LatihanDeretFibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // menghitung nilai deret fibonacci ke-n
        int f_n, f_n_1, f_n_2, n;

        Scanner inputUser = new Scanner(System.in);
        System.out.print("mengambil nilai fibonacci ke - :");
        n = inputUser.nextInt();

        f_n_2 = 0;
        f_n_1 = 1;
        f_n = 1;

        for(int i = 1; i <= n; i++){
            System.out.println("nilai ke - "+ i + " adalah " + f_n);
            f_n = f_n_1 + f_n_2;
            f_n_2 = f_n_1;
            f_n_1 = f_n;
        }
    }
    
}
