import components.Engine;
import components.Tyre;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TyreTest {

    Tyre tyre;

    @Before
    public void before() {
        tyre = new Tyre("Nixen", "Round", 15);
    }

    @Test
    public void canGetManufacturer() {
        assertEquals("Nixen", tyre.getManufacturer());
    }

    @Test
    public void canGetModel() {
        assertEquals("Round", tyre.getModel());
    }

    @Test
    public void canGetSize() {
        assertEquals(15, tyre.getSize());
    }

}
