import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double perKm = 0.10, total, indTotal, yDis, tDis;
        int yas, trvlType, km;

        System.out.print("Mesafeyi km türünden giriniz: ");
        km = input.nextInt();
        if (km < 1) {
            System.out.println("Hatalı değer girdiniz!");
        } else {
            System.out.println("Yolcunun yaşını giriniz:");
            yas = input.nextInt();
        }
        if (yas > 0) {
            if (yas < 1) {
                System.out.println("Hatalı bir değer girdiniz!");
            } else if (yas >= 1 && yas <= 12) {
                System.out.println("Seyahat türünü giriniz: 1- Tek Gidiş 2-Gidiş Dönüş:");
                trvlType = input.nextInt();
            }
            switch (trvlType) {

                case 1:
                    total = km * perKm;
                    yDis = total * 0.50;
                    indTotal = total - yDis;
                    tDis = indTotal;
                    System.out.println("Toplam bilet tutarı:" + indTotal);
                    break;

                case 2:
                    total = km * perKm;
                    yDis = total * yDis;
                    tDis = total * 0.20;
                    indTotal = total - yDis - tDis;
                    System.out.println("Toplam bilet tutarı: " + indTotal);
                    break;
                default:
                    System.out.println("Hatalı bir değer girdiniz.");
            }
        } else if (yas >= 13 && yas <= 24) {
            System.out.println("Seyahat türünü giriniz: 1- Tek Gidiş 2-Gidiş Dönüş");
            trvlType = input.nextInt();
        }
        switch (trvlType) {
            case 1:
                total = km * perKm;
                yDis = total * 0.10;
                indTotal = total - yDis;
                tDis = indTotal;
                System.out.println("Toplam bilet tutarı: " + indTotal);
                break;
            case 2:
                total = km * perKm;
                yDis = total * 0.10;
                tDis = total * 0.20;
                indTotal = total - yDis - tDis;
                System.out.println("Toplam bilet tutarı" + indTotal);
                break;
            default:
                System.out.println("Hatalı bir değer girdiniz!");

        } else if (yas >= 65 && yas <=120) {
            System.out.println("Seyahat türünü giriniz: 1- Tek Gidiş 2-Gidiş Dönüş");
            trvlType = input.nextInt();
        }
        switch (trvlType) {
            case 1:
                total = km * perKm;
                yDis = total * 0.30;
                indTotal = total - yDis;
                tDis = indTotal;
                System.out.println("Toplam bilet tutarı:" + indTotal);
                break;
            case 2:
                total = perKm * km;
                yDis = total * 0.30;
                tDis = total * 0.20;
                indTotal = total - yDis - tDis;
                System.out.println("Toplam bilet tutarı: " + indTotal);
                break;

        }else if (yas >= 25 && yas <= 64) {
            System.out.println("Seyahat türünü giriniz: 1- Tek Gidiş 2- Gidiş Dönüş");
            trvlType = input.nextInt();
        }
        switch (trvlType) {
            case 1:
                total = km * perKm;
                indTotal = total;
                tDis = indTotal;
                System.out.println("Toplam bilet tutarı:" + indTotal);
                break;
            case 2:
                total = perKm * km;
                tDis = total * 0.20;
                indTotal = total - tDis;
                System.out.println("Toplam bilet tutarı: " + indTotal);
                break;
        }
    }

}
