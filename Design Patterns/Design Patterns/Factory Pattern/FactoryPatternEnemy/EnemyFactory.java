public class EnemyFactory {

    public static Enemy getEnemy(String type) {
        if (type == null)return null;
        if (type.equalsIgnoreCase("bird"))return new Bird();
        if (type.equalsIgnoreCase("turtle"))return new Turtle();
        return null;
    }
}