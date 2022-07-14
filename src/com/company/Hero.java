package com.company;

public class Hero {
    private static int Health = 100;
    private static int Damage = 25;
    private static String SuperAbility = "TELEPORT";
    public String setHealth;
    public String setDamage;
    public String setSuperAbility;
    public void setHealth(int Health) {
        if (Health < 0) {
            System.out.println(" Error value health , health must be a positive number");

        } else {
            this.Health = Health;
        }


    }

    public int getHealth() {
        return this.Health;


    }
public void setDamage(int Damage) {
    this.Damage = Damage;
}

{

} public int getDamage() {
        return this.Damage;
    }

public void setSuperAbility(String SuperAbility){
    this.SuperAbility = SuperAbility;
    }
public String getSuperAbility() {
   return this.SuperAbility = SuperAbility;
}
}


