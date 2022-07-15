package com.company;

public class Main {

    public static void main(String[] args) {
    Hero h1 = new Hero();
        System.out.println("STATISTICS OF HERO: "+ h1.getHealth() + " is - health " + h1.getDamage()
        + " is - damage " + h1.getSuperAbility() + " is - superAbility");
        System.out.println();

    h1.setHealth(2);
    h1.setDamage(25);
    h1.setSuperAbility("TELEPORT");{
   Hero h2 = new Hero();
            System.out.println("SECOND STATISTICS : " + h1.getHealth() + " is - health. " + h1.getDamage()
                    + " is - damage");
   h2.setHealth(15);
   h2.setDamage(-1000);
   Boss b1 = new Boss();
   b1.setBossHp(500);
   b1.setBossDamage(100);
   b1.setAttackType("MAGIC");
            System.out.println("STATISTICS OF BOSS: " + b1.getBossHp() + " is - Boss HP. " + b1.getBossDamage() + " is - Boss Damage. " + b1.getAttackType() + " is - ATTACK TYPE .");

        }
    }




}





