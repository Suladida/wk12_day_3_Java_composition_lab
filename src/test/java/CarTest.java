import components.Engine;
import components.Seat;
import components.Tyre;
import org.junit.Before;
import org.junit.Test;
import vehicle.Car;

import java.lang.reflect.Array;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class CarTest {

    Car car;
    Engine engine;
    Tyre tyre;
    Seat seat;

    @Before
    public void before() {

        engine = new Engine("Ford", "Escort", 1600);

        tyre = tyre = new Tyre("Nixen", "Round", 15);
        ArrayList<Tyre> tyres = new ArrayList<Tyre>();
        tyres.add(tyre);
        tyres.add(tyre);

        seat = new Seat("Ikea", "ButtHugger");
        ArrayList<Seat> seats = new ArrayList<Seat>();
        seats.add(seat);
        seats.add(seat);

        car = new Car(25000.0, "Blue", engine, tyres, seats, "VW", "Golf");
    }


    @Test
    public void canGetPrice() {
        assertEquals(25000.0, car.getPrice(), 0.0);
    }

    @Test
    public void canGetColour() {
        assertEquals("Blue", car.getColour());
    }

    @Test
    public void canGetEngine() {
        assertEquals(engine, car.getEngine());
    }

    @Test
    public void canGetTyres() {
        assertEquals(tyre, car.getTyres().get(0));
    }

    @Test
    public void canGetSeats() {
        assertEquals(seat, car.getSeats().get(0));
    }

    @Test
    public void canGetManufacturer() {
        assertEquals("VW", car.getManufacturer());
    }

    @Test
    public void canGetModel() {
        assertEquals("Golf", car.getModel());
    }

}
