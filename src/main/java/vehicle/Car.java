package vehicle;

import components.Engine;
import components.Seat;
import components.Tyre;

import java.util.ArrayList;

public class Car extends Vehicle {

    public Car(double price,
               String colour,
               Engine engine,
               ArrayList<Tyre> tyres,
               ArrayList<Seat> seats,
               String manufacturer,
               String model) {

        super(price, colour, engine, tyres, seats, manufacturer, model);

    }

}
