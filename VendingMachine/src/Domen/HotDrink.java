package Domen;

public class HotDrink extends Product {
    // поля
    private float temperature;

    public HotDrink(int price, int place, String name, long id, float temperature) {
        super(price, place, name, id);
        this.temperature = temperature;
    }

    public HotDrink(int price, int place, String name, float temperature) { 
        super(price, place, name);
        this.temperature = temperature;
    }

    public float getTemperature() {
        return temperature;
    }

    @Override
    public String toString() {
        // return String.format("%s Temperature = %f", super.toString(), temperature);
        return super.toString() + "Temperature = " + temperature;
    }
}
