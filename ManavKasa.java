package Giris;

import java.util.Scanner;

public class ManavKasa {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        double armutKg,elmaKg,domatesKg,muzKg,patlıcanKg;
        double armutFiyat=2.14;
        double elmaFiyat=3.67;
        double domatesFiyat=1.11;
        double muzFiyat=0.95;
        double patlıcanFiyat=5.00;
        System.out.print("Kaç kilo armut : ");
        armutKg= input.nextDouble();
        System.out.print("Kaç kilo elma : ");
        elmaKg= input.nextDouble();
        System.out.print("Kaç kilo domates : ");
        domatesKg= input.nextDouble();
        System.out.print("Kaç kilo muz : ");
        muzKg= input.nextDouble();
        System.out.print("Kaç kilo patlıcan : ");
        patlıcanKg = input.nextDouble();
        double tutar= (armutKg*armutFiyat)+(elmaFiyat*elmaKg)+(domatesFiyat*domatesKg)+(muzFiyat*muzKg)+(patlıcanFiyat*patlıcanKg);
        System.out.print("Tutar : "+tutar);
    }
}
