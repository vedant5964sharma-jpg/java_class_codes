class Bank {
    int getRateOfInterest() {
        return 0;
    }
}

class SBI extends Bank {
    @Override
    int getRateOfInterest() {
        return 7;
    }
}

class HDFC extends Bank {
    @Override
    int getRateOfInterest() {
        return 8;
    }
}

public class Overriding {
    public static void main(String[] args) {
        Bank b1 = new SBI();
        Bank b2 = new HDFC();

        System.out.println(b1.getRateOfInterest()); // 7
        System.out.println(b2.getRateOfInterest()); // 8
    }
}
