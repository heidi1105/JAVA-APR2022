// OOP --> attributes, methods, 

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


    }


}