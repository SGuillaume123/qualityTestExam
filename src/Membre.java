public class Membre {

    // Data
    private String nomMembre;
    private String sexMembre;

    // Constructor
    public Membre(String nomMembre, String sexMembre) {
        this.nomMembre = nomMembre;
        this.sexMembre = sexMembre;
    }

    // Getter
    public String getNomMembre() {
        return nomMembre;
    }
    public String getSexMembre() {
        return sexMembre;
    }

    // Methods
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Membre membre = (Membre) o;
        return sexMembre == membre.sexMembre && nomMembre.equals(membre.nomMembre);
    }
}