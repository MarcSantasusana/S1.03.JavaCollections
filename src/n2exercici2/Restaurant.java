package n2exercici2;




public class Restaurant implements Comparable
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


    @Override
    public int compareTo(Object o) {

        Restaurant restaurant = (Restaurant)o;
        int compareName = this.name.compareTo(restaurant.getName());

        if(compareName == 0)
        {
            return Integer.compare(restaurant.rating, this.rating);
        }

        else {
            return compareName;
        }
    }
}
