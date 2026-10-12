public class AffichageVariables {
    public static void main(String[] args) {
        String prenom = "Malak";
        String matricule = "EIDIA2026";
        int age = 20;

        System.out.println("Prénom : " + prenom);
        System.out.println("Matricule : " + matricule);
        System.out.println("Âge : " + age + " ans");


        System.out.print("Étudiant : " + prenom + ", ");
        System.out.println("Matricule : " + matricule + ", Âge : " + age + " ans.");
    }
}