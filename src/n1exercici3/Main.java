package n1exercici3;

import java.io.IOException;


public class Main
{
    public static void main(String[] args) {

        try{
            String inFilePath = "C:/Users/Usuari/Desktop/countries.txt";
            String outFilePath = "C:/Users/Usuari/Desktop/classificacio.txt";

            Game game = new Game(inFilePath, outFilePath);

            game.startGame();
        }
        catch(IOException e)
        {
            System.out.println(e.getMessage());
        }


    }




}
