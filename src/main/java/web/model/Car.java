package web.model;

public class Car {

    private String model;

    private int series;

    private double volume;

    public Car(String model, int series, double volume) {
        this.model = model;
        this.series = series;
        this.volume = volume;
    }

    public String getModel() {
        return model;
    }

    public int getSeries() {
        return series;
    }

    public double getVolume() {
        return volume;
    }
}
