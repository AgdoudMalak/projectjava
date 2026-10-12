public class TP2_4_LabMeteo {
    public static void main(String[] args) {

        // 1. Donnée brute
        String ligneMeteo = "25.5,70,1012.3";

        // 2. Découpage de la chaîne
        String[] parties = ligneMeteo.split(",");

        // 3. Parsing avec gestion d'erreurs
        double temperature = 0.0;
        int humidite = 0;
        double pression = 0.0;

        try {
            temperature = Double.parseDouble(parties[0]);
            humidite = Integer.parseInt(parties[1]);
            pression = Double.parseDouble(parties[2]);
        } catch (NumberFormatException e) {
            System.out.println("Erreur : donnée mal formée dans la ligne météo -> " + e.getMessage());
            return; // on arrête le programme si le parsing échoue
        }

        // 4. Affichage des valeurs parsées
        System.out.println("=== Données parsées ===");
        System.out.println("Température: " + temperature + "°C");
        System.out.println("Humidité: " + humidite + "%");
        System.out.println("Pression: " + pression + " hPa");

        // 5. Calculs
        double temperatureFahrenheit = (temperature * 9.0 / 5.0) + 32;
        double indiceConfort = (temperature * humidite) / 100;

        System.out.println("\n=== Calculs ===");
        System.out.printf("Température en Fahrenheit : %.2f°F%n", temperatureFahrenheit);
        System.out.printf("Indice de confort simple  : %.2f%n", indiceConfort);

        // 6. Bonus : moyenne glissante sur 3 mesures
        double temp1 = 24.0, temp2 = 26.0, temp3 = 25.5;
        double moyenneGlissante = (temp1 + temp2 + temp3) / 3;

        System.out.println("\n=== Bonus : moyenne glissante ===");
        System.out.printf("Moyenne des 3 dernières températures : %.2f°C%n", moyenneGlissante);
    }
}

