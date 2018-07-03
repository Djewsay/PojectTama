import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Minigames {


    public static void galgje() {

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

        int faultyguesses = 0;
        boolean guessed = false;




       while (!guessed) {

            System.out.println("do you wish to guess a character (c) or the whole word?(word)");
            Scanner s = new Scanner(System.in);
            String choice = s.nextLine();

            if (choice.equals("word")){

                System.out.println("please enter your guess");
                Scanner sc = new Scanner(System.in);
                String wordChoice = sc.nextLine();
                if (wordChoice.equals(opgave)){

                    System.out.println("congo rats, you guessed it right");
                    guessed =true;
                }


            }else if (choice.equals("c")) {

                System.out.println("guess your character and see!");
                Scanner sc = new Scanner(System.in);
                char guess = sc.nextLine().charAt(0);


                for (int k = 0; k < answer.length; k++) {


                    if (guess == answer[k]) {

                        hiddenAnswer[k] = guess;
                    }

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


}



















