import components.Engine;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EngineTest {

    Engine engine;

    @Before
    public void before() {
        engine = new Engine("Ford", "Escort", 1600);
    }

    @Test
    public void canGetManufacturer() {
        assertEquals("Ford", engine.getManufacturer());
    }

    @Test
    public void canGetModel() {
        assertEquals("Escort", engine.getModel());
    }

    @Test
    public void canGetSize() {
        assertEquals(1600, engine.getSize());
    }

}
