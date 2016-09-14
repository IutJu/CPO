package Shifumi;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("796193a7-68c3-4de6-b0fc-d4c1e08c1c0d")
/**
 * Il s'agit d'une strategie du bot, qui consiste a prendre un choix aleatoire en fonction du choix fait precedemment.
 */
public class ChoixCyclique implements Strategie {

    Choix sonChoixPrecedent;
    
    @objid ("f46c27a8-e595-4918-b111-1c5712482743")
    @Override
    /**
     * Choisir un choix en fonction du choix precedent. Default: CISEAUX
     */
    public Choix DemarrerCoup() {
        if(sonChoixPrecedent == Choix.CISEAUX)
        {
            sonChoixPrecedent = Choix.PAPIER;
            return Choix.PAPIER;
        }
        else if(sonChoixPrecedent == Choix.PAPIER)
        {
            sonChoixPrecedent = Choix.PIERRE;
            return Choix.PIERRE;
        }
        else
            sonChoixPrecedent = Choix.CISEAUX;
            return Choix.CISEAUX;
    }

}
