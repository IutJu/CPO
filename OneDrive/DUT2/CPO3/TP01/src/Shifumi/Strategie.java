package Shifumi;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

/**
 * Une strategie definit la facon ou le joueur prend un choix, selon sa nature (bot ou humain)
 */
@objid ("46c7aba0-0600-41b4-995e-f776223e0df6")
public interface Strategie {
    /**
     * Commence a joueur
     * @return le choix joue par le joueur
     */
    @objid ("aa69f17a-a805-494f-8d7b-3d50ffbbf156")
    Choix DemarrerCoup();

}
