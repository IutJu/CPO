package Shifumi;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("61839994-e1cc-4520-b782-6e5cbea4e285")
public class Joueur {
    @objid ("88a0caab-ed59-46d7-8dd0-bb22341156a9")
    private Integer score;

    @objid ("23a2782f-4e89-4b0a-a484-0616cd9e9b06")
    private String nom;

    @objid ("b3407947-bffc-4e66-ace6-41733cd65154")
    public Choix choix;

    @objid ("3f69dcfe-92b2-4c1d-9cf5-8dcd7d70dad3")
    public Strategie strategie;

    @objid ("d2e5a65b-3f25-445d-9ea8-b0992efdd426")
    public void Jouer() {
        this.strategie.DemarrerCoup();
    }

    @objid ("27ecfba4-25ba-498b-92d4-f04e272bff47")
    public Integer getScore() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.score;
    }

    @objid ("ef38a798-43a7-48cd-9d88-957b6763667b")
    public void setScore(final Integer value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.score = value;
    }

    @objid ("e2b344e6-cacd-4de2-9bb3-b1609bc9b0d2")
    public String getNom() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.nom;
    }

    @objid ("6837137a-ae83-4052-8379-356c57aa0386")
    public void setNom(final String value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.nom = value;
    }

}