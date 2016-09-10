package Shifumi;

import java.util.Scanner;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("79311702-dcf1-4e03-ba29-6c297b1fffcf")
public class SaisieClavier implements Strategie {
        
    @objid ("eb9f9aa0-1b0b-40c9-bd53-c964bed2a345")
    public Scanner scanner;

    @objid ("00648ce5-a756-4541-b0bd-58752e2897aa")
    @Override
    public Choix DemarrerCoup() {
        
        int sonChoix = 0;
        Scanner reader = new Scanner(System.in);
        while(sonChoix <= 0 || sonChoix > 3)
        {
            System.out.println("Votre choix?\n\t1.Ciseaux\n\t2.Papier\n\t3.Pierre");
            sonChoix = reader.nextInt();
        }
        
        switch(sonChoix){
            case 1:
                return Choix.CISEAUX;
            case 2:
                return Choix.PAPIER;
            default:
                return Choix.PIERRE;
        }
        
    }

}
