package variabler;

import javax.swing.JOptionPane;

public class Moms {

    public static void main(String[] args) {
        
        String prisVaraUtanMomsString=JOptionPane.showInputDialog("ange pris på vara");

        double prisVaraUtanMoms=Double.valueOf(prisVaraUtanMomsString);

        double prisMedMoms=1.25*prisVaraUtanMoms;

        JOptionPane.showMessageDialog(null,prisMedMoms);


    }

}
