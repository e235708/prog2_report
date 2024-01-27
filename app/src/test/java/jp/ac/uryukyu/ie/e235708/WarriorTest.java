package jp.ac.uryukyu.ie.e235708;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class WarriorTest {

    
    @Test
    void attackWithWeponSkill(){
        int enemyHP = 55;
        Warrior warrior = new Warrior("ヲリアー", 100, 10);
        Enemy enemy = new Enemy("スライム", 100, 5);

        for(int i = 0; i < 3; i++ ){
            warrior.attackWithWeponSkill(enemy);
        }
            assertEquals(enemyHP, enemy.getHitPoint());
        
    }
}
