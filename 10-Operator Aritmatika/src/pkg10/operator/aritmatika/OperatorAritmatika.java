/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg10.operator.aritmatika;


 /**
     * Nama : Wildan Purwana
     * NIM  : A2.1900186
     * Kelas: TI-A
     */
public class OperatorAritmatika {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Operasi Aritmatika

        int variable1 = 10;
        int variable2 = 5;

        int hasil;

        // 1. penjumlahan

        hasil = variable1 + variable2;
        System.out.println(variable1 + " + " + variable2 + " = " + hasil);

        // 2. pengurangan
        hasil = variable1 - variable2;
        System.out.printf("%d - %d = %d \n",variable1,variable2,hasil);

        // 3. perkalian
        hasil = variable1 * variable2;
        System.out.printf("%d x %d = %d \n",variable1,variable2,hasil);

        // 4. pembagian
        hasil = variable1 / variable2;
        System.out.printf("%d / %d = %d \n",variable1,variable2,hasil);

        float a = 6;
        float b = 5;
        float hasilFloat = a/b;
        System.out.println(a + " / " + b + " = " + hasilFloat);

        // 5. modulus (sisa pembagian)
        hasil = variable1 % variable2;
        System.out.printf("%d %% %d = %d \n",variable1,variable2,hasil);

    }
    
}
