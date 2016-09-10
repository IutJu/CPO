package Shifumi;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("1f3a55a8-fbe1-4220-94e5-a33aa6a7745c")
public enum Choix {
    PIERRE(0),
    PAPIER(1),
    CISEAUX(2);
    
    private final int value;
    private Choix(int value){
        this.value = value;
    }
    
    public int getValue(){
        return value;
    }
}

