package Shifumi;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("44b6f134-8b2c-4d66-9795-7833657c3cce")
public class ChoixIdentique implements Strategie {

    public Joueur leJoueur;
    ChoixIdentique(Joueur unJoueur) {
        leJoueur = unJoueur;
    }
    @objid ("7b00759d-c75b-4bfa-963b-df9c7106fc79")
    public void DemarrerCoup() {
        leJoueur.choix = Choix.CISEAUX;
    }

}
