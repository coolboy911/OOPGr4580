public class ex2_OCP {
    public static void main(String[] args) {
        Vehicle base = new Vehicle(10);
        Vehicle car = new Car(10);
        Vehicle bus = new Bus(10);

        SpeedCalculation sc = new SpeedCalculation();
        System.out.println(sc.calculateAllowedSpeed(base));
        System.out.println(sc.calculateAllowedSpeed(car));
        System.out.println(sc.calculateAllowedSpeed(bus));
    }
}
/*
class SpeedCalculation {
    public double calculateAllowedSpeed(Vehicle vehicle) {
        if (vehicle.getType().equalsIgnoreCase("Car")) {
            return vehicle.getMaxSpeed() * 0.8;
        } else if (vehicle.getType().equalsIgnoreCase("Bus")) {
            return vehicle.getMaxSpeed() * 0.6;
        }
        return 0.0;
    }
}

class Vehicle {
    int maxSpeed;
    String type;

    public Vehicle(int maxSpeed, String type) {
        this.maxSpeed = maxSpeed;
        this.type = type;
    }

    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    public String getType() {
        return this.type;
    }
}
*/

class SpeedCalculation {
    public double calculateAllowedSpeed(Vehicle vehicle) {
        return vehicle.calculateAllowedSpeed();
    }
}

class Vehicle {
    int maxSpeed;

    public Vehicle(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getMaxSpeed() {
        return this.maxSpeed;
    }
    
    public double calculateAllowedSpeed() {
        return 0.0;
    }
}

class Car extends Vehicle {
    public Car(int maxSpeed) {
        super(maxSpeed);
    }

    @Override
    public double calculateAllowedSpeed() {
        return getMaxSpeed() * 0.8 ;
    }
}

class Bus extends Vehicle {
    public Bus(int maxSpeed) {
        super(maxSpeed);
    }

    @Override
    public double calculateAllowedSpeed() {
        return getMaxSpeed() * 0.6 ;
    }
}