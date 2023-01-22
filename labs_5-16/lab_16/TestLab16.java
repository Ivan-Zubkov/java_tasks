//file TestLab16.java
package lab_16;

public class TestLab16 {
    public static final String DIVIDER = "\n----------------------------------\n";

    public static void main(String[] args) {
        Order order = new TableOrder(10);

        //Order order = new InternetOrder();

        Drink water = new Drink("Tea", "Black", DrinkEnumType.BLACK_TEA);
        Dish pelmeni = new Dish("Bread", "Russian food", 5);
        Drink brandy = new Drink("One shot", "40%", DrinkEnumType.BRANDY, 9, 37.5);
        Dish pizza = new Dish("Pizza", "Pepperoni", 20);
        Drink blackTea = new Drink("Vodka", "40%", DrinkEnumType.VODKA, 6);

        order.add(water);
        order.add(pelmeni);
        order.add(brandy);
        order.add(pizza);
        order.add(blackTea);
        order.add(blackTea);

        /*
        if (!order.add(blackTea)) {
            System.out.println(DIVIDER + "Cannot add 6th position to order of 5 items/dishes/whatever @ TableOrder");
        }
        */

        System.out.println(DIVIDER);

        System.out.println("Item names: ");

        for (String name : order.itemsNames())
            System.out.print(name + ", ");
        System.out.println();

        for (MenuItem item : order.getItems())
            System.out.println(item);

        System.out.println(DIVIDER + "Sorted by cost (descending):");

        for (MenuItem item : order.sortedItemsByCostDesc())
            System.out.println(item);

        System.out.println("Total cost: $" + order.costTotal());

        order.remove("Bread");
        System.out.println(DIVIDER + "Removed Bread, new total cost: $" + order.costTotal());

        for (MenuItem item : order.getItems())
            System.out.println(item);



        InternetOrdersManager manager = new InternetOrdersManager();
        manager.add(order);
        manager.add(order);


        System.out.println(DIVIDER + "Manager's first order's first item:\n\t" + manager.remove().getItems()[0]);
    }
}
