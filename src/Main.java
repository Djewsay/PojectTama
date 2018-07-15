import species.*;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        long startTime = System.nanoTime();



// we let the user select his/her character
        Species tama = charSelect();


// we currently loop until the tama is dead
        while(!isDead(tama)) {


            choiceMenu(tama);
           TamaUtil.checkStats(tama);
            if(isDead(tama)){
                System.out.println("R.I.P. "+ tama.getName());
                System.out.println("Try again?");
            }

        }




    }












     public static Species charSelect(){ //here we give the user the option which species he/she wants to play
         System.out.println("please select your species: 1 for Fish, 2 for Dog, 3 for Cat");
         Scanner sc  = new Scanner(System.in);
         String choice = sc.nextLine().toLowerCase();


         if (choice.equals("1")){
               TamaFish tama = createTamaFish();
               return tama;
         }else if(choice.equals("2")){
              TamaDog tama =createTamaDog();
              return tama;
         }else if (choice.equals("3")){
               TamaCat tama = createTamaCat();
               return tama;
         }

        return null;

     }




    public static TamaFish createTamaFish () {
        System.out.println("please enter the name you wish to bestow upon your water spawn");
        Scanner sc = new Scanner(System.in);
        String givenName = sc.nextLine();

        TamaFish tama = new TamaFish(givenName);
        System.out.println("Your fish has been blessed with the name: " + tama.getName() + "");
        return tama;

    }


    public static TamaCat createTamaCat(){

        System.out.println("please enter the name you wish to bestow upon your cat");
        Scanner sc = new Scanner(System.in);
        String givenName = sc.nextLine();

        TamaCat tama = new TamaCat(givenName);
        System.out.println("Your cat has been blessed with the name: " + tama.getName() + "");
        return tama;
    }




    public static TamaDog createTamaDog(){

        System.out.println("please enter the name you wish to bestow upon your doggo");
        Scanner sc = new Scanner(System.in);
        String givenName = sc.nextLine();

        TamaDog tama = new TamaDog(givenName);
        System.out.println("Your doggo has been blessed with the name: " + tama.getName() + "");
        return tama;
    }



public static void choiceMenu(Species tama){ //this is the choice menu for the user, need to make an arraylist of some sort so i can easily add new features


    System.out.println("type a command or /commands to see the available commands");


    Scanner sc = new Scanner(System.in);
    String choice = sc.nextLine();

    if (choice.equals("/eat")) {

        tama.eat();

    } else if (choice.equals("/play")) {

        tama.play();
    } else if (choice.equals("/sleep")) {

        tama.sleep();
    } else if (choice.equals(("/train"))) {

        tama.train();
    }else if (choice.equals("/commands")){

        System.out.println("these are the available commands: ");
        System.out.println();
        System.out.println("/eat");
        System.out.println("/play");
        System.out.println("/sleep");
        System.out.println("/train");

    }else if (choice.equals("rarecandy")){

        tama.levelUp();


    }else System.out.println("not a valid input");

}

public static boolean isDead(Species tama){ //checks if te user's spawn is RIP
        boolean rip = false;
        if(tama.getHealth()<=0 | tama.getEnergy()<=0){
            rip = true;
        }return rip;
}





















}