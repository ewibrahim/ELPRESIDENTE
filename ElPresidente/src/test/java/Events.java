public class Events {

    public Events(){

    }
    public void manifestation() {

        int choix = 0;
        do {
            System.out.println("\nLe peuple est en colère et manifeste dans les rues. \n");
            System.out.println("  1- Calmer le peuple en promettant une augmentation de revenu pour tous les citoyens" + ConsoleColors.YELLOW+" (-15% de satisfaction pour les capitalistes et -100$)"+ConsoleColors.RESET);
            System.out.println("  2- Ignorer le peuple" + ConsoleColors.YELLOW+" (-15% de satisfaction pour les ecologistes et + 15% pour les militaristes)"+ ConsoleColors.RESET);

            System.out.println("\nVotre choix :"+ ConsoleColors.RESET);
            choix = Console.saisirInt();
            switch(choix)
            {
                case 1 :
                    Factions.capitalists.satisfaction *= (1-Isle.difficulte*0.15);
                    Isle.money -= 100;
                    break;
                case 2 :
                    Factions.ecologists.satisfaction *= (1-Isle.difficulte*0.15);
                    Factions.militarists.satisfaction *= 1.15;
                    break;
            }
        }while (choix == 0);
    }

    public void or() {

        int choix = 0;
        do {
            System.out.println("\nGisement d'or découvert . \n");
            System.out.println("  1- Privatiser le gisement" + ConsoleColors.YELLOW+" (+15% de satisfaction pour les capitalistes, +30% industrie et +300$)"+ConsoleColors.RESET);
            System.out.println("  2- Exploiter le gisement pour le peuple" + ConsoleColors.YELLOW+" (-15% de satisfaction pour les capitalistes +15% industrie et +15% pour les communistes)"+ ConsoleColors.RESET);

            System.out.println("\nVotre choix :"+ ConsoleColors.RESET);
            choix = Console.saisirInt();
            switch(choix)
            {
                case 1 :
                    if(Isle.industrialization+Isle.agriculture<=100) { Isle.industrialization += 30;}
                    Factions.capitalists.satisfaction *= 1.15;
                    Isle.money += 300;
                    break;
                case 2 :
                    if(Isle.industrialization+Isle.agriculture<=100) { Isle.industrialization += 15;}
                    Factions.capitalists.satisfaction *= (1-Isle.difficulte*0.15);
                    Factions.communists.satisfaction *= 1.15;
                    break;
            }
        }while (choix == 0);
    }

    public void tremblement () {

        int choix = 0;
        do {
            System.out.println("\n Un tremblement de terre a frappé l'ile. \n");
            System.out.println("  1- Etat d'urgence, sauve qui peut !" + ConsoleColors.YELLOW+" (-20% de satisfaction pour les capitalistes," +
                    " militaristes, communistes, nationalistes, liberaux et -20% d'industrie et d'agriculture)"+ConsoleColors.RESET);

            System.out.println("\nVotre choix :"+ ConsoleColors.RESET);
            choix = Console.saisirInt();
            switch(choix)
            {
                case 1 :
                    if(Isle.industrialization+Isle.agriculture<=100) {
                        Isle.industrialization -= 20;
                        Isle.agriculture -= 20;
                    }
                    Factions.capitalists.satisfaction *= (1-Isle.difficulte*0.20);
                    Factions.militarists.satisfaction *= (1-Isle.difficulte*0.20);
                    Factions.communists.satisfaction *= (1-Isle.difficulte*0.20);
                    Factions.nationalists.satisfaction *= (1-Isle.difficulte*0.20);
                    Factions.liberals.satisfaction *= (1-Isle.difficulte*0.20);
                    break;
            }
        }while (choix == 0);
    }

    public void salaire () {

        int choix = 0;
        do {
            System.out.println("\n L'assemblée nationale propose l'augmentation du salaire du président de 200%. \n");
            System.out.println("  1- Oui");
            System.out.println("  2- Non");

            System.out.println("\nVotre choix :"+ ConsoleColors.RESET);
            choix = Console.saisirInt();
            switch(choix)
            {
                case 1 :
                    System.out.println("\nLe peuple manifeste et abime les rues " + ConsoleColors.YELLOW+"(-150$)"+ ConsoleColors.RESET);
                    Isle.money -= 150;
                    break;

                case 2 :
                    System.out.println("\nVotre geste est salué par le peuple"+ ConsoleColors.YELLOW+" (+15% satisfaction loyalistes et nationalistes) "+ ConsoleColors.RESET);
                    Factions.loyalists.satisfaction *= 1.15;
                    Factions.nationalists.satisfaction *= 1.15;
                    break;
            }
        }while (choix == 0);
    }

    public void immigration () {

        int choix = 0;
        do {
            System.out.println("\n L'ONU vous propose d'accueillir des réfugiés de guerre. \n");
            System.out.println("  1- Accepter parce qu'ils font partie de la meme religion "+ ConsoleColors.YELLOW+"(+20% satisfaction pour les loyalistes et religieux " +
                    "et -15% satisfaction pour les nationalistes"+ ConsoleColors.RESET);
            System.out.println("  2- Refuser" + ConsoleColors.YELLOW+" (-15% de satisfaction pour les religieux, communistes et +20% de satisfaction pour les nationalistes"+ ConsoleColors.RESET);
            System.out.println("  3- Accepter avec conditions d'aide" + ConsoleColors.YELLOW+" (+400$ et -25% de satisfaction pour les nationalistes"+ ConsoleColors.RESET);

            System.out.println("\nVotre choix :"+ ConsoleColors.RESET);
            choix = Console.saisirInt();
            switch(choix)
            {
                case 1 :
                    Factions.loyalists.satisfaction *= 1.20;
                    Factions.religious.satisfaction *= 1.20;
                    Factions.nationalists.satisfaction *= (1-Isle.difficulte*0.15);
                    break;

                case 2 :
                    Factions.religious.satisfaction *= (1-Isle.difficulte*0.15);
                    Factions.communists.satisfaction *= (1-Isle.difficulte*0.15);
                    Factions.nationalists.satisfaction *= 1.20;
                    break;

                case 3 :
                    Isle.money += 400;
                    Factions.nationalists.satisfaction *= (1-Isle.difficulte*0.25);
                    break;
            }
        }while (choix == 0);
    }

}
