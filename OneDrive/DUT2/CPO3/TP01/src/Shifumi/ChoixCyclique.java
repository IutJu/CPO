package Shifumi;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("796193a7-68c3-4de6-b0fc-d4c1e08c1c0d")
public class ChoixCyclique implements Strategie {

    Choix sonChoixPrecedent;
    
    @objid ("f46c27a8-e595-4918-b111-1c5712482743")
    @Override
    public Choix DemarrerCoup() {
        if(sonChoixPrecedent == Choix.CISEAUX)
            return Choix.PAPIER;
        else if(sonChoixPrecedent == Choix.PAPIER)
            return Choix.PIERRE;
        else
            return Choix.CISEAUX;
    }

}
