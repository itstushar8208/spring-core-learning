class Engine {
    void start() {
        System.out.println("Engine Started");
    }
}

class Car {

    Engine engine;

    Car(Engine engine) {
        this.engine = engine;
    }

    void drive() {
        engine.start();
        System.out.println("Car Running");
    }
}

public class DependencyInjectionDemo {

    public static void main(String[] args) {

        Engine engine = new Engine();

        Car car = new Car(engine);

        car.drive();
    }
}
