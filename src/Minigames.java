import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Minigames {



    public static void galgje () {

        System.out.println();
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




/*

    public static ArrayList<String> createCurrentGuess(){  //maakt een array van _ om te kunnen tonen als een grafische weergave

        ArrayList<String> currentGuess = new ArrayList(getOpgave().size());

        for(int i= 0; i <currentGuess.size(); i++){

            currentGuess.get() = " _ ";

        }return currentGuess;

    }

*/


    public static ArrayList<String> getInput(){ //  user input becomes an array


        System.out.println("voer uw gok in, één letter, of het volledige woord");
        Scanner sc = new Scanner(System.in);
        String gok = sc.nextLine();
        ArrayList<String> guess = new ArrayList<>(gok.length());
        return guess;

        }




     public static void printArrayList(ArrayList<String> e ){ //zou moeten in staat zijn een arraylist te printen

        for (int i = 0; i < e.size();i++){

            System.out.println(e.get(i));

        }

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









