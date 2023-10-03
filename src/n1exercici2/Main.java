package n1exercici2;

import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        List<Integer> list1 = new ArrayList<Integer>();

        List<Integer> list2 = new ArrayList<Integer>();

        list1.add(1);
        list1.add(2);
        list1.add(3);

        ListIterator<Integer> it = list1.listIterator(3);

        while(it.hasPrevious())
        {
            list2.add((Integer)it.previous());
        }

        System.out.println("\nList1: " + list1 + "\n");

        System.out.println("List2: " + list2);

    }
}
