package day_4;

import java.util.Scanner;

public class C02_dataCasting {
    public static void main(String[] args) {

        // Soru 2- Kullanicidan bir harf alin ve alfabede o harften sonraki 3 harfi yazdirin.
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir harf giriniz : ");

        char girilenHarf = scan.next().charAt(0);
        System.out.println("Girilen Harf : " + girilenHarf +
                "\n Girilen Harften sonraki 3 Harf : "+
                (char) (girilenHarf+1) + ", "+
                (char) (girilenHarf+2) + ", "+
                (char) (girilenHarf+3) );
    }
}
