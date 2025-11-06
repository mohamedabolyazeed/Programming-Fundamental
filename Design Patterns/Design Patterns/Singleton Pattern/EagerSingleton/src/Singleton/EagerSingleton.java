package Singleton;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class EagerSingleton {
    private String [] letters = {"a", "b", "c", "d", "e"}; 
    private List<String> data = Arrays.asList(letters);
    
    public static EagerSingleton oneinstance = new EagerSingleton();
  
    private EagerSingleton (){
        Collections.shuffle(data);
    }
    public void printdata (){
        for(String item : data){
            System.out.print(item + " ");
        }
        System.out.println("");
    }
}

