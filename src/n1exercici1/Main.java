package n1exercici1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args)
    {
        List<Month> monthList = new ArrayList<Month>();


        monthList.add(new Month("January"));
        monthList.add(new Month("February"));
        monthList.add(new Month("March"));
        monthList.add(new Month("April"));
        monthList.add(new Month("May"));
        monthList.add(new Month("June"));
        monthList.add(new Month("July"));
        monthList.add(new Month("September"));
        monthList.add(new Month("October"));
        monthList.add(new Month("November"));
        monthList.add(new Month("december"));

        System.out.println("\nArrayList without august: \n");

        for(Month m : monthList)
        {
            System.out.println(m.getName());
        }

        Month august = new Month("August");

        monthList.add(7, august);

        System.out.println("\nArrayList with every month: \n");

        for(Month m : monthList)
        {
            System.out.println(m.getName());
        }

        HashSet<Month> monthSet = new HashSet<Month>(monthList);

        monthSet.add(august); //Repeated month added

        System.out.println("\nHashSet (for): \n");

        for(Month m : monthSet)
        {
            System.out.println(m.getName());
        }

        Iterator<Month> it = monthSet.iterator();

        System.out.println("\nHashSet (iterator): \n");

        while (it.hasNext())
        {
            System.out.println(it.next().getName());
        }



    }
}