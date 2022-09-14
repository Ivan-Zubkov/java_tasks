package lab_3;

public class Spoon extends Dish{
    private String size;

    public Spoon() {
    }

    public Spoon(String size) {
        this.size = size;
    }

    public Spoon(String material, String color) {
        super(material, color);
    }

    public Spoon(String material, String color, String size) {
        super(material, color);
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    public void setRadius(String size) {
        this.size = size;
    }
}
