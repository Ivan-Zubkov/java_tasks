//file Drink.java
package practice16;


public final class Drink implements Item {
    private final int price;
    private final String name;
    private final String description;

    public Drink(int price, String name, String description) throws IllegalArgumentException{
        if(price < 0 || name.isEmpty() || description.isEmpty()) {
            throw new IllegalArgumentException();
        }
        this.price = price;
        this.name = name;
        this.description = description;
    }
    public Drink(String name, String description) throws IllegalArgumentException{
        this(0,name, description);
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
        return "Drink: " + getName() + ", price: " + getPrice() + ".\nDescription: " + getDescription();
    }
}
