package PayApp.impl;

import PayApp.Product;

import java.time.LocalDate;

public class BottleOfWater extends Product {
    private float volume;
    private String pack;
    private boolean IsSpark;


    public BottleOfWater(String name, double price, LocalDate releaseDate) {

        super(name, price, releaseDate);
        this.volume = 1;
        this.pack = EPackage.PLASTICK.getMaterial();
        this.IsSpark = false;
    }

    public BottleOfWater(String name, double price, LocalDate releaseDate, float volume, String pack, boolean isSpark) {
        super(name, price, releaseDate);
        this.volume = volume;
        this.pack = pack;
        IsSpark = isSpark;
    }

    public float getVolume() {
        return volume;
    }

    public String getPack() {
        return pack;
    }

    public boolean getIsSpark() {
        return IsSpark;
    }

    @Override
    public String toString() {
        return "BottleOfWater{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", releaseDate=" + releaseDate +
                "volume=" + volume +
                ", pack='" + pack + '\'' +
                ", IsSpark=" + IsSpark +
                '}';
    }
}
