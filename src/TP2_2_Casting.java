public class TP2_2_Casting {
    public static void main(String[] args) {

        // 1-2. Conversion cm -> pouces
        double centimetres = 254.0;
        double pouceParCm = 2.54;

        double poucesDouble = centimetres / pouceParCm;
        int poucesInt = (int) poucesDouble; // casting explicite -> troncature de la partie décimale

        System.out.println("=== Conversion cm -> pouces ===");
        System.out.printf("En double : %.4f pouces%n", poucesDouble);
        System.out.println("En int (cast direct) : " + poucesInt + " pouces");
        System.out.println("-> Le cast (int) tronque simplement la partie décimale, il ne l'arrondit pas.");

        // 3. Math.round() avant cast en long
        long poucesArrondis = Math.round(poucesDouble); // Math.round(double) renvoie un long
        System.out.println("\n=== Avec Math.round() ===");
        System.out.println("En long (arrondi) : " + poucesArrondis + " pouces");
        System.out.println("-> Ici le résultat est arrondi au plus proche avant d'être casté,");
        System.out.println("   contrairement à la troncature simple obtenue avec (int) poucesDouble.");

        // 4. Prix total
        float prixArticle = 12.99f;
        int quantite = 3;
        double total = prixArticle * quantite;
        System.out.println("\n=== Calcul du total ===");
        System.out.printf("Total : %.2f%n", total);

        // 5. Overflow lors du cast int -> byte
        int grandNombre = 2_000_000_000;
        byte petitNombre = (byte) grandNombre; // dépassement de capacité (byte : -128 à 127)
        System.out.println("\n=== Overflow int -> byte ===");
        System.out.println("grandNombre = " + grandNombre);
        System.out.println("(byte) grandNombre = " + petitNombre);
        System.out.println("-> Résultat inattendu car byte ne peut stocker que des valeurs de -128 à 127.");
        System.out.println("   Java ne garde que les 8 bits de poids faible du nombre d'origine, ce qui");
        System.out.println("   produit une valeur qui n'a plus de rapport visible avec 2 000 000 000.");
    }
}
