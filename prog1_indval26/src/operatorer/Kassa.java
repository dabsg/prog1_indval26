import javax.swing.JOptionPane;

public class Kassa {

    public static void main(String[] args) {
     
        String StringKostnad=JOptionPane.showInputDialog("vad kostade varorna");

        int kostnad = Integer.valueOf(StringKostnad); 

        String StringErlagt=JOptionPane.showInputDialog("ange erlagt belopp");

        int erlagt = Integer.valueOf(StringErlagt);


        int tillbaka=erlagt-kostnad;

        int tusenlappar= tillbaka/1000;

        int rest =      tillbaka%1000; 

        int femhundralappar=rest/500;

            rest=rest%500;

        System.out.println("tusenlappar:"+tusenlappar+" femhundra: "+femhundralappar);



    }
}
