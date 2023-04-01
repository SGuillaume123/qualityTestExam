import org.junit.Test;

import static org.junit.Assert.*;

public class EquipeTest {
    @Test
    public void getMembres() {
    }
    @Test
    public void setMembres() {
    }

    // Test Construteur sans Exception
    @org.junit.Test
    public void testConstructor() {
        Membre membre = new Membre("Alice", "F");
        assertEquals("Alice", membre.getNomMembre());
        assertEquals("F", membre.getSexMembre());
    }
    @org.junit.Test
    public void ExceptionEquipeNonConforme() {
        assertThrows(IllegalArgumentException.class, () -> new Membre("Yelle", "Z"));
    }

    @org.junit.Test
    public void ExceptionRemplacementNonConforme() {
        Equipe equipe = new Equipe();
        Membre andre = new Membre("Andre", "M");
        Membre yelle = new Membre("Yelle", "Z");
        Membre brigitte = new Membre("Brigitte", "F");
        equipe.ajouterMembre(andre);
        equipe.ajouterMembre(yelle);
        equipe.remplacerMember(yelle, brigitte);
        assertThrows(IllegalArgumentException.class, () -> new Membre("Yelle", "Z"));
    }
}