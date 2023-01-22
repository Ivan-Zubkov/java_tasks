package lab_7;

import java.util.*;

public class TestArrayList {
    public static void main(String[] args) {

        ArrayList<String> cities = new ArrayList<String>();
        cities.add("Moskau");
        cities.add("Saint Petersburg");
        cities.add("Kazan");
        cities.add("Novosibirsk");
        cities.add(1, "Ekaterinburg");

        System.out.println("Element with index 1: " + cities.get(1));
        cities.set(1, "Krasnoyarsk");

        System.out.println("Array: " + cities);
        System.out.printf("In the array of %d elements \n", cities.size());

        if (cities.contains("Krasnoyarsk")) {
            System.out.println("The array contains Krasnoyarsk");
        }

        ArrayList<String> germanCities = new ArrayList<String>();
        germanCities.add("Bremen");
        germanCities.add("Hamburg");

        cities.addAll(2, germanCities);
        System.out.println(cities);

        cities.remove("Krasnoyarsk");
        System.out.println("Array after removing 'Krasnoyarsk' : " + cities);

        System.out.println("Index of Bremen: " + cities.indexOf("Bremen"));

        cities.replaceAll(e -> e.toUpperCase());
        System.out.println("Uppercase array: " + cities);

        System.out.println("Clearing the array...");
        cities.clear();
        if (cities.isEmpty()) System.out.println("Array is empty");
        else System.out.println("Array is not empty");
        System.out.println("Array: " + cities);

    }
}
