//Runtime Polymorphism in a Payment System

class Payment {
    void pay() {
        System.out.println("Generic Payment");
    }
}

class CardPayment extends Payment {
    void pay() {
        System.out.println("Paid with Card");
    }
}

class UpiPayment extends Payment {
    void pay() {
        System.out.println("Paid with UPI");
    }
}

