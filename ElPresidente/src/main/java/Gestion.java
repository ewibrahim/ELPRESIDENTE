import java.util.Random;

public class Gestion {
    public static void main(String[] args) {

        //Classe qui lance le programme et qui gère chaque tour

        int saison = 1;
        int score = 0;

        Isle uneIsle = new Isle ();
        Events unEvent = new Events();
        Factions uneFaction = new Factions();

        uneIsle.choixDiff();

        do{
            if(saison %5 == 0){

                //On accède à cette etape lorsque 4 saisons sont passées

                Isle.money += Isle.industrialization*10;
                Isle.nourriture += Isle.agriculture*40;

                int choix = 0;
                do {
                    System.out.println("\n"+ConsoleColors.RED+"------------ Choisissez une faction à soudoyer ------------\n"+ ConsoleColors.RESET);
                    System.out.println("1- Soudoyer");
                    System.out.println("2- Marché Alimentaire"+ConsoleColors.GREEN+"(indisponible pour le moment)\n"+ConsoleColors.RESET);
                    System.out.println("0- Quitter");

                    System.out.println("\nVotre choix :");
                    choix = Console.saisirInt();
                    switch(choix)
                    {
                        case 1 : uneIsle.soudoyer()    ;break;
                    }
                }while (choix != 0);
            }

            uneFaction.etatFactions();

            //On affiche un evenement random

            Random rand = new Random();
            switch (rand.nextInt(5)+1){
                case 1: unEvent.manifestation();break;
                case 2: unEvent.or();break;
                case 3: unEvent.tremblement();break;
                case 4: unEvent.salaire();break;
                case 5: unEvent.immigration();break;
            }

            saison += 1;
            score += 10;

        }while(Factions.globalSatisf > 25*(Isle.difficulte));

        //Fin de jeu on affiche le score
        System.out.println("Partie terminée score: "+score);
    }
}
