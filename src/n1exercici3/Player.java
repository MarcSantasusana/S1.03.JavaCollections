package n1exercici3;

public class Player {

    private String name;
    private int points;

    public Player() {

        points = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getPoints() {
        return points;
    }

    public void incPoints()
    {
        points++;
    }
}
