/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg50.string.builder;
import java.lang.StringBuilder;


 /**
     * Nama : Wildan Purwana
     * NIM  : A2.1900186
     * Kelas: TI-A
     */
public class StringBuilder {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      StringBuilder builder = new StringBuilder("halo");
        printData(builder);

        // append
        builder.append(" semuanya");
        printData(builder);

        builder.append(" warga Surabaya");
        printData(builder);

        // insert
        builder.insert(19," Kota");
        printData(builder);

        // delete
        builder.delete(19,24);
        printData(builder);

        // rubah character pada index tertentu
        builder.setCharAt(14,'W');
        printData(builder);

        // replace
        builder.replace(20,28,"Bandung");
        printData(builder);

        // casting menjadi string
        String kalimat = builder.toString();
        System.out.println(kalimat);
        int addressString = System.identityHashCode(kalimat);
        System.out.println("address = " + Integer.toHexString(addressString));

    }

    private static void printData(StringBuilder dataBuilder){
        System.out.println("data = " + dataBuilder);
        System.out.println("panjang = " + dataBuilder.length());
        System.out.println("kapasitas = " + dataBuilder.capacity());

        int addressBuilder = System.identityHashCode(dataBuilder);
        System.out.println("address = " + Integer.toHexString(addressBuilder));
    }
    
}
