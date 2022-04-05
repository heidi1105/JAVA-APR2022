import java.util.ArrayList;
public class DeveloperTest{
    public static void main(String[] args){
        Developer random1 = new Developer();
        random1.name="random1";
        random1.hunger = 80;
        random1.hoursOfSleep =100;
        random1.educated= false;
        
        // create a few projects
        Project project1 = new Project();
        project1.title="Cafe Business Logic";
        project1.language = "Java";
        project1.isCompleted= true;

        Project project2 = new Project();
        project2.title="Orders and Items";
        project2.language = "Java";
        project2.isCompleted= false;

        random1.projects = new ArrayList<Project>();
        random1.projects.add(project1);
        random1.projects.add(project2);

        random1.displayStatus();

    }
}