package vehicle;

import components.Engine;
import components.Seat;
import components.Tyre;

import java.util.ArrayList;

public abstract class Vehicle {

    private double price;
    private String colour;
    private Engine engine;
    private ArrayList<Tyre> tyres;
    private ArrayList<Seat> seats;
    private String manufacturer;
    private String model;

    public Vehicle (double price,
                    String colour,
                    Engine engine,
                    ArrayList<Tyre> tyres,
                    ArrayList<Seat> seats,
                    String manufacturer,
                    String model) {

        this.price = price;
        this.colour = colour;
        this.engine = engine;
        this.tyres = tyres;
        this.seats = seats;
        this.manufacturer = manufacturer;
        this.model = model;

    }


    public double getPrice() {
        return price;
    }

    public String getColour() {
        return colour;
    }

    public Engine getEngine() {
        return engine;
    }

    public ArrayList<Tyre> getTyres() {
        return tyres;
    }

    public ArrayList<Seat> getSeats() {
        return seats;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getModel() {
        return model;
    }

}
