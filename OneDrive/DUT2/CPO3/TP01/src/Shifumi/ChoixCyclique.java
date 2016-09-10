package Shifumi;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("796193a7-68c3-4de6-b0fc-d4c1e08c1c0d")
public class ChoixCyclique implements Strategie {

    public Joueur leJoueur;
    Choix sonChoixPrecedent;
    
    ChoixCyclique(Joueur unJoueur) {
        leJoueur = unJoueur;
    }
    @objid ("f46c27a8-e595-4918-b111-1c5712482743")
    @Override
    public void DemarrerCoup() {
        if(sonChoixPrecedent == Choix.CISEAUX)
            leJoueur.choix = Choix.PAPIER;
        else if(sonChoixPrecedent == Choix.PAPIER)
            leJoueur.choix = Choix.PIERRE;
        else
            leJoueur.choix = Choix.CISEAUX;
    }

}
