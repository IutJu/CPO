package Shifumi;

import java.util.Comparator;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("8a210d47-3cce-46b5-9817-fa6c9adc318e")
public class ComparateurChoix implements Comparator {
    @objid ("a3a73f22-9391-437e-9a5b-743205ece00c")
    public void comparerChoix(final Choix choix1, final Choix choix2) {
        int leResultat = choix1.getValue() - choix2.getValue();
        switch(leResultat)
        {
            case -2:
                
        }
    }

}
