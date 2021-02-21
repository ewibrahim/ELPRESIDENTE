public class Factions {

        String name;
        int partisan;
        double satisfaction;

        public Factions(String factionName, double factionSatisfaction, int factionPartisan){
                name = factionName;
                satisfaction = factionSatisfaction;
                partisan = factionPartisan;
        }

        static Factions loyalists = new Factions("loyalistes", 100, 15);
        static Factions communists = new Factions("communistes", 50, 15);
        static Factions capitalists = new Factions("capitalistes", 50, 15);
        static Factions religious = new Factions("religieux", 50, 15);
        static Factions militarists = new Factions("militaristes", 50, 15);
        static Factions ecologists = new Factions("ecologistes", 50, 15);
        static Factions liberals = new Factions("liberaux", 50, 15);
        static Factions nationalists = new Factions("nationalistes", 50, 15);

        static double globalSatisf = ((loyalists.partisan* loyalists.satisfaction + communists.partisan* communists.satisfaction
        + capitalists.partisan* capitalists.satisfaction + religious.partisan* religious.satisfaction + militarists.partisan* militarists.satisfaction
        + ecologists.partisan* ecologists.satisfaction + liberals.partisan* liberals.satisfaction + nationalists.partisan* nationalists.satisfaction)
        / (loyalists.partisan + communists.partisan + capitalists.partisan + religious.partisan + militarists.partisan + ecologists.partisan + liberals.partisan
        + nationalists.partisan));

        public Factions() {

        }

        public void etatFactions(){
                System.out.println("\n"+ ConsoleColors.RED+"------------- El Presidente, voici l'état des factions: --------------\n"+ ConsoleColors.RESET);
                System.out.println(loyalists);
                System.out.println(communists);
                System.out.println(capitalists);
                System.out.println(religious);
                System.out.println(militarists);
                System.out.println(ecologists);
                System.out.println(liberals);
                System.out.println(nationalists);
                System.out.println("\nTresorerie: "+Isle.money+"$");
                System.out.println("Industrie: "+Isle.industrialization+"%");
                System.out.println("Agriculture: "+Isle.agriculture+"%");
                System.out.println("\n"+ ConsoleColors.RED+"----------------------------------------------------------------------\n"+ ConsoleColors.RESET);
        }

        public int getPartisan() {
                return partisan;
        }

        public void setPartisan(int partisan) {
                this.partisan = partisan;
        }

        public double getSatisfaction() {
                return satisfaction;
        }

        public void setSatisfaction(double satisfaction) {
                this.satisfaction = satisfaction;
        }

        public String getName() {
                return name;
        }

        public void setName(String name) {
                this.name = name;
        }

        public String toString(){
                return "Les "+ ConsoleColors.YELLOW +name+ ConsoleColors.RESET+ " au nombre de " + ConsoleColors.BLUE + partisan + ConsoleColors.RESET+ " partisans, sont satisfaits à "+ ConsoleColors.GREEN + satisfaction + "%"+ ConsoleColors.RESET;

        }
}
