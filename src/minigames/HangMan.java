package minigames;

import java.util.ArrayList;
import java.util.Scanner;

public class HangMan {


    public static void HangMan() {

        ArrayList<String> opgaves = opgaves();
        String opgave = getRndOpgave(opgaves);

        char[] answer = new char[opgave.length()];
        char[] hiddenAnswer = new char[opgave.length()];

        for (int j = 0; j < opgave.length(); j++) {

            answer[j] = opgave.charAt(j);
            hiddenAnswer[j] = ('_');
        }

        System.out.println("a word has been selected, good luck!");
        System.out.println();
        printArray(hiddenAnswer);
        System.out.println();

        int faultyGuesses = 0;
        boolean succeeded = false;
        boolean correct;
        ArrayList<Character> alreadyGuessed = new ArrayList<>();

        while (!succeeded && faultyGuesses < 8) {


            System.out.println("your current amount of faulty guesses is " + faultyGuesses);
            System.out.print("you have already tried: ");
            printArrayList(alreadyGuessed);
            System.out.println("guess a character or press 1 to guess a word");

            Scanner s = new Scanner(System.in);
            String choice = s.nextLine().toLowerCase();
            char charChoice = choice.charAt(0);


            if (choice.equals("1")) {

                System.out.println("please enter your word");
                Scanner sc = new Scanner(System.in);
                String wordChoice = sc.nextLine().toLowerCase();
                if (wordChoice.equals(opgave)) {

                    System.out.println("congo rats, you guessed it right");
                    succeeded = true;
                } else faultyGuesses++;


            } else {

                correct = false;


                for (int k = 0; k < answer.length; k++) {


                    if (charChoice == answer[k]) {
                        correct = true;
                        hiddenAnswer[k] = charChoice;
                    }

                }
                if (!correct) {
                    faultyGuesses++;
                    alreadyGuessed.add(charChoice);
                }

                System.out.println("this is what your current answer looks like");
                printArray(hiddenAnswer);

            }


        }
    }





    private static String getRndOpgave(ArrayList<String> opgaves) {
        double random = Math.round(Math.random() * (opgaves.size()) - 1);
        return opgaves.get((int) random);
    }

    private static ArrayList<String> opgaves() {
        ArrayList<String> opgaves = new ArrayList<>();
        opgaves.add("applicatie");
        opgaves.add("mitch");
        opgaves.add("computer");
        opgaves.add("beletselteken");
        opgaves.add("aansteker");
        opgaves.add("linnengoed");
        opgaves.add("toetsenbord");
        opgaves.add("zomerkledij");
        opgaves.add("carnavalstoet");
        opgaves.add("middenstand");
        opgaves.add("lasciviteit");
        opgaves.add("incognito");
        opgaves.add("amnestie");
        opgaves.add("idiosyncratisch");
        opgaves.add("vigilant");
        opgaves.add("pragmatisch");
        opgaves.add("ultramontanisme");
        opgaves.add("gallicanisme");




        return opgaves;
    }


    public static void printArray(char[] c) { //zou moeten in staat zijn een arraylist te printen

        for (int i = 0; i < c.length; i++) {

            System.out.print(c[i] + " ");

        }
        System.out.println();

    }


    public static void printArrayList(ArrayList c) { //zou moeten in staat zijn een arraylist te printen

        for (int i = 0; i < c.size(); i++) {

            System.out.print(c.get(i) + " ");

        }
        System.out.println();

    }



}
