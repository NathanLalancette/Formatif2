//        420-202 – TP1 – Traitement de données orienté objet
//        Groupe : 2
//        Nom : Lalancette
//        Prénom : Nathan
//        DA : 2236998
package formes;

import exception.GrandeurFormeException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CercleTest {
    private Cercle R10;
    private Cercle R20;
    private Cercle RMin;

    @BeforeEach
    void setUp() {
        init();
    }

    @Test
    void init() {
        R10 = new Cercle(10);
        R20 = new Cercle(20);
        RMin = new Cercle(Cercle.MIN_VAL);
    }
    @Test
    void calculerSurface_retourneLaBonneSurface() {
        assertEquals(R10.calculerSurface(), 314);
        assertEquals(R20.calculerSurface(), 1257);
    }

    @Test
    void calculerPerimetre_retourneLeBonPerimetre() {
        assertEquals(R10.calculerPrimetre(), 63);
        assertEquals(R20.calculerPrimetre(), 126);
    }
    @Test
    void getRayon_RetourneLeBonRayon() {
        assertEquals(R10.getRayon(), 10);
        assertEquals(R20.getRayon(), 20);
    }
    @Test
    void setRayon_UnRayonInvalideLanceUneException() {

        assertThrows(GrandeurFormeException.class, () -> {
            RMin.setRayon(-2);
        });
        assertThrows(GrandeurFormeException.class, () -> {
            RMin.setRayon(0);
        });
        assertThrows(GrandeurFormeException.class, () -> {
            RMin.setRayon(31);
        });
    }

}
