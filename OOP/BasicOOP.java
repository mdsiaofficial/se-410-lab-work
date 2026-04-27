class Vehicle {
    private int vehicleld;

    public int getVehicleld() {
        return vehicleld;
    }

    public void setVehicleld(int vehicleld) {
        this.vehicleld = vehicleld;
    }
}

abstract class Transport {
    public abstract void calculateFare(int passenger);

    public void showTransportType() {
        System.out.println("This is showing transport");
    }
}

class Bus extends Transport {
    int passengerCount;
    int luggageWg;

    Bus(int passengerCount, int luggageWg) {
        this.passengerCount = passengerCount;
        this.luggageWg = luggageWg;
    }

    public void addPassenger(int n) {
        this.passengerCount += n;
        System.out.println("New Passenger count : " + this.passengerCount);
    }

    public void addPassenger(int n, int wg) {
        this.passengerCount += n;
        this.luggageWg += wg;
        System.out.println("New Passenger count : " + this.passengerCount + " New luaggage weight : " + this.luggageWg);
    }

    public void calculateFare(int passenger) {
        double perPassengerFare = 20.0;
        System.out.println(passenger * perPassengerFare);
    }
}

public class BasicOOP {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.setVehicleld(4);
        System.out.println("Vehicle ID : " + vehicle.getVehicleld());
        Bus bus = new Bus(20, 100);
        bus.showTransportType();
        bus.calculateFare(10);
        bus.addPassenger(10);
        bus.addPassenger(10, 30);
    }
}