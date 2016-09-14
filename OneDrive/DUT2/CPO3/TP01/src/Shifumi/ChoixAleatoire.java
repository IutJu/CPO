package Shifumi;

import java.util.Random;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

/**
 * Il s'agit d'une strategie du bot, qui consiste a prendre un choix aleatoire parmis les trois disponibles.
 */
@objid ("b1a7ecdb-88e9-4e8b-8467-bdff91a1a24b")
public class ChoixAleatoire implements Strategie {
    @objid ("8b7164df-78ec-4dc4-bc00-dbcf1d28a943")
    public Random random = new Random();

    /**
     * Prendre un choix aleatoire parmis les trois
     */
    @objid ("ac10c713-431d-468b-af66-2ee92e45d8de")
    @Override
    public Choix DemarrerCoup() {
        int sonChoix = random.nextInt()%3;
        switch(sonChoix){
            case 0:
                return Choix.CISEAUX;
            case 1:
                return Choix.PAPIER;
            default:
                return Choix.PIERRE;
        }
    }
}
