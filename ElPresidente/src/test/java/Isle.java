public class Isle {

    static double industrialization;
    static double agriculture;
    static double money;
    static double nourriture;
    public static double difficulte;

    public Isle(){
        this.industrialization = 15;
        this.agriculture = 15;
        this.money = 200;
        this.nourriture = 0;
    }

    public void choixDiff() {
        int choix = 0;
        do {
            System.out.println("\n"+ConsoleColors.RED+"------------ Choisissez un niveau de difficulté ------------\n"+ ConsoleColors.RESET);
            System.out.println("1- Facile ");
            System.out.println("2- Moyen ");
            System.out.println("3- Difficile \n");
            System.out.println("Votre choix :");
            choix = Console.saisirInt();
            switch(choix)
            {
                case 1 : this.difficulte = 0.5 ;break;
                case 2 : this.difficulte = 1   ;break;
                case 3 : this.difficulte = 2   ;break;
            }
        }while (this.difficulte == 0);
    }

    public void soudoyer(){
        int choix = 0;
        int fin = 0;
        do {
            System.out.println("\n"+ConsoleColors.RED+"------------ Choisissez une faction à soudoyer ------------\n"+ ConsoleColors.RESET);
            System.out.println("1- Communistes (+10% de satisfaction)");
            System.out.println("2- Capitalistes (+10% de satisfaction)");
            System.out.println("3- Religieux (+10% de satisfaction)");
            System.out.println("4- Militaristes (+10% de satisfaction)");
            System.out.println("5- Ecologistes (+10% de satisfaction)");
            System.out.println("6- Liberaux (+10% de satisfaction)");
            System.out.println("7- Nationalistes (+10% de satisfaction)\n");
            System.out.println("0- Fin du pot de vin\n");
            System.out.println("Votre choix :");
            choix = Console.saisirInt();
            switch(choix)
            {
                case 1 :
                    System.out.println("\n+10% de satisfaction");
                    if(money>= 15*Factions.communists.partisan){
                        int montant = 15*Factions.communists.partisan;
                        money -= montant;
                        Factions.communists.satisfaction *= 1.10;
                        Factions.loyalists.satisfaction -= (montant/10);
                    } break;
                case 2 :
                    System.out.println("\n+10% de satisfaction");
                    if(money>= 15*Factions.capitalists.partisan){
                        int montant = 15*Factions.capitalists.partisan;
                        money -= montant;
                        Factions.capitalists.satisfaction *= 1.10;
                        Factions.loyalists.satisfaction -= (montant/10);
                    } break;
                case 3 :
                    System.out.println("\n+10% de satisfaction");
                    if(money>= 15*Factions.religious.partisan){
                        int montant = 15*Factions.religious.partisan;
                        money -= montant;
                        Factions.religious.satisfaction *= 1.10;
                        Factions.loyalists.satisfaction -= (montant/10);

                    } break;
                case 4 :
                    System.out.println("\n+10% de satisfaction");
                    if(money>= 15*Factions.militarists.partisan){
                        int montant = 15*Factions.militarists.partisan;
                        money -= montant;
                        Factions.militarists.satisfaction *= 1.10;
                        Factions.loyalists.satisfaction -= (montant/10);
                    } break;
                case 5 :
                    System.out.println("\n+10% de satisfaction");
                    if(money>= 15*Factions.ecologists.partisan){
                        int montant = 15*Factions.ecologists.partisan;
                        money -= montant;
                        Factions.ecologists.satisfaction *= 1.10;
                        Factions.loyalists.satisfaction -= (montant/10);
                    } break;
                case 6 :
                    System.out.println("\n+10% de satisfaction");
                    if(money>= 15*Factions.liberals.partisan){
                        int montant = 15*Factions.liberals.partisan;
                        money -= montant;
                        Factions.liberals.satisfaction *= 1.10;
                        Factions.loyalists.satisfaction -= (montant/10);
                    } break;
                case 7 :
                    System.out.println("\n+10% de satisfaction");
                    if(money>= 15*Factions.nationalists.partisan){
                        int montant = 15*Factions.nationalists.partisan;
                        money -= montant;
                        Factions.nationalists.satisfaction *= 1.10;
                        Factions.loyalists.satisfaction -= (montant/10);
                    } break;
            }
        }while (choix != 0);
    }
}