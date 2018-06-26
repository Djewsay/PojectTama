public class   Species {

    private int health = 20;
    private int maxHealth = 20;
    private int age = 1;
    private int mood = 10;
    private int maxMood=10;
    private int strength = 1;
    private int defense = 1;
    private int energy = 10;
    private int maxEnergy =10;
    private int experience;
    private int maxExperience=5;
    private String name;






    public  void eat() {

        checkStats();

        if(energy > 0) {

            System.out.println("spawn is eating and gained some experience!");
            mood++;
            energy = energy - 2;
            experience++;
             checkStats();
            System.out.println("mood: "+mood+"/"+maxMood);
            System.out.println("energy: "+energy+"/"+maxEnergy);

            if(experience>=maxExperience){

                levelUp();
            }

        }
    }


    public void poo() {



        System.out.println(" ");
    }

    public void play() {
           checkStats();
        if(energy>0){
            System.out.println("spawn is playing");
            mood ++;
            experience++;
            energy = energy -2;
            checkStats();
            System.out.println("mood: "+mood+"/"+maxMood);
            System.out.println("energy: "+energy+"/"+maxEnergy);

            if(experience>=maxExperience){

                levelUp();
            }

        }


    }


    public void sleep(){
         checkStats();
        energy = 10;
        System.out.println("energy replenished, energy: "+energy);
        checkStats();


    }

    public void train(){

        energy = energy -3;
        mood=mood -2;
        strength++;
        defense++;
        experience++;
        checkStats();

        System.out.println("mood: "+mood+"/"+maxMood);
        System.out.println("energy "+energy+"/"+maxEnergy);
        System.out.println("strength: "+strength);
        System.out.println("defense: "+defense);



        if(experience>=maxExperience){
            levelUp();

    }
        }


    public void levelUp(){


        maxHealth = maxHealth+ 10;
        health = maxHealth;
        energy = 10;
        strength ++;
        defense ++;
        age ++;
        mood = maxMood;
        experience=0;
        System.out.println("Congo rats! your spawn has leveled up!");
        checkStats();
        printAllStats();


    }



    public void printAllStats(){

        System.out.println("your current stats are ");
        System.out.println();
        System.out.println("level: " +age);
        System.out.println("health: "+health+"/"+maxHealth);
        System.out.println("energy: " +energy+"/"+maxEnergy);

        System.out.println("mood: " +mood+"/"+maxMood);
        System.out.println("strength: " +strength);
        System.out.println("defense: " +defense);

    }


     public void checkStats(){

        if(this.energy <5){
        System.out.println("spawn is getting tired");
        }

        if (this.health <= 0){

       
            System.out.println("spawn died in agony");

         }
         if(this.mood<5){
             System.out.println("spawn is getting angry");
         }
         if(this.mood<=0){
             System.out.println("spawn is angry and rebelled it's way out of your control");

         }
         if(this.mood >10){
            this.mood = 10;
         }
         if(this.energy >10){
            this.energy = 10;
         }
         if(this.health >this.maxHealth){
     }      this.health = this.maxHealth;
         }


    public int getHealth() {
        return health;
    }

    public int getMaxHealth() {
        return maxHealth;
    }

    public int getAge() {
        return age;
    }

    public int getMood() {
        return mood;
    }

    public int getMaxMood() {
        return maxMood;
    }

    public int getStrength() {
        return strength;
    }

    public int getDefense() {
        return defense;
    }

    public int getEnergy() {
        return energy;
    }

    public int getMaxEnergy() {
        return maxEnergy;
    }

    public int getExperience() {
        return experience;
    }

    public int getMaxExperience() {
        return maxExperience;
    }


    public void setHealth(int health) {
        this.health = health;
    }

    public void setMaxHealth(int maxHealth) {
        this.maxHealth = maxHealth;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setMood(int mood) {
        this.mood = mood;
    }

    public void setMaxMood(int maxMood) {
        this.maxMood = maxMood;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }

    public void setMaxEnergy(int maxEnergy) {
        this.maxEnergy = maxEnergy;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public void setMaxExperience(int maxExperience) {
        this.maxExperience = maxExperience;
    }

    public Species(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Species(int health, int maxHealth, int age, int mood, int maxMood, int strength, int defense, int energy, int maxEnergy, int experience, int maxExperience) {
        this.health = health;
        this.maxHealth = maxHealth;
        this.age = age;
        this.mood = mood;
        this.maxMood = maxMood;
        this.strength = strength;
        this.defense = defense;
        this.energy = energy;
        this.maxEnergy = maxEnergy;
        this.experience = experience;
        this.maxExperience = maxExperience;



    }


}
