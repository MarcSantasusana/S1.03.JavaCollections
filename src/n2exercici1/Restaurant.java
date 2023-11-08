package n2exercici1;




public class Restaurant
{
    private String name;
   private int rating;

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

    @Override
    public boolean equals(Object obj)
    {
        Restaurant restaurant = (Restaurant) obj;

        return restaurant.getName().equals(this.name) && restaurant.getRating() == this.rating;
    }

    @Override
    public int hashCode()
    {
        return rating + name.hashCode();
    }

}
