package factorypatternenemy;

import java.util.Random;

public class FactoryPatternEnemy {
   
    static Random R = new Random();
    public static void main(String[] args) {
        int loop = 5;
        while (loop > 0){
            Enemy E = EnemyFactory.createEnemy(getrandom(1,2));
            E.showup();
            loop--;
        }
    }
    public static int getrandom (int min, int max){
                       
        int t = R.nextInt(max) + min;
        return t;
    }
}

