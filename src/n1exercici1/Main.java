package n1exercici1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args)
    {
        List<Month> monthList = new ArrayList<Month>();

        Month january = new Month("January");
        Month february = new Month("February");
        Month march = new Month("March");
        Month april = new Month("April");
        Month may = new Month("May");
        Month june = new Month("June");
        Month july = new Month("July");
        Month august = new Month("August");
        Month september = new Month("September");
        Month october = new Month("October");
        Month november = new Month("November");
        Month december = new Month("december");

        monthList.add(january);
        monthList.add(february);
        monthList.add(march);
        monthList.add(april);
        monthList.add(may);
        monthList.add(june);
        monthList.add(july);
        monthList.add(september);
        monthList.add(october);
        monthList.add(november);
        monthList.add(december);

        monthList.add(7, august);

        System.out.println("\nArrayList: \n");

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