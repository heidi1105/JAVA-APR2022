import java.util.ArrayList;
public class DeveloperTest{
    public static void main(String[] args){
        Developer random1 = new Developer();
        random1.setName("random1");
        random1.setHunger(80);
        random1.setHoursOfSleep(6.5);

        
        // create a few projects
        Project project1 = new Project();
        project1.title="Cafe Business Logic";
        project1.language = "Java";
        project1.isCompleted= true;

        Project project2 = new Project();
        project2.title="Orders and Items";
        project2.language = "Java";
        project2.isCompleted= false;

        ArrayList<Project> tempProjects = new ArrayList<>();
        tempProjects.add(project1);
        tempProjects.add(project2);

        random1.setProjects(tempProjects);
        random1.addToProjects(project2);

        random1.displayStatus();

    }
}