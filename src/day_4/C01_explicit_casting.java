package day_4;

public class C01_explicit_casting {
    public static void main(String[] args) {
        System.out.println(5+'a');

        char ilkHarf = 101;
        System.out.println(ilkHarf);

        char girilenChar='f';
        System.out.println(girilenChar+1);
        System.out.println("istenen yeni değer : "+ (char)(girilenChar+1));
    }
}
