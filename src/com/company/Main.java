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

/* Egy int típusú változóba deklaráltam az átváltani kívánt decilitert,
 majd átváltottam a megadott mértékegységekbe és kiirattam a konzolra.*/

        int dl=23;
        System.out.println(dl+" dl = "+dl*100+" ml");
        System.out.println(dl+" dl = "+dl*10+" cl");
        System.out.println(dl+" dl = "+dl*0.1+" l");
        System.out.println(dl+" dl = "+dl*0.001+" hl");
        

    }
}
