package n2exercici2;

import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
       HashSet<Restaurant> restaurantsList = new HashSet<Restaurant>();

       Restaurant rest1 = new Restaurant("McDonald's", 5);

       Restaurant rest2 = new Restaurant("Burger King", 4);

       Restaurant rest3 = new Restaurant("Kentucky Fried Chicken", 3);

        Restaurant rest4 = new Restaurant("Burger King", 5);

        Restaurant rest5 = new Restaurant("Pizza Hut", 2);

       Restaurant rest6 = new Restaurant("McDonald's", 5);

        Restaurant rest7 = new Restaurant("Burger King", 2);

       Restaurant rest8 = new Restaurant("Pizza Hut", 3);

       Restaurant rest9 = new Restaurant("Kentucky Fried Chicken", 3);

       Restaurant rest10 = new Restaurant("McDonald's", 3);

      restaurantsList.add(rest1);
       restaurantsList.add(rest2);
      restaurantsList.add(rest3);
       restaurantsList.add(rest4);
       restaurantsList.add(rest5);
       restaurantsList.add(rest6);
        restaurantsList.add(rest7);
        restaurantsList.add(rest8);
        restaurantsList.add(rest9);
        restaurantsList.add(rest10);

       List<Restaurant> sortedRestaurantsList = new ArrayList<>(restaurantsList);

        Collections.sort(sortedRestaurantsList);

        System.out.println("\nList of restaurants: \n");

        for(Restaurant r : sortedRestaurantsList)
        {
            System.out.println("Name: " + r.getName());
            System.out.println("Rating: " + r.getRating() + "\n");
        }

    }
}
