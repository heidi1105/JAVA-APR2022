import java.util.ArrayList;
public class DeveloperTest{
    public static void main(String[] args){
        System.out.println("Total Developers: "+Developer.getDevCount());
        System.out.println("Total hours of sleep: "+Developer.getTotalHoursOfSleep());

        Developer random1 = new Developer();
        Developer heidi = new Developer("Heidi");
        System.out.println("Total Developers: "+heidi.getDevCount());

        System.out.println("Total Developers: "+Developer.getDevCount());
        System.out.println("Total hours of sleep: "+Developer.getTotalHoursOfSleep());

        
        // create a few projects
        Project project1 = new Project("Cafe Business Logic", "Java");
        Project project2 = new Project("Orders and Items", "Java");
        random1.addToProjects(project1);
        random1.addToProjects(project2);

        random1.displayStatus();
        heidi.displayStatus();

    }
}