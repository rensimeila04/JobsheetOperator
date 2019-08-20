
package menghitung;

import java.util.Scanner;

public class KonversiSuhu {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        
        //deklarasi
        Double Fahrenhait;
        int celcius;
        
        // membuat scanner baru
        Scanner baca = new Scanner(System.in);
        
        // input
        System.out.println("== program konversi suhu celsius ke farenheit ==");
        System.out.print("input celcius: ");
        celcius = baca.nextInt();
        
        // Proses
        Fahrenhait = Double.valueOf((9/5 * celcius)+ 32);
        
        // Output
        System.out.println("hasil: " + Fahrenhait);
        
}
}