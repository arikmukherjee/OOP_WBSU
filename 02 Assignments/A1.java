class Shipment {
    String senderName;
    String receiverName;

    void shipment(String sName, String rName) {
        senderName = sName;
        receiverName = rName;
    }

    void display1() {
        System.out.println("Sender: " + senderName);
        System.out.println("Receiver: " + receiverName);
    }
}

class Pack extends Shipment {
    double weight;
    double costPerKg;

    void pack(double w, double c) {
        weight = w;
        costPerKg = c;
    }

    double calculateCost() {
        return weight * costPerKg;
    }
}

class InternationalPackage extends Pack {
    String country;
    double customsFee;


    void setInternational(String c, double fee) {
        country = c;
        customsFee = fee;
    }

    void display2() {
        display1();
        double total = calculateCost() + customsFee;
        System.out.println("Destination Country: " + country);
        System.out.println("Total Cost: " + total);
    }

}

public class A1 {
    public static void main(String[] args) {
        InternationalPackage obj = new InternationalPackage();

        obj.shipment("ABC", "XYZ");
        obj.pack(10.5, 100);  
        obj.setInternational("USA", 500);
        obj.display2();
    }
}