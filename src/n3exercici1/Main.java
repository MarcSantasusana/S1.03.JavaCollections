package n3exercici1;

import java.io.*;
import java.util.*;

public class Main
{
    public static void main(String[] args) throws IOException {

        int option;
        boolean quit = false;
        List<Person> peopleList = new ArrayList<Person>();
        String filePath = "src/n3exercici1/llistaPersones.csv";

        readFile(peopleList, filePath);

        while(!quit)
        {

            option = askInt("\n Menu:\n" +
                    "\n" +
                    "1.- Add person.\n" +
                    "\n" +
                    "2.- Show people sorted by name (A-Z).\n" +
                    "\n" +
                    "3.- Show people sorted by name (Z-A).\n" +
                    "\n" +
                    "4.- Show people sorted by surname (A-Z).\n" +
                    "\n" +
                    "5.- Show people sorted by surname (Z-A).\n" +
                    "\n" +
                    "6.- Show people sorted by ID (1-9).\n" +
                    "\n" +
                    "7.- Show people sorted by ID (9-1).\n" +
                    "\n" +
                    "0.- Quit.");


            switch (option)
            {
                case 1:

                    addPerson(peopleList);

                    break;

                case 2:

                    sortNameAZ(peopleList);

                    break;

                case 3:

                    sortNameZA(peopleList);

                    break;

                case 4:

                    sortSurnameAZ(peopleList);

                    break;

                case 5:

                    sortSurnameZA(peopleList);

                    break;

                case 6:

                    sortId19(peopleList);

                    break;

                case 7:

                    sortId91(peopleList);

                    break;

                case 0:

                    quit = true;
                    break;

                default:

            }

        }




    }

    public static int askInt(String message)
    {
        Scanner scanner = new Scanner(System.in);
        int info;

        System.out.println(message);
        info = scanner.nextInt();

        return info;

    }

    public static String askString(String message)
    {
        Scanner scanner = new Scanner(System.in);
        String info;

        System.out.println(message);
        info = scanner.nextLine();

        return info;

    }

    public static void readFile(List<Person> peopleList, String filePath) throws IOException
    {
        File file = new File(filePath);

        BufferedReader reader = null;
        String line = "";

        reader = new BufferedReader(new FileReader(file));

        reader.readLine();

        while((line = reader.readLine()) != null)
        {
            String[] row = line.split(",");

            String name = row[0];
            String surname = row[1];
            String id = row[2];

            Person person = new Person(name, surname, id);

            peopleList.add(person);

        }

        reader.close();


    }

    public static void addPerson(List<Person> peopleList)  {

        String name = askString("Please enter the person's name");
        String surname  =askString("Please enter the person's surname");
        String id = askString("Please enter the person's id");

       Person person = new Person(name, surname, id);

       peopleList.add(person);
    }

    public static void sortNameAZ(List<Person> peopleList)
    {
        Collections.sort(peopleList, new Comparator<Person>() {
                @Override
                public int compare(final Person p1, final Person p2) {
                    return p1.getName().compareTo(p2.getName());
                }
            });

            showList(peopleList);

    }

    public static void sortNameZA(List<Person> peopleList)
    {
        Collections.sort(peopleList, new Comparator<Person>() {
                @Override
                public int compare(final Person p1, final Person p2) {
                    return p2.getName().compareTo(p1.getName());
                }
            });

            showList(peopleList);

    }

    public static void sortSurnameAZ(List<Person> peopleList)
    {
        Collections.sort(peopleList, new Comparator<Person>() {
                @Override
                public int compare(final Person p1, final Person p2) {
                    return p1.getSurname().compareTo(p2.getSurname());
                }
            });

            showList(peopleList);

    }

    public static void sortSurnameZA(List<Person> peopleList)
    {
        Collections.sort(peopleList, new Comparator<Person>() {
                @Override
                public int compare(final Person p1, final Person p2) {
                    return p2.getSurname().compareTo(p1.getSurname());
                }
            });

            showList(peopleList);

    }

    public static void sortId19(List<Person> peopleList)
    {
        Collections.sort(peopleList, new Comparator<Person>() {
                @Override
                public int compare(Person p1, Person p2) {
                    return p1.getId().compareTo(p2.getId());
                }
            });

            showList(peopleList);

    }

    public static void sortId91(List<Person> peopleList)
    {
        Collections.sort(peopleList, new Comparator<Person>() {
                @Override
                public int compare(Person p1, Person p2) {
                    return p2.getId().compareTo(p1.getId());
                }
            });

            showList(peopleList);

    }

    public static void showList(List<Person> peopleList)
    {
        System.out.printf("%-10.10s %-20.20s %-20.20s%n", "___Name___", " ____Surname___", "__ID__");

        for(Person p : peopleList)
        {
            System.out.printf("%-10.10s %-20.20s %-20.20s%n" , p.getName(), p.getSurname(), p.getId());
        }
    }
}
