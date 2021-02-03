package components;

public class Engine {

    private String manufacturer;
    private String model;
    private int size;

    public Engine (String manufacturer, String model, int size) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.size = size;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String make) {
        this.manufacturer = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
