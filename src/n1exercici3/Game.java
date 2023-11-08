package n1exercici3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Game {

   private final int NQUESTIONS;
    private File inFile;
    private File outFile;

    private HashMap<String, String> questionsMap;
   private  Player player;

   public Game(String inFilePath, String outFilePath)
   {
       NQUESTIONS = 10;
      inFile = new File(inFilePath);
      outFile = new File(outFilePath);
      questionsMap = new HashMap<String, String>();
      player = new Player();
   }

    public void createPlayer()
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your name");

        String name = scanner.nextLine();

         player.setName(name);


    }

    public void startGame() throws IOException {

        readFile();

        createPlayer();

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        List<String> countriesList = new ArrayList<>(questionsMap.keySet());

        String country;
        String capital;
        String answer;

        for(int i = 0; i < NQUESTIONS; i++)
        {
            country = countriesList.get(random.nextInt(countriesList.size()));

            capital = questionsMap.get(country);

            System.out.println("Type in the capital of " + country);

            answer = scanner.nextLine();

            if(answer.equals(capital))
            {
                System.out.println("Correct answer");
                player.incPoints();
            }
            else
            {
                System.out.println("Incorrect answer");
            }

        }

        System.out.println("You got " + player.getPoints() + " points");



        writeFile();


    }

    public void writeFile() throws IOException {

        FileWriter writer = new FileWriter(outFile);

        writer.write("Name: " + player.getName() + " Points: " + player.getPoints());

        writer.close();

    }

    public void readFile() throws FileNotFoundException {


        Scanner scanner = new Scanner(inFile);

        String country;
        String capital;


        while(scanner.hasNext())
        {
            country = scanner.next();
            capital = scanner.next();


           questionsMap.put(country, capital);

        }




    }



}
