package variabler;

import javax.swing.JOptionPane;

public class CharTest {
public static void main(String[] args) {
    

    char c = '\u0041';

    int teckenkod= c+9;

    char c1=(char)teckenkod;

    System.out.println(teckenkod);
    JOptionPane.showMessageDialog(null, c1);

    char c2= 'A';
    char c3='\t';

    String namn = "daniel";
    int antal =namn.length();

    for(int i=0;i<antal;i=i+2){

        namn.charAt(i);
        System.out.println(i);
    }



}
}
