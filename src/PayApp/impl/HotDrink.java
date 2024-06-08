package PayApp.impl;

import PayApp.Product;

import java.time.LocalDate;

public class HotDrink extends Product {
    private int temperature;
    private int volume;

    public HotDrink(String name, double price, LocalDate releaseDate) {
        super(name, price, releaseDate);
        this.temperature = 50;
        this.volume = 1;
    }

    public HotDrink(String name, double price, LocalDate releaseDate, int temperature, int volume) {
        super(name, price, releaseDate);
        this.temperature= temperature;
        this.volume = volume;
    }

    public int getTemperature() {
        return temperature;
    }

    public int getVolume() {
        return volume;
    }

    @Override
    public String toString() {
        return "Горячие напитки: " +
                "temperature=" + temperature +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", releaseDate=" + releaseDate +
                '}';
    }
}
