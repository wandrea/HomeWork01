package com.company;


public class Main {
    public static void main (String [] args){
/*Deklaráltam két int típusú változót, amik a téglalap két oldalának a hosszát tárolják.
 * Majd az int típusú area változóba kiszámoltam a téglalap területét, az int típusú perimeter változóba pedig a kerületét.
  * Kiirattam konzolra a terület és kerület eredményeit.*/

        int sideA =10;
        int sideB=15;
        int area = sideA *sideB;
        int perimeter = (sideA + sideB)*2;

        System.out.println("A téglalap területe: " + area + " cm^2 .\nA téglalap kerülete: " + perimeter + " cm");

    }
}
