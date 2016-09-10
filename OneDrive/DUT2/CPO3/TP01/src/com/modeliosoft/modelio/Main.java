package com.modeliosoft.modelio;

import Shifumi.Joueur;
import Shifumi.Systeme;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("27aebeae-b75c-4a26-a645-b1f76a0f1eb8")
public class Main {
    @objid ("e32d5a6e-20c4-47c4-b1d6-5e7d020d330d")
    public static void main(final String[] args) {
        System.out.println("Hello Modelio");
        
        //Ajouter 2 joueurs
        Joueur leJoueur1 = new Joueur();
        Joueur leJoueur2 = new Joueur();
        
        // Ajouter le systeme
        Systeme leSysteme = new Systeme();
        leSysteme.player.add(leJoueur1);
        leSysteme.player.add(leJoueur2);
        
        // Demarrer le jeu
        leSysteme.demarrerJeu();
    }

}
