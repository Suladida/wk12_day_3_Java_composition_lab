import components.Seat;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SeatTest {

    Seat seat;

    @Before
    public void before() {
        seat = new Seat("Ikea", "ButtHugger");
    }

    @Test
    public void canGetManufacturer() {
        assertEquals("Ikea", seat.getManufacturer());
    }

    @Test
    public void canGetModel() {
        assertEquals("ButtHugger", seat.getModel());
    }

}
