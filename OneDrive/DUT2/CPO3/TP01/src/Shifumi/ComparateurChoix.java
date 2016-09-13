package Shifumi;

import java.util.Comparator;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("8a210d47-3cce-46b5-9817-fa6c9adc318e")
/**
 * Comparer le choix des deux joueur. leResultat est prepresente par la soustraction des valeur converties des choix
 * @return l'ID du gagnant, ou 2 si match nul
 */
public class ComparateurChoix implements Comparator {
    
    /**
     * Constructeur
     */
    public ComparateurChoix()
    {
        
    }
    
    @objid ("a3a73f22-9391-437e-9a5b-743205ece00c")
    /**
     * Comparer les choix en se basant sur la soustraction des deux.
     * @return l'ID du gagnant ou code 2 si match nul
     */
    public int comparerChoix(final Choix choix1, final Choix choix2) {
        int leResultat = choix1.ordinal() - choix2.ordinal();
        switch(leResultat)
        {
            case -2: case 1:
                return 0;
            
            case 2: case -1:
                return 1;
                
            default:
                return 2;
                
        }
    }

    @Override
    public int compare(Object o1, Object o2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
