package jp.ac.uryukyu.ie.e235708;

public class Warrior extends LivingThing {
    public Warrior(String name, int maximumHP, int attack) {
        super(name, maximumHP, attack);
    }

    public void attackWithWeponSkill(LivingThing opponent) {
        if (isDead() == false) {
            int damage = (int)(1.5 * getAttack());
            System.out.printf("%sの攻撃！ウェポンスキルを発動！%sに%dのダメージを与えた！！", getName(), opponent.getName(), damage);
            opponent.wounded(damage);
        }
    }
}