import minigames.HangMan;

import java.util.Scanner;

public class TamaUtil {



    public static void printAllStats(Species tama) {

        System.out.println("your current stats are ");
        System.out.println();
        System.out.println("level: " + tama.getAge());
        System.out.println("health: " + tama.getHealth() + "/" + tama.getMaxHealth());
        System.out.println("energy: " + tama.getEnergy() + "/" + tama.getMaxEnergy());

        System.out.println("mood: " + tama.getMood() + "/" + tama.getMaxMood());
        System.out.println("strength: " + tama.getStrength());
        System.out.println("defense: " + tama.getDefense());


    }






    public static void checkStats(Species tama){

        if(tama.getEnergy() <5){
            System.out.println("spawn is getting tired");
        }

        if (tama.getHealth() <= 0){


            System.out.println("spawn died in agony");

        }
        if(tama.getMood()<5){
            System.out.println("spawn is getting angry");
        }
        if(tama.getMood()<=0){
            System.out.println("spawn is angry and rebelled it's way out of your control");

        }
        if(tama.getMood() >10){
            tama.setMood(10);
        }
        if(tama.getEnergy() >10){
            tama.setEnergy(10);
        }
        if(tama.getHealth() >tama.getMaxHealth()){
        }      tama.setHealth(tama.getMaxHealth());
    }








    public static void miniGame(){

        System.out.println("you now get the chance to play a minigame and win shit!");
        System.out.println("press C to start");

        Scanner sc = new Scanner(System.in);
        String choice = sc.nextLine();
        if (choice.equals("c")){
            HangMan.HangMan();
        }else System.out.println("you should really try this minigame the minigame next time RIP");

    }












}
