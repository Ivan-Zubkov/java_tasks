//file TestRestaurantOrder.java
package practice16;

import java.util.Arrays;

public class TestRestaurantOrder {
    public static void main(String[] args) throws IllegalTableNumber, OrderAlreadyAddedException {
        OrderManager orderManager = new OrderManager();

        Drink drink = new Drink(75, "Sprite", "Lime-lemon drink");
        Dish dish = new Dish(110, "Cheese soup", "delicate creamy soup with cheese flavor");

        RestaurantOrder restaurantOrder1 = new RestaurantOrder();
        RestaurantOrder restaurantOrder2 = new RestaurantOrder();
        restaurantOrder1.add(drink);
        restaurantOrder1.add(dish);
        restaurantOrder1.add(dish);
        for (int i = 0; i < 15 ; i++){
            restaurantOrder1.add(dish);
        }

        System.out.println("item quantity: " + restaurantOrder1.itemQuantity());

        String[] mas = restaurantOrder1.itemsNames();
        System.out.println("Order: ");
        for (int i = 0; i < mas.length; i++){
            if (mas[i] != null){
                System.out.println(mas[i] + " ");
            }
        }


        orderManager.add(3, restaurantOrder1);
        //orderManager.add(0, restaurantOrder2);
//        orderManager.add(3, restaurantOrder2);

        System.out.println("Free tables - " + Arrays.toString(orderManager.freeTableNumbers()));
    }
}
