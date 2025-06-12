// Interface Camera
interface Camera {
    void captureImage();
}

// Interface CardReader
interface CardReader {
    void readCard();
}

// Superclass Phone
class Phone {
    protected String phoneNumber;

    public Phone(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void call() {
        System.out.println("Calling from: " + phoneNumber);
    }

    public void receiveCall() {
        System.out.println("Receiving a call on: " + phoneNumber);
    }
}

// Subclass SmartPhone
class SmartPhone extends Phone implements Camera, CardReader {
    private String lens;

    public SmartPhone(String phoneNumber, String lens) {
        super(phoneNumber);
        this.lens = lens;
    }

    @Override
    public void captureImage() {
        System.out.println("Capturing image using " + lens + " lens.");
    }

    @Override
    public void readCard() {
        System.out.println("Reading card...");
    }
}

// Main class untuk menjalankan program
public class Main {
    public static void main(String[] args) {
        SmartPhone myPhone = new SmartPhone("085852905673", "Wide Angle");

        myPhone.call();
        myPhone.receiveCall();
        myPhone.captureImage();
        myPhone.readCard();
    }
}