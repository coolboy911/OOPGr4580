package ex5_DIP;

public class ex5_DIP {
    public static void main(String[] args) {
        Engine petrolEngine = new PetrolEngine();
        Engine dieselEngine = new DieselEngine();
    
        Car petrolCar = new Car(petrolEngine);
        petrolCar.start();

        Car dieselCar = new Car(dieselEngine);
        dieselCar.start();
    }
}

class Car {
    private Engine engine;
    public Car(Engine engine) {
        this.engine = engine;
    }
    public void start() {
        this.engine.start();
    }
}

interface Engine {
    public void start();
}

class PetrolEngine implements Engine {
    @Override
    public void start() {
        System.out.println("Petrol Engine Started");
    }
}

class DieselEngine implements Engine {
    @Override
    public void start() {
        System.out.println("Diesel Engine Started");
    }
}

/*
class Car {
    private PetrolEngine engine;
    public Car(PetrolEngine engine) {
        this.engine = engine;
    }
    public void start() {
        this.engine.start();
    }
}

class PetrolEngine {
    public void start() {
    }
}
*/