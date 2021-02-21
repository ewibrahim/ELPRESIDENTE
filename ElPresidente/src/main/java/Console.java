import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Console {
    private static BufferedReader entree = new BufferedReader(new InputStreamReader(System.in));

    //Cette classe permet de gérer la saisie et les erreurs de saisie

    public static int saisirInt() //sc.nextInt()
    {
        int nb = 0;
        String chaine = "";
        boolean ok = false;
        do {
            ok = true;
            try {
                chaine = entree.readLine();
                nb = Integer.parseInt(chaine); //conversion en entier
                ok = true;
            }
            catch (IOException exp) {
                System.out.println("Erreur de saisie sur le clavier !");
                ok = false;
            }
            catch (NumberFormatException exp){
                System.out.println("Erreur de saisie d'un entier");
                ok = false;
            }
        }while (ok == false);
        return nb;
    }
    public static float saisirFloat() //sc.nextInt()
    {
        float nb = 0;
        String chaine = "";
        boolean ok = false;
        do {
            ok = true;
            try {
                chaine = entree.readLine();
                nb = Float.parseFloat(chaine); //conversion en entier
                ok = true;
            }
            catch (IOException exp) {
                System.out.println("Erreur de saisie sur le clavier !");
                ok = false;
            }
            catch (NumberFormatException exp){
                System.out.println("Erreur de saisie d'un entier");
                ok = false;
            }
        }while (ok == false);
        return nb;
    }
    public static String saisirString() //sc.nextInt()
    {
        String chaine = "";
        try {
            chaine = entree.readLine();
        }
        catch (IOException exp) {
            System.out.println("Erreur de saisie sur le clavier !");
        }
        return chaine;
    }
}