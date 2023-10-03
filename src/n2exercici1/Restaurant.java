package n2exercici1;

import java.util.HashSet;


public class Restaurant
{
    String name;
    int rating;

    public Restaurant(String name, int rating)
    {
        this.name = name;
        this.rating = rating;
    }

    public int getRating() {
        return rating;
    }

    public String getName() {
        return name;
    }

    public Restaurant isRepeated(HashSet<Restaurant> restaurantsList)
    {
        boolean found = false;
        int i = 0;
        Restaurant rest = this;

        Restaurant[] restaurantsArray  = restaurantsList.toArray(new Restaurant[restaurantsList.size()]);

        while(!found && i<restaurantsArray.length)
        {
            if(restaurantsArray[i].getName().equals(this.name) && restaurantsArray[i].getRating() == this.rating)
            {
                found = true;
                rest = restaurantsArray[i];

            }
            else {
                i++;
            }

        }

        return rest;
    }
}
