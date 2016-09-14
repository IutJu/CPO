package Shifumi;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

/**
 * @author Minh Hoang DANG
 */
@objid ("1f3a55a8-fbe1-4220-94e5-a33aa6a7745c")
public enum Choix {

    /**
     * Quand on serre les cinqs doigts, ca donne un pierre
     */
    PIERRE,

    /**
     * Quand on ecarte les cinq doigts, ca donne le papier
     */
    PAPIER,

    /**
     * V pour Victor et aussi un paire de ciseaux
     */
    CISEAUX,
       
    /*private final int value;
    private Choix(int value){
        this.value = value;
    }
    
    public int getValue(){
        return value;
    }*/
}

