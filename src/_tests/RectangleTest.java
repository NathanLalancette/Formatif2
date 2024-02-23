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

class RectangleTest {
    private Rectangle H5L10;
    private Rectangle H10L20;
    private Rectangle HMaxLMax;
    private Rectangle HMinLMin;

    @BeforeEach
    void setUp() {
        init();
    }

    @Test
    void init() {
        H5L10 = new Rectangle(10, 5);
        H10L20 = new Rectangle(20, 10);
        HMaxLMax = new Rectangle(Rectangle.MAX_VAL, Rectangle.MAX_VAL);
        HMinLMin = new Rectangle(Rectangle.MIN_VAL, Rectangle.MIN_VAL);
    }
    @Test
    void calculerSurface_retourneLaBonneSurface() {
        assertEquals(H5L10.calculerSurface(), 50);
        assertEquals(H10L20.calculerSurface(), 200);
        assertEquals(HMaxLMax.calculerSurface(), 900);
        assertEquals(HMinLMin.calculerSurface(), 1);

    }

    @Test
    void calculerPerimetre_retourneLeBonPerimetre() {
        assertEquals(H5L10.calculerPrimetre(),30);
        assertEquals(H10L20.calculerPrimetre(),60);
        assertEquals(HMaxLMax.calculerPrimetre(),120);
        assertEquals(HMinLMin.calculerPrimetre(),4);
    }
    @Test
    void getLargeur_RetourneLaLargeur(){
        assertEquals(H5L10.getLargeur(), 10);
        assertEquals(H10L20.getLargeur(), 20);
        assertEquals(HMaxLMax.getLargeur(), 30);
        assertEquals(HMinLMin.getLargeur(), 1);

    }
    @Test
    void getHauteur_RetourneLaHauteur(){
        assertEquals(H5L10.getHauteur(), 5);
        assertEquals(H10L20.getHauteur(), 10);
        assertEquals(HMaxLMax.getHauteur(), 30);
        assertEquals(HMinLMin.getHauteur(), 1);

    }
    @Test
    void setHauteur_UneHauteurInvalideLanceUneException() {
        Rectangle rectangle = new Rectangle(3, 9);
        assertThrows(GrandeurFormeException.class, () -> {
            rectangle.setHauteur(-2);
        });
        assertThrows(GrandeurFormeException.class, () -> {
            rectangle.setHauteur(0);
        });
        assertThrows(GrandeurFormeException.class, () -> {
            rectangle.setHauteur(31);
        });
    }
    @Test
    void setLargeur_UneLargeurInvalideLanceUneException() {
        Rectangle rectangle = new Rectangle(3, 9);

        assertThrows(GrandeurFormeException.class, () -> {
            rectangle.setLargeur(-2);
        });
        assertThrows(GrandeurFormeException.class, () -> {
            rectangle.setLargeur(0);
        });
        assertThrows(GrandeurFormeException.class, () -> {
            rectangle.setLargeur(31);
        });
    }


}