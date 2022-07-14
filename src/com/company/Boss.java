package com.company;

public class Boss {
    private static int BossHp = 999;
    private static int BossDamage = 99;
    private static String AttackType = "MAGIC";
    public String setBossHp;
    public String setBossDamage;
    public String setAttackType;
public void setBossHp(int BossHp) {
    if (BossHp < 0) {
        System.out.println(" Error value health , health must be a positive number");
    } else {
        this.BossHp = BossHp;
        {

        }


    }

}public int getBossHp() {
 return this.BossHp = BossHp;


} public void setBossDamage(int BossDamage) {
    this.BossDamage = BossDamage;


    }



 public int getBossDamage() {
    return BossDamage  = BossDamage;

 } public  void setAttackType(String AttackType) {
    this.AttackType = AttackType;
}

public String getAttackType(){
    return this.AttackType = AttackType;
}
}


