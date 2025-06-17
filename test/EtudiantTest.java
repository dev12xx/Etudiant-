import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class EtudiantTest {
    
    private Etudiant instance;
    
    @Before
    public void setUp() {
     
        instance = new Etudiant("Test Student", 4, 5);
    }
    
    @Test
    public void testGetNom() {
        System.out.println("getNom");
        String expResult = "Test Student";
        String result = instance.getNom();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetNombre1() {
        System.out.println("getNombre1");
        double expResult = 4.0;
        double result = instance.getNombre1();
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void testGetNombre2() {
        System.out.println("getNombre2");
        double expResult = 5.0;
        double result = instance.getNombre2();
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void testCalculerMoyenne() {
        System.out.println("calculerMoyenne");
        
        double expResult = 4.5;
        double result = instance.calculerMoyenne();
        assertEquals(expResult, result, 0.0);
    }
}