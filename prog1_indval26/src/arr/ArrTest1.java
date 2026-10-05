package arr;

import java.util.Arrays;

public class ArrTest1 {

    public static void main(String[] args) {
        
        int [] i=new int[5];         //skapar ett objekt av en array 5lång, namn ger referensvariabeln ger typ
        int[] k={2,565,787,898,565};  //skapar ny array , anger tal direkt


        i[0]=234;  // tilldelar första platsen i arrayen i
        i[1]=2322;
        i[2]=4343;

        System.out.println(  Arrays.toString(i)   ); // printa hela arrayen på ett enkelt sätt ej snyggt

        String [] s = new String[10]; // samma fast String

         s[0]="hej";



    }


}
