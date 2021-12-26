
import MatoPeli.ui.Paneeli;
import java.awt.Graphics;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class PaneeliTest {

    Paneeli p;
    Graphics g;

    @Before
    public void setUp() {
        p = new Paneeli();
    }

    @Test
    public void toimiikoVasenTormays() {
        p.aloitaPeli();
        p.onkoTormays();
        if (p.getX() < 0) {
            assertEquals("false", p.getLiikkuu());
        }
    }

    @Test
    public void toimiikoOikeaTormays() {
        p.aloitaPeli();
        p.onkoTormays();
        if (p.getX() > p.getSW()) {
            assertEquals("false", p.getLiikkuu());
        }
    }

    @Test
    public void toimiikoYlaTormays() {
        p.aloitaPeli();
        p.onkoTormays();
        if (p.getY() < 0) {
            assertEquals("false", p.getLiikkuu());
        }
    }

    @Test
    public void toimiikoAlaTormays() {
        p.aloitaPeli();
        p.onkoTormays();
        if (p.getY() > p.getSH()) {
            assertEquals("false", p.getLiikkuu());
        }
    }

    @Test
    public void toimiikoNapataanNami() {
        p.aloitaPeli();
        if (p.getX() == p.getNamiX() && p.getY() == p.getNamiY()) {
            assertEquals("1", p.getMontaSyoty() + 1);
        }
    }

    @Test
    public void onkoPituusAlussaOk() {
        p.aloitaPeli();
        assertEquals(6, p.getOsat());
    }

    @Test
    public void ylosLiikuttaaYlos() {
        p.aloitaPeli();
        p.liiku();
        if (p.getSuunta() == 'U') {
            assertEquals('U', p.getSuunta());
        }
    }


}
