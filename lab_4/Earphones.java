package lab_4;

public class Earphones implements Priceable{
    public int maxVolume;
    public int maxFrequency;
    public int minFrequency;
    private double price;

    public Earphones(int maxVolume, int maxFrequency, int minFrequency, double price) {
        this.maxVolume = maxVolume;
        this.maxFrequency = maxFrequency;
        this.minFrequency = minFrequency;
        this.price = price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}
