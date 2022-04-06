// 1 suggested correction, 6 compiler errors
import java.util.*;
public class VirtualAssistant{
    public String name;
    public ArrayList<String> abilities;
    public static numOfAssistants =0;

    public VirtualAssistant(String alexa){
        this.name= name;
        this.abilities.add("Dim the light");
        this.numOfAssistants++;
    }

    public void printHello(){
        return "hello";
    }

    public Date getCurrentDate(){
        Date d = new Date();
        String dateInStr = d.toString();
        return dateInStr;
    }

    public void printAbilities(ArrayList<String> abilities){ 
        for(String element : abilities){
            System.out.println(element);
        }
    }
}

