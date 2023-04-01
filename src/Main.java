public class Main {
    public static void main(String[] args) {
        System.out.println();

        Membre andre = new Membre("Andre", "M");
        Membre anne = new Membre("Anne", "F");
        Membre bruno = new Membre("Bruno", "M");
        Membre brigitte = new Membre("Brigitte", "F");
        Membre charlot = new Membre("Denise", "M");
        Membre charlotte = new Membre("Denise", "F");
        Membre yelle = new Membre("Yelle", "Z");
        Membre heher = new Membre("Heher", "Z");

        Equipe equipe01 = new Equipe();
        // Add members to equipe
        equipe01.ajouterMembre(andre);
        equipe01.ajouterMembre(brigitte);

        Equipe equipe02 = new Equipe();
        // Add members to equipe
        equipe02.ajouterMembre(bruno);
        equipe02.ajouterMembre(charlot);
    }
}