
public class Main {

    public static void main(String[] args) {
        System.out.println("=== Enemy Factory Demo ===");

        Enemy enemy1 = EnemyFactory.getEnemy("bird");
        if (enemy1 != null) {
            System.out.println("Enemy: " + enemy1.name());
            System.out.println("Damage: " + enemy1.damage());
            System.out.println("Health: " + enemy1.health());
            System.out.println();
        }

        Enemy enemy2 = EnemyFactory.getEnemy("TURTLE");
        if (enemy2 != null) {
            System.out.println("Enemy: " + enemy2.name());
            System.out.println("Damage: " + enemy2.damage());
            System.out.println("Health: " + enemy2.health());
        }

        EnemyFactory.getEnemy("BiRd").name();
    }
}
