import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Armut : 2,14 TL
        Elma : 3,67 TL
        Domates : 1,11 TL
        Muz: 0,95 TL
        Patlıcan : 5,00 TL
        */

        double armut = 2.14 , elma = 3.67, domates = 1.11, muz = 0.95, patlican = 5;
        double toplamTutar;

        Scanner input = new Scanner(System.in);
        System.out.print("Armut Kaç Kilo ? ");
        double armutKilo  = input.nextDouble();

        System.out.print("Elma Kaç Kilo ? ");
        double elmaKilo = input.nextDouble();

        System.out.print("Domates Kaç Kilo ? ");
        double domatesKilo = input.nextDouble();

        System.out.print("Muz Kaç Kilo ? ");
        double muzKilo = input.nextDouble();

        System.out.print("Patlıcan Kaç Kilo ? ");
        double patlicanKilo = input.nextDouble();

        toplamTutar = (armut*armutKilo) + (elma*elmaKilo) + (domates*domatesKilo) + (muz*muzKilo) + (patlican*patlicanKilo);
        System.out.print("Toplam Tuttar: " +toplamTutar);

        
    }
}