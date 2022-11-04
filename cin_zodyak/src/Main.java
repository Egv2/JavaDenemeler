import java.util.Scanner;

public class Main {
    public static void main (String [] args) {
        int kalan;
        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen doğum yılınızı giriniz:");
        int year = input.nextInt();

        kalan = year % 12;
        if (kalan ==0) {
            System.out.println("Çin zodyağı burcunuz: Maymun");
        } else if (kalan == 1) {
            System.out.println("Çin zodyağı burcunuz: Horoz");
        }else if (kalan ==2) {
            System.out.println("Çin zodyağı burcunuz: Köpek");
        }else if (kalan==3) {
            System.out.println("Çin zodyağı burcunuz: Domuz");
        }else if (kalan ==4) {
            System.out.println("Çin zodyağı burcunuz: Fare");
        }else if (kalan ==5) {
            System.out.println("Çin zodyağı burcunuz: Öküz");
        }else if (kalan ==6) {
            System.out.println("Çin zodyağı burcunuz: Kaplan");
        }else if (kalan ==7) {
            System.out.println("Çin zodyağı burcunuz: Tavşan");
        }else if (kalan ==8) {
            System.out.println("Çin zodyağı burcunuz: Ejderha");
        }else if (kalan ==9) {
            System.out.println("Çin zodyağı burcunuz: Yılan");
        }else if (kalan ==10) {
            System.out.println("Çin zodyağı burcunuz: At");
        }else if (kalan ==11) {
            System.out.println("Çin zodyağı burcunuz: Koyun");
        }


    }

}
