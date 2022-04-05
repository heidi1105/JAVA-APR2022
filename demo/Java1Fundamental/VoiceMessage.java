import java.util.Date;
public class VoiceMessage{

    public String basicGreeting(){
        return "Hi, you are in the voice message";
    }

    public String basicGreeting(String name){
        return "Hi, "+ name;
    }

    public String basicGreeting(int numOfMessages){
        return "Hi, you have "+ numOfMessages+ " messages";
    }

    public String basicGreeting(String name, int numOfMessages){
        return "Hi, "+ name + "! you have "+ numOfMessages+ " messages";
    }

    public String getCurrentDate(){
        Date today = new Date();
        return "Today is "+ today;
    }


    public void greetName(String name){
        System.out.println("Hi, " + name);
    }




}