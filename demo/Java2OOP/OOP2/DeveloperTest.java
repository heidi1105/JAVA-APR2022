import java.util.ArrayList;
public class DeveloperTest{
    public static void main(String[] args){
        Developer random1 = new Developer();
        Developer heidi = new Developer("Heidi");


        
        // create a few projects
        Project project1 = new Project("Cafe Business Logic", "Java");
        Project project2 = new Project("Orders and Items", "Java");
        random1.addToProjects(project1);
        random1.addToProjects(project2);

        random1.displayStatus();
        heidi.displayStatus();

    }
}