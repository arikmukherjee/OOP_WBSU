class Railway {
    String stationName;
    String location;

    void ip1(String name, String loc) {
        stationName = name;
        location = loc;
    }

    void display1() {
        System.out.println("Station Name: " + stationName);
        System.out.println("Location: " + location);
    }
}

class Train extends Railway {
    String trainName;
    int trainNumber;

    void ip2(String tName, int tNo) {
        trainName = tName;
        trainNumber = tNo;
    }

    void display2() {
        display1();
        System.out.println("Train Name: " + trainName);
        System.out.println("Train Number: " + trainNumber);
    }
}

class Passenger extends Train {
    String passengerName;
    int seatNumber;

    void ip3(String pName, int seatNo) {
        passengerName = pName;
        seatNumber = seatNo;
    }

    void display3() {
        display2();
        System.out.println("Passenger Name: " + passengerName);
        System.out.println("Seat Number: " + seatNumber);
    }
}

public class A5 {
    public static void main(String[] args) {

        Passenger p = new Passenger();

        p.ip1("Howrah Station", "Kolkata");
        p.ip2("Shatabdi Express", 12019);
        p.ip3("Goutam", 45);

        p.display3();
    }
}