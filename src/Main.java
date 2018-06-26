import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

      //  Minigames.galgje();

// we let the user select his/her character
        Species tama = charSelect();

// we currently loop until the tama is dead
        while(!isDead(tama)) {


            giveChoice(tama);
            tama.checkStats();
            if(isDead(tama)){
                System.out.println("R.I.P. "+ tama.getName());
                System.out.println("Try again?");
            }

        }




    }




     public static Species charSelect(){ //here we give the user the option which species he/she wants to play
         System.out.println("please choose your species: 1 for Dragon, 2 for Titan and 3 for god");
         Scanner sc  = new Scanner(System.in);
         String choice = sc.nextLine();


         if (choice.equals("1")){
               Dragon tama = createDragon();
               return tama;
         }else if(choice.equals("2")){
              Titan tama =createTitan();
              return tama;
         }else if (choice.equals("3")){
               God tama = createGod();
               return tama;
         }

        return null;

     }




    public static Dragon createDragon () {
        System.out.println("please enter the name you wish to bestow upon your dragonkin");
        Scanner sc = new Scanner(System.in);
        String givenName = sc.nextLine();

        Dragon tama = new Dragon(givenName);
        System.out.println("Your dragon has been blessed with the name: " + tama.getName() + "");
        return tama;

    }


    public static God createGod(){

        System.out.println("please enter the name you wish to bestow upon your deity");
        Scanner sc = new Scanner(System.in);
        String givenName = sc.nextLine();

        God tama = new God(givenName);
        System.out.println("Your deity has been blessed with the name: " + tama.getName() + "");
        return tama;
    }




    public static Titan createTitan(){

        System.out.println("please enter the name you wish to bestow upon your titan");
        Scanner sc = new Scanner(System.in);
        String givenName = sc.nextLine();

        Titan tama = new Titan(givenName);
        System.out.println("Your titan has been blessed with the name: " + tama.getName() + "");
        return tama;
    }



public static void giveChoice(Species tama){ //this is the choice menu for the user, need to make an arraylist of some sort so i can easily add new features

    System.out.println("choose between eat, play,train or sleep");
    Scanner sc = new Scanner(System.in);
    String choice = sc.nextLine();

    if (choice.equals("eat")) {

        tama.eat();

    } else if (choice.equals("play")) {

        tama.play();
    } else if (choice.equals("sleep")) {

        tama.sleep();
    } else if (choice.equals(("train"))) {

        tama.train();
    }


}

public static boolean isDead(Species tama){ //checks if te user's spawn is RIP
        boolean rip = false;
        if(tama.getHealth()<=0 | tama.getEnergy()<=0){
            rip = true;
        }return rip;
}



}