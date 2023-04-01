import static org.junit.Assert.*;

public class MembreTest {
    @org.junit.Test
    public void getNomMembre() {
    }
    @org.junit.Test
    public void getSexMembre() {
    }
    @org.junit.Test
    public void testEquals() {
    }

    @org.junit.Test
    public void testConstructor() {
        Membre membre = new Membre("Andre", "M");
        assertEquals("Andre", membre.getNomMembre());
        assertEquals("M", membre.getSexMembre());
    }

    @org.junit.Test
    public void ExceptionSexeInconnu() {
        assertThrows(IllegalArgumentException.class, () -> new Membre("Yelle", "Z"));
    }
}