package OODay02;

class Cars {
    protected String brand;
    protected int price;
    protected boolean state;

    Cars() {
        brand = null;
        price = 0;
        state = false;
    }

    Cars(String brand, int price, boolean state) {
        this.brand = brand;
        this.price = price;
        this.state = state;
    }

    void run() {
        state = true;
        System.out.println("汽车启动···");
    }

    void stop() {
        state = false;
        System.out.println("停停停···");
    }
}

class Cycling extends Cars {
    protected boolean lock;

    Cycling() {
        brand = null;
        price = 0;
        state = false;
        lock = false;
    }

    Cycling(String brand, int price, boolean state, boolean lock) {
        this.brand = brand;
        this.price = price;
        this.state = state;
        this.lock = lock;
    }

    @Override
    void run() {
        this.state = true;
        System.out.println("自行车启动···");
    }

    void onto() {
        super.state = true;
        lock = true;
        System.out.println("你以骑上自行车···");
    }
}

public class Car {
    public static void main(String[] args) {
        Cars cars = new Cars("大众", 10000, false);
        Cycling cycling = new Cycling("某某", 200, false, false);
        cars.run();
        cycling.run();
        cars.stop();
        cycling.stop();
        cycling.onto();
    }
}
