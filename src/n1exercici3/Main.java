package n1exercici3;

import java.io.IOException;


public class Main
{
    public static void main(String[] args) {

        try{
            String inFilePath = "src/n1exercici3/countries.txt";
            String outFilePath = "classificacio.txt";

            Game game = new Game(inFilePath, outFilePath);

            game.startGame();
        }
        catch(IOException e)
        {
            System.out.println(e.getMessage());
        }


    }




}
