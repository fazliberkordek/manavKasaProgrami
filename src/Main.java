/**
 * @author fazliberkordek 21 Mart 2023 - 16:47 UTC +3
 */
import java.util.Scanner;
/*Todo:
    -Manav Kasa Programı
        -Java ile kullanıcıların manavdan almış oldukları ürünlerin kilogram değerlerine göre toplam tutarını ekrana yazdıran programı yazın.
        -Meyveler ve KG Fiyatları
            *Armut : 2,14 TL
            *Elma : 3,67 TL
            *Domates : 1,11 TL
            *Muz: 0,95 TL
            *Patlıcan : 5,00 TL


 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Difene the prices and variables
        double pearPrice = 2.14,applePrice = 3.67,tomatoPrice = 1.11,bananaPrice= 0.95,eggPlant = 5;
        double amountPP,amountAP,amountTP,amountBP,amountEP;

        System.out.print("Amount of the Pear kg ?");
        amountPP = input.nextDouble();

        System.out.print("Amount of the Apple kg ?");
        amountAP = input.nextDouble();

        System.out.print("Amount of the Tommato kg ?");
        amountTP = input.nextDouble();

        System.out.print("Amount of the Banana kg ?");
        amountBP = input.nextDouble();

        System.out.print("Amount of the Egg Plant kg ?");
        amountEP = input.nextDouble();

        System.out.println("Total Cost is : " + (amountPP*pearPrice + amountAP*applePrice + amountTP*tomatoPrice + amountBP * bananaPrice + amountEP*eggPlant)+"TL");




    }
}