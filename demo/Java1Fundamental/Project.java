// OOP --> attributes, methods, 
import java.util.ArrayList;
public class Project{

    public static void main(String[] args){
        for(int i=0;i<args.length;i++){
            System.out.println(args[i]);
        }

        String title = "Hello World"; // Object type 
        int collaborators = 32;
        double cost = 19999.99;
        char difficulty = 'A';
        boolean isCompleted = false;

        System.out.println(title);
        System.out.println(collaborators);
        System.out.println(cost);
        System.out.println(difficulty);
        System.out.println(isCompleted);

        if(collaborators>30){
            System.out.println("This is a big project");
        }else{
            System.out.println("This is a small project");
        }

        if(isCompleted){
            System.out.println("This is completed");
        }else{
            System.out.println("This is NOT completed");
        }

        // -----------------STRING -------------------
        String creator = "Heidi";
        
        // .length
        int creatorLength = creator.length();
        System.out.println(creatorLength);

        // .concat
        System.out.println(title + " is created by " + creator);
        System.out.println(title.concat(creator)); // Hello WorldHeidi
        System.out.println(title.concat(" is created by ").concat(creator));

        // String.format
        System.out.printf("%s is created by %s", "Alfred bot", creator);
        System.out.println(String.format("%s is created by %d people" , "Alfred bot", collaborators));
        String message = String.format("%s is created by %s", "Alfred bot", creator);
        System.out.println(message.indexOf("John"));

        // == .equals()
        String creator1 = "Heidi";
        String creator2 = new String("Heidi");
        String creator3 = "Heidi";

        System.out.println(creator1 == creator3); // true
        System.out.println(creator1 == creator2); // false

        System.out.println(creator1.equals(creator3)); // true
        System.out.println(creator1.equals(creator2)); // true


        // -----type casting -----
        // no loss of data --> implicit casting
        int intPrice = 50;
        double intToDoublePrice = intPrice;

        // explicit casting
        double doublePrice = 19.99;
        int doubleToIntPrice = (int) doublePrice;
        System.out.println(doublePrice);
        System.out.println(doubleToIntPrice);


        // fixed array

        // option 1 -- instantiate fixed array
        int[] progressPerDay = new int[5];
        progressPerDay[0] = 10;
        progressPerDay[1] = 15;
        progressPerDay[2] = 25;
        for(int i =0; i<progressPerDay.length; i++){
            System.out.println(progressPerDay[i]);
        }

        // option 2 -- instantiate fixed array
        int[] progressPerDay2 = {100,200,300,400,500};
        for(int i =0; i<progressPerDay.length; i++){
            System.out.println(progressPerDay2[i]);
        }

        String[] namesOfCollaborators = {"Heidi", "Aden", "Alberto"};
        for(int i =0; i<namesOfCollaborators.length; i++){
            System.out.println(namesOfCollaborators[i]);
        }
        // fixed array: length, dynamic array: size(), String: length()

        // ------------ dynamic array (ArrayList) -----------
        ArrayList<String> hashtags = new ArrayList<String>();
        hashtags.add("Java");
        hashtags.add("Awesome");
        hashtags.add("Fundamental");

        // loop -- option 1
        for(int i=0; i<hashtags.size(); i++){
            System.out.println(hashtags.get(i));   // arr[i]
        }

        // loop -- option 2
        for(String hashtag : hashtags){
            System.out.println(hashtag);
        }


 

 





    }


}