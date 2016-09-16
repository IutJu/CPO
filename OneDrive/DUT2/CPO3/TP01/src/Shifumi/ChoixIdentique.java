package Shifumi;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import java.util.Random;

/**
 * Il s'agit d'une strategie du bot, qui consiste a prendre toujours le meme choix.
 */
@objid ("44b6f134-8b2c-4d66-9795-7833657c3cce")
public class ChoixIdentique implements Strategie {

    public Random random = new Random();
    Choix sonChoixPrecedent;
    /**
     * Choisir toujours cieaux
     */
    @objid("7b00759d-c75b-4bfa-963b-df9c7106fc79")
    @Override
    public Choix DemarrerCoup() {
        
        if(sonChoixPrecedent==null){
            int sonChoix = random.nextInt()%3;
                switch(sonChoix){
                    case 0:
                        sonChoixPrecedent = Choix.CISEAUX;
                        return Choix.CISEAUX;
                    case 1:
                        sonChoixPrecedent = Choix.PAPIER;
                        return Choix.PAPIER;
                    default:
                        sonChoixPrecedent = Choix.PIERRE;
                        return Choix.PIERRE;
            }
        }   
        else if(sonChoixPrecedent == Choix.PAPIER){
            return Choix.PAPIER;
        }
        else if(sonChoixPrecedent == Choix.CISEAUX){
            return Choix.CISEAUX;
        }
        else {
            return Choix.PIERRE;
        }

    }
}    
