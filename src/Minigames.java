import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Minigames { //to do, reeds ingegeven letters


    public static void hangMan() {

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

       while (!succeeded&& faultyGuesses<5) {


            System.out.println("your current amount of faulty guesses is "+faultyGuesses);
            System.out.println("do you wish to guess a character (1) or the whole word?(2)");

            Scanner s = new Scanner(System.in);
            String choice = s.nextLine();

            if (choice.equals("2")){

                System.out.println("please enter your guess");
                Scanner sc = new Scanner(System.in);
                String wordChoice = sc.nextLine();
                if (wordChoice.equals(opgave)){

                    System.out.println("congo rats, you guessed it right");
                    succeeded =true;
                }else faultyGuesses++;


            }else if (choice.equals("1")) {

                correct = false;
                System.out.println("guess your character and see!");
                System.out.print("you have already tried: ") ;
                printArrayList(alreadyGuessed);
                Scanner sc = new Scanner(System.in);
                char guess = sc.nextLine().charAt(0);


                for (int k = 0; k < answer.length; k++) {


                    if (guess == answer[k]) {
                        correct = true;
                        hiddenAnswer[k] = guess;
                    }

                }
                if(!correct){
                    faultyGuesses++;
                    alreadyGuessed.add(guess);
                }

                System.out.println("this is what your current answer looks like");
                printArray(hiddenAnswer);


            }
        }


    }





















    private static String getRndOpgave(ArrayList<String> opgaves) {
        double random = Math.round(Math.random() * (opgaves.size())-1);
        return opgaves.get((int) random);
    }

    private static ArrayList<String> opgaves() {
        ArrayList<String> opgaves = new ArrayList<>();
        opgaves.add("application");
        opgaves.add("mitch");
        opgaves.add("computer");
        opgaves.add("beletselteken");
        opgaves.add("aansteker");
        opgaves.add("linnengoed");
        opgaves.add("toetsenbord");
        return opgaves;
    }


    public static void printArray(char[] c) { //zou moeten in staat zijn een arraylist te printen

        for (int i = 0; i < c.length; i++) {

            System.out.print(c[i]+" ");

        }
        System.out.println();

    }



    public static void printArrayList(ArrayList c) { //zou moeten in staat zijn een arraylist te printen

        for (int i = 0; i < c.size(); i++) {

            System.out.print(c.get(i)+" ");

        }
        System.out.println();

    }




}



















