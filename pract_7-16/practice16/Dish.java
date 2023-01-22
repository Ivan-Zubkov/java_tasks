//file Dish.java
package practice16;

public final class Dish implements Item {
    private int price;
    private String name;
    private String description;

    public Dish(int price, String name, String description) throws IllegalArgumentException{
        if(price < 0 || name.equals("") || description.equals(""))
            throw new IllegalArgumentException();

        this.price = price;
        this.name = name;
        this.description = description;
    }
    public Dish(String name, String description) throws IllegalArgumentException{
        if(name.equals("") || description.equals(""))
            throw new IllegalArgumentException();

        this.price = 0;
        this.name = name;
        this.description = description;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override public int getPrice() {
        return price;
    }
    @Override public String getDescription() {
        return description;
    }
    @Override public String getName() {
        return name;
    }
    @Override public String toString() {
        return "Dish: " + getName() + ", price: " + getPrice() + ".\nDescripcion: " + getDescription();
    }
}
