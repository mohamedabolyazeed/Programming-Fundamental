package factorypattern;

public class SandWich {
    private String name;
    private int calories;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }
    
    public void prepare(){
        System.out.println("The Sandwich name is " + name + " is prepared with calories "+ calories);
    }
}
