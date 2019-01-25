package ee.E;

public class castingSample {

    public static void main(String args[]){

        int i;
        byte y;
        i = 1024;
        for(i = 1024; i > 0; i-- ){

            y = (byte)i;
            System.out.print(i + " mod 128 = " + i%128 + " also ");
            System.out.println(i + " cast to byte " + " = " + y);

        }

    }


}
