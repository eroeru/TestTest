package ee.E;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {


        //Harjutus 1:

        System.out.println("Siia tuleb esimene vastus:");
        double pi = Math.PI;

        System.out.println(pi * 2);


        //Harjutus 2 invoke:
        System.out.println("\n Siia tuleb teine vastus:");
        //siia võib sisendi saamiseks Hennu stiilis skänneri teha vms. sry for unclarity.
        int a = 5;
        int b = 6;
        System.out.println(equality(a, b));


        //Harjutus 3 invoke:
        System.out.println("\n Siia tuleb kolmas vastus:");

        String[] andmebaas = new String[]{"Nimi61", "Nimi62", "NimiTestTestTest18"};
        System.out.println(Arrays.toString(intoNameLength(andmebaas)));




        //Harjutus 4 invoke:
        System.out.println("\n Siia tuleb neljas vastus:");




        ArrayList<Integer> yearValues = new ArrayList<Integer>() {{
            add(0);
            add(1);
            add(128);
            add(598);
            add(1624);
            add(1827);
            add(1996);
            add(2017);

        }};


        for (int i = 0; i < yearValues.size(); i++) {

            Integer cent = yearValues.get(i);
            System.out.println(century (cent));

        }




//Harjutus 5 teises klassis


    }




    //Harjutus 2 meetod:

    public static boolean equality(int a, int b) {

        if (a == b) {
            return true;
        } else {
            return false;
        }


    }



    //Harjutus 3 meetod:



    public static Integer[] intoNameLength (String[] andmebaas) {

        int dataTimes = andmebaas.length;
        Integer[] andmebaas2 = new Integer[dataTimes];


        for (int i = 0; i < andmebaas.length; i++) {

            int wordL = andmebaas[i].length();
            andmebaas2[i] = wordL;

        }

        return andmebaas2;

    }






    //Harjutus 4 meetod:



// Ma sain guugeldatud kuidas Integerist byte-i saab, aga int-ist ei saand cast'itud. Kulutasin ainult aega. :(


    public static Byte century (Integer a) {

        byte century = 0;

        if (a >= 1 && a <= 2018) {
            Integer b = a / 100 + 1;
            century = b.byteValue();

        } else {
            century = -1;
        }


        return century;
    }






}




