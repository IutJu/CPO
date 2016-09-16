package Shifumi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

/**
 * Le system gere le deroulement du jeu. Il demarre les parties, affecter les points, determiner et annoncer le gagnant
 */
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
    public ComparateurChoix comparateurChoix = new ComparateurChoix();

    /**
     * Annoncer le resultat final du jeu
     */
    @objid("4c135483-1478-4b52-8fd7-5eca7f98f407")
    public void annoncerGagnant() {
        int leScoreP1 = this.player.get(0).getScore();
        int leScoreP2 = this.player.get(1).getScore();

        System.out.println("Joueur " + this.player.get(0).getNom() + " remporte avec " + Integer.toString(leScoreP1) + " point(s)");
        System.out.println("Joueur "+this.player.get(1).getNom()+" remporte avec "+Integer.toString(leScoreP2)+" point(s)");
        
        if(leScoreP1 > leScoreP2)
            System.out.println(this.player.get(0).getNom()+ " emerge victorieux!");
        else if(leScoreP1 < leScoreP2)
            System.out.println(this.player.get(1).getNom()+ " emerge victorieux!");
        else
            System.out.println("It is a draw!");
    }

    /**
     * Demarrer le jeu. Tous les fonctionalites du jeu se trouvent ici
     */
    @objid ("1c4f0a5c-a455-40f8-9927-bede541ab2b9")
    public void demarrerJeu() {
        //Demander une strategie pour chaque joueur              
        for (int i = 0; i < 2; i++) {
            
            //Faire une variable pour chaque joueur (optimization)
            Joueur leJoueur = this.player.get(i);        
            int choixDuJoueur = 0;
            Scanner reader = new Scanner(System.in);
            while (choixDuJoueur == 0 || choixDuJoueur > 2) {
                System.out.println("Quelle strategie pour le joueur?\n\t1.Bot\n\t2.Human");
                choixDuJoueur = reader.nextInt();
            }
        
            // Cas ou le joueur est BOT
            if (choixDuJoueur == 1) {
                int choixDuBot = 0;
                Scanner reader1 = new Scanner(System.in);
                while (choixDuBot == 0 || choixDuBot > 3) {
                    System.out.println("Quelle strategie pour le bot?\n\t1.Coup aleatoire\n\t2.Coup cyclique\n\t3.Coup identique");
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
                if("Bot".equals(this.player.get(0).getNom()))
                {
                    this.player.get(0).setNom("Bot1");
                    this.player.get(1).setNom("Bot2");
                }
                else
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
        
        // Demander le nombre de tours
        System.out.println("Combien de tours?");
        Scanner reader = new Scanner(System.in);
        this.nbTours = reader.nextInt();
        
        // Demarrer les tours
        for(int j = 0; j < this.nbTours; j++)
        {
            for(int i = 0; i < 2; i++)
            {
                Joueur leJoueur = this.player.get(i);
                leJoueur.Jouer();
            }
            
            // Comparer le choix et affecter le score des joueur
            System.out.println("Joueur "+this.player.get(0).getNom()+" joue "+this.player.get(0).choix.name());
            System.out.println("Joueur "+this.player.get(1).getNom()+" joue "+this.player.get(1).choix.name());
            
            int leGagnant = this.comparateurChoix.comparerChoix(this.player.get(0).choix, this.player.get(1).choix);    
            if(leGagnant == 2){
                System.out.println("Match nul");
                this.player.get(0).setScore(this.player.get(0).getScore()+1);
                this.player.get(1).setScore(this.player.get(1).getScore()+1);
            }
                
            else
            {
                this.player.get(leGagnant).setScore(this.player.get(leGagnant).getScore()+2);
                System.out.println(this.player.get(leGagnant).getNom()+" gagne");
            }
        }
        this.annoncerGagnant();
    }

}
