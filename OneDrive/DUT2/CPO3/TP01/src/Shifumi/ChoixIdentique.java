package Shifumi;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

/**
 * Il s'agit d'une strategie du bot, qui consiste a prendre toujours le meme choix.
 */
@objid ("44b6f134-8b2c-4d66-9795-7833657c3cce")
public class ChoixIdentique implements Strategie {

    /**
     * Choisir toujours cieaux
     */
    @objid("7b00759d-c75b-4bfa-963b-df9c7106fc79")
    @Override
    public Choix DemarrerCoup() {
        return Choix.CISEAUX;
    }

}
