import java.util.ArrayList;

public class TP2_3_Wrappers {
    public static void main(String[] args) {

        // 1. Liste d'Integer
        ArrayList<Integer> nombres = new ArrayList<>();
        nombres.add(5);   // autoboxing : int 5 -> Integer
        nombres.add(12);
        nombres.add(-3);
        nombres.add(8);
        nombres.add(0);

        // 2. Parcours et affichage
        System.out.println("=== Contenu de la liste ===");
        for (int n : nombres) { // unboxing automatique : Integer -> int
            System.out.println(n);
        }
        System.out.println("-> L'autoboxing permet d'ajouter des int dans une ArrayList<Integer>");
        System.out.println("   car Java les convertit automatiquement en objets Integer.");

        // 3. Min et max manuels
        int min = nombres.get(0);
        int max = nombres.get(0);
        for (int n : nombres) {
            if (n < min) min = n;
            if (n > max) max = n;
        }
        System.out.println("\n=== Min / Max ===");
        System.out.println("Minimum : " + min);
        System.out.println("Maximum : " + max);

        // 4. Moyenne précise
        int somme = 0;
        for (int n : nombres) {
            somme += n;
        }
        double moyenne = (double) somme / nombres.size(); // cast pour éviter la division entière
        System.out.println("\n=== Moyenne ===");
        System.out.printf("Moyenne : %.2f%n", moyenne);

        // 5. Unboxing explicite
        Integer objInt = 20;      // autoboxing : int -> Integer
        int primInt = objInt;     // unboxing : Integer -> int
        System.out.println("\n=== Autoboxing / Unboxing ===");
        System.out.println("objInt (Integer) = " + objInt);
        System.out.println("primInt (int)    = " + primInt);
        System.out.println("-> objInt est un objet Integer qui encapsule la valeur 20. Lors de");
        System.out.println("   l'affectation à primInt (type primitif int), Java effectue un");
        System.out.println("   unboxing automatique en appelant objInt.intValue() en coulisses.");
    }
}

