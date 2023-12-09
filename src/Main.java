import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        double bbg, mat, fizik, algoritma, ing, edb, oryantasyon;

        Scanner giris = new Scanner(System.in);

        System.out.print("Bilgisayar Bilimlerine Giriş notunuzu girin: ");
        bbg = giris.nextDouble();

        System.out.print("Matematik notunuzu girin: ");
        mat = giris.nextDouble();

        System.out.print("Fizik notunuzu girin: ");
        fizik = giris.nextDouble();

        System.out.print("Algoritma ve Programlama notunuzu girin: ");
        algoritma = giris.nextDouble();

        System.out.print("İngilizce notunuzu girin: ");
        ing = giris.nextDouble();

        System.out.print("Türk Dili ve Edebiyatı notunuzu girin: ");
        edb = giris.nextDouble();

        System.out.print("Yazılım Mühendisliği Oryantasyon notunuzu girin: ");
        oryantasyon = giris.nextDouble();

        double ortalama = (bbg+mat+fizik+algoritma+ing+edb+oryantasyon)/7;
        System.out.println("Not Ortalamanız: " +ortalama);
    }
}