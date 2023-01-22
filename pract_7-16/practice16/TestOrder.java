//file TestOrder.java
package practice16;

public class TestOrder {
    public static void main(String[] args) throws IllegalTableNumber, OrderAlreadyAddedException{
        OrderManager orderManager = new OrderManager();

        Drink drink1 = new Drink(45, "fanta", "orange drink");
        Drink drink2 = new Drink(55, "cola", "brown drink");
        Dish dish1 = new Dish(25,"Pasta Pomodoro", "Pasta with tomato");

        InternetOrder internetOrder1 = new InternetOrder();
        InternetOrder internetOrder2 = new InternetOrder();
        internetOrder1.add(drink1);
        internetOrder1.add(drink2);
        internetOrder1.add(dish1);
        internetOrder2.add(dish1);


        System.out.println(internetOrder1.costTotal() + " total");

        orderManager.add("Moskau, st. lenina, 65, 401", internetOrder1);
//        orderManager.add("Moskau, st. lenina, 65, 401", internetOrder2);

        System.out.println("Number of online orders - Pasta Pomodoro: " + orderManager.itemInternetQuantity("Pasta Pomodoro"));
        System.out.println("Total order price: " + orderManager.internetCostSummary());

    }
}
