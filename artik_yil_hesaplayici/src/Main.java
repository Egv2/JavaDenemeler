import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen yıl giriniz:");
        int year= scan.nextInt();

        if (year%4 !=0){
            System.out.println("Artık yıl değildir.");

        } else if (year%100!=0) {
            System.out.println("Artık yıldır.");


        } else if (year%400!=0) {
            System.out.println("Artık yıl değildir.");

        } else {
            System.out.println("Artık yıldır.");
        }
    }
}