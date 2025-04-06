//Method Overriding with Super Keyword
class Vehicle {
    void start() {
        System.out.println("Vehicle starting...");
    }
}

class Bike extends Vehicle {
    void start() {
        super.start();
        System.out.println("Bike started");
    }

    public static void main(String[] args) {
        Bike b = new Bike();
        b.start();
    }
}
// vehicle starting...
//bike started
