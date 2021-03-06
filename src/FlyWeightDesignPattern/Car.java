package FlyWeightDesignPattern;

import java.awt.Color;

public class Car implements Vehicle {
    /**
     * The car's engine.
     */
    private Engine engine;

    /**
     * The car's color.
     */
    private Color color;

    /**
     * Instantiates a new Car.
     *
     * @param engine
     *            the {@link #engine}
     * @param color
     *            the {@link #color}
     */
    public Car(Engine engine, Color color) {
        this.engine = engine;
        this.color = color;

        // Building a new car is a very expensive operation!
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }

    /*
     * (non-Javadoc)
     *
     * @see com.baeldung.flyweight.Vehicle#start()
     */
    @Override
    public void start() {
        System.out.println("Car is starting!");
        engine.start();
    }

    /*
     * (non-Javadoc)
     *
     * @see com.baeldung.flyweight.Vehicle#stop()
     */
    @Override
    public void stop() {
        System.out.println("Car is stopping!");
        engine.stop();
    }

    /*
     * (non-Javadoc)
     *
     * @see com.baeldung.flyweight.Vehicle#getColor()
     */
    @Override
    public Color getColor() {
        return this.color;
    }

}