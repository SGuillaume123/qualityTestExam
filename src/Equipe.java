import java.time.LocalDate;
import java.util.ArrayList;

public class Equipe {

    // Data
    private ArrayList<Membre> membres;

    // Construtor
    public Equipe() {
        this.membres = new ArrayList<>();
    }

    // Getter Setter
    public ArrayList<Membre> getMembres() {
        return membres;
    }

    public void setMembres(ArrayList<Membre> membres) {
        this.membres = membres;
    }

    // Methods
    public void ajouterMembre(Membre membre) {
        try {
            if (membre.getSexMembre().contains("F") || membre.getSexMembre().contains("M"))
                this.membres.add(membre);
        } catch (Exception e) {
            System.out.println("Sexe Inconnue");
        }
    }
    public void remplacerMember(Membre membreSortant, Membre membreRentrant) {
        try {
            if (membreSortant.getSexMembre() == membreRentrant.getSexMembre()) {
               this.membres.remove(membreSortant);
               this.membres.add(membreRentrant);
            }
        } catch (Exception e) {
            System.out.println("Equipe non mixe");
        }
    }
}

