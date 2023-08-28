import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        //Değişkenler
        double boy, kilo, bmi;

        //Scanner sınıfı
        Scanner input = new Scanner(System.in);

        //Verileri al
        System.out.print("Boyunuzu metre olarak giriniz : ");
        boy = input.nextDouble();
        System.out.print("Kilonuzu kg olarak giriniz : ");
        kilo = input.nextDouble();

        //Vücut indeksini hesapla
        bmi = kilo/(boy*boy);
        System.out.print("Vücut kitle indeksiniz : "+bmi);

    }
}