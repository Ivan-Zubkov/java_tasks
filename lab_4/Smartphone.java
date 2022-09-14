package lab_4;

public class Smartphone implements Priceable{
    public int maxVolume;
    public double screenDiagonal;
    public int ram;
    public int rom;
    public int batteryCapacity;
    private double price;

    public Smartphone(int maxVolume, double screenDiagonal, int ram, int rom, int batteryCapacity, double price) {
        this.maxVolume = maxVolume;
        this.screenDiagonal = screenDiagonal;
        this.ram = ram;
        this.rom = rom;
        this.batteryCapacity = batteryCapacity;
        this.price = price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}
