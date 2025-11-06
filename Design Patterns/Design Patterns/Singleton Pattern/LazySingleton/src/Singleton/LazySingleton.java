package Singleton;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LazySingleton {
    private String [] letters = {"a", "b", "c", "d", "e"}; 
    private List<String> data = Arrays.asList(letters);
    
    private static LazySingleton oneinstance;
    
    public static LazySingleton getinstance (){
        if(oneinstance == null){
            oneinstance = new LazySingleton();
        }
        return oneinstance;
    }
    private LazySingleton (){
        Collections.shuffle(data);
    }
    public void printdata (){
        for(String item : data){
            System.out.print(item + " ");
        }
        System.out.println("");
    }
}

