import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Minigames {



    public static void galgje () {

        getOpgave();

    }


    public static ArrayList getOpgave(){ //haalt een random opgave uit de lijst met opgaves en maakt een arraylist van de opgave // int maken met nodige lengte array

        ArrayList<String> opgaves = new ArrayList<>();
        opgaves.add("application");
        opgaves.add("mitch");
        opgaves.add("computer");
        opgaves.add("beletselteken");
        double random = Math.round(Math.random() * opgaves.size() );
        String opgave = opgaves.get((int)random);
        ArrayList<String> answer = new ArrayList<>(opgaves.size());
        return answer;

    }






    public static String[] createCurrentGuess(){  //maakt een array van _ om te kunnen tonen als een grafische weergave

        String[] currentGuess = new String[getOpgave().size()];

        for(int i= 0; i <currentGuess.length; i++){

            currentGuess[i] = " _ ";

        }return currentGuess;

    }




    public static String[] getInput(){ //  user input becomes an array


        System.out.println("voer uw gok in, één letter, of het volledige woord");
        Scanner sc = new Scanner(System.in);
        String gok = sc.nextLine();
        String[] guess = new String[gok.length()];
        return guess;

        }





     }







  /*  public static void checkInput(ArrayList guess, ArrayList opgave, ArrayList answer){ //input gets checked for correct guesses


        if(guess.equals(opgave)){
            System.out.println("Congo rats! you guessed correct and wont the game");

            }
        for(int i = 0; i < opgave.size;i++){

            if (getOpgave().contains(gok)){


            }
        }


        }


*/









