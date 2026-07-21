// Base Class
class Shipment {
    int shipmentId;
    double weight;

    // Method 1
    void inputShipment(int id, double w) {
        shipmentId = id;
        weight = w;
    }

    // Method 2
    void displayShipment() {
        System.out.println("Shipment ID: " + shipmentId);
        System.out.println("Weight: " + weight + " kg");
    }
}

// Derived Class (Level 1)
class DomesticShipment extends Shipment {
    String destination;
    double costPerKg;

    // Method 1
    void inputDomestic(String dest, double cost) {
        destination = dest;
        costPerKg = cost;
    }

    // Method 2
    void calculateCost() {
        double total = weight * costPerKg;
        System.out.println("Domestic Destination: " + destination);
        System.out.println("Total Cost: " + total);
    }
}

// Derived Class (Level 2)
class InternationalShipment extends DomesticShipment {
    String country;
    double customsDuty;

    // Method 1
    void inputInternational(String c, double duty) {
        country = c;
        customsDuty = duty;
    }

    // Method 2
    void finalCost() {
        double total = (weight * costPerKg) + customsDuty;
        System.out.println("Country: " + country);
        System.out.println("Customs Duty: " + customsDuty);
        System.out.println("Final Cost: " + total);
    }
}

// Main Class
public class ShippingDatabase {
    public static void main(String[] args) {
        InternationalShipment obj = new InternationalShipment();

        obj.inputShipment(101, 5.5);
        obj.inputDomestic("Kolkata", 100);
        obj.inputInternational("USA", 500);

        obj.displayShipment();
        obj.calculateCost();
        obj.finalCost();
    }
}