package Shifumi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("c27fecff-36ba-4036-b116-72619f67198f")
public class Systeme {
    @objid ("a811842f-c702-4613-a706-445082a3721c")
    private Integer nbTours;

    /**
     * Liste des joueurs
     */
    @objid ("f1057e8e-3239-496c-85b8-467d3fb46d01")
    public List<Joueur> player = new ArrayList<>();

    /**
     * Le comparateur qui permet de comparer le choix des joueurs puis affecter les score
     */
    @objid ("b402c1bb-29ba-45ad-972f-bc01f5510cec")
    public ComparateurChoix comparateurChoix;

    @objid ("3d0dd2e5-2505-498c-95f7-e77fa0fe89f8")
    public Integer getNbTours() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.nbTours;
    }

    @objid ("9b3e12dc-336c-48cd-86e5-c608ebb87ec4")
    public void setNbTours(final Integer value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.nbTours = value;
    }

    @objid ("4c135483-1478-4b52-8fd7-5eca7f98f407")
    public void annoncerGagnant() {
        int leScoreP1 = this.player.get(0).getScore();
        int leScoreP2 = this.player.get(1).getScore();
        
        if(leScoreP1 > leScoreP2)
            System.out.println(this.player.get(0).getNom()+ "emerge victorieux!");
        else if(leScoreP1 < leScoreP2)
            System.out.println(this.player.get(1).getNom()+ "emerge victorieux!");
        else
            System.out.println("It is a draw!");
    }

    @objid ("1c4f0a5c-a455-40f8-9927-bede541ab2b9")
    public void demarrerJeu() {
        //Demander une strategie pour chaque joueur              
        for (int i = 0; i < 2; i++) {
            
            //Faire une variable pour chaque joueur (optimization)
            Joueur leJoueur = this.player.get(i);        
            int choixDuJoueur = 0;
            Scanner reader = new Scanner(System.in);
            while (choixDuJoueur == 0 || choixDuJoueur > 2) {
                System.out.println("Quel strategie pour le premier joueur?\n\t1.Bot\n\t2.Human");
                choixDuJoueur = reader.nextInt();
            }
        
            // Cas ou le joueur est BOT
            if (choixDuJoueur == 1) {
                int choixDuBot = 0;
                Scanner reader1 = new Scanner(System.in);
                while (choixDuBot == 0 || choixDuBot > 3) {
                    System.out.println("Quel strategie pour le bot?\n\t1.Coup aleatoire\n\t2.Coup cyclique\n\t3.Coup identique");
                    choixDuBot = reader1.nextInt();
                }
        
                switch (choixDuBot) {
                    case 1:
                        leJoueur.strategie = new ChoixAleatoire();
                        break;
        
                    case 2:
                        leJoueur.strategie = new ChoixCyclique();
                        break;
        
                    default:
                        leJoueur.strategie = new ChoixIdentique();
                        break;
                }
                
                // Nommer le bot
                leJoueur.setNom("Bot");
        
            }
            else
            {
                System.out.println("Ce joueur est un humain");
                leJoueur.strategie = new SaisieClavier();
                
                // Demander le nom
                System.out.println("Saisissez votre nom: ");
                Scanner reader2 = new Scanner(System.in);
                leJoueur.setNom(reader2.nextLine());
            }
        }
        
        // Demarrer les tours
        for(int j = 0; j < this.nbTours; j++)
        {
            for(int i = 0; i < 2; i++)
            {
                Joueur leJoueur = this.player.get(i);
                leJoueur.Jouer();
            }
            
            // Comparer le choix et affecter le score des joueur
            this.comparateurChoix.comparerChoix(this.player.get(0).choix, this.player.get(1).choix);      
        }
        this.annoncerGagnant();
    }

}
