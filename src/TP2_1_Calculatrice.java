public class TP2_1_Calculatrice {
    public static void main(String[] args) {

        // 2. Déclaration des variables
        double nombre1 = 15.0;
        double nombre2 = 4.0;

        // 3. Opérations de base, affichées avec printf (2 décimales)
        System.out.println("=== Opérations de base ===");
        System.out.printf("Addition       : %.2f%n", nombre1 + nombre2);
        System.out.printf("Soustraction   : %.2f%n", nombre1 - nombre2);
        System.out.printf("Multiplication : %.2f%n", nombre1 * nombre2);
        System.out.printf("Division       : %.2f%n", nombre1 / nombre2);
        System.out.printf("Modulo         : %.2f%n", nombre1 % nombre2);

        // 4. Test de précédence des opérateurs
        System.out.println("\n=== Test de précédence ===");
        double resultat1 = nombre1 + nombre2 * 2;       // multiplication avant addition
        double resultat2 = (nombre1 + nombre2) * 2;     // parenthèses forcent l'addition d'abord
        System.out.printf("resultat1 (nombre1 + nombre2 * 2)   = %.2f%n", resultat1);
        System.out.printf("resultat2 ((nombre1 + nombre2) * 2) = %.2f%n", resultat2);
        System.out.println("Explication : dans resultat1, la multiplication (nombre2 * 2 = 8.0) est");
        System.out.println("calculée avant l'addition, donc 15.0 + 8.0 = 23.0.");
        System.out.println("Dans resultat2, les parenthèses forcent le calcul de (15.0 + 4.0 = 19.0)");
        System.out.println("avant la multiplication, donc 19.0 * 2 = 38.0. Les parenthèses changent");
        System.out.println("l'ordre d'évaluation et donc le résultat final.");

        // 5. Incrémentation pré/post
        System.out.println("\n=== Pré/Post incrémentation ===");
        int a = 10;
        System.out.println("a++ (post-incrément) affiche : " + a++); // affiche 10, PUIS incrémente
        System.out.println("valeur de a après a++        : " + a);   // 11

        int b = 10; // on repart d'une variable fraîche pour bien isoler ++a
        System.out.println("++b (pré-incrément) affiche  : " + ++b); // incrémente D'ABORD, puis affiche 11
        System.out.println("valeur de b après ++b        : " + b);   // 11

        System.out.println("\nExplication : a++ (post-incrément) utilise la valeur ACTUELLE de a dans");
        System.out.println("l'expression, puis incrémente a juste après. ++a (pré-incrément) incrémente");
        System.out.println("a D'ABORD, puis utilise la nouvelle valeur dans l'expression. Le résultat");
        System.out.println("final de a est le même (11) dans les deux cas, seule la valeur AFFICHÉE");
        System.out.println("au moment de l'opération diffère.");
    }
}

