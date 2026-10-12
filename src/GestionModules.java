import java.util.Scanner;

public class GestionModules {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] modules = {"Python", "Java", "Réseaux"};
        double[] notes = new double[modules.length];
        double somme = 0;

        for (int i = 0; i < modules.length; i++) {
            System.out.print("Note du module " + modules[i] + " : ");
            notes[i] = sc.nextDouble();
            somme += notes[i];
        }

        double moyenne = somme / modules.length;

        System.out.println("\n--- Résultat ---");
        for (int i = 0; i < modules.length; i++) {
            System.out.println(modules[i] + " : " + notes[i]);
        }
        System.out.println("Moyenne générale : " + moyenne);

        String statut;
        if (moyenne >= 10) {
            statut = "Validé";
        } else if (moyenne >= 8) {
            statut = "Rattrapage";
        } else {
            statut = "Non validé";
        }

        System.out.println("Statut : " + statut);

        sc.close();
    }
}
