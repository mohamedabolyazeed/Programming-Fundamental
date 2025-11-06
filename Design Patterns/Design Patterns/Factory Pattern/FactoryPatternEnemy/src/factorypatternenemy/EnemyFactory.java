package factorypatternenemy;


public class EnemyFactory {
   
    public static final int TURTLE = 1;
    public static final int BIRD = 2;
    
    public static Enemy createEnemy (int id){
        switch (id){
            case TURTLE:
                return new Turtle();
            case BIRD:
                return new Bird();
            default:
                return null;
        }
    }
}

