package Shifumi;

import java.util.Random;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("b1a7ecdb-88e9-4e8b-8467-bdff91a1a24b")
public class ChoixAleatoire implements Strategie {
    @objid ("8b7164df-78ec-4dc4-bc00-dbcf1d28a943")
    public Random random;

    @objid ("6cd307bc-a5d6-4d6d-856e-aac2fa231760")
    public Joueur leJoueur;

    @objid ("ac10c713-431d-468b-af66-2ee92e45d8de")
    public void DemarrerCoup() {
        int sonChoix = random.nextInt()%3;
        switch(sonChoix){
            case 0:
                leJoueur.choix = Choix.CISEAUX;
                break;
            case 1:
                leJoueur.choix = Choix.PAPIER;
                break;
            default:
                leJoueur.choix = Choix.PIERRE;
                break;
        }
    }

    @objid ("0b583b79-2134-46ef-a3ba-e50e81fd8307")
    ChoixAleatoire(Joueur unJoueur) {
        leJoueur = unJoueur;
    }
}
