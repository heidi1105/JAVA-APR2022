import java.util.ArrayList;
public class Developer{
    // attributes -- what it has
    public String name;
    public int hunger;
    public ArrayList<Project> projects;
    public double hoursOfSleep;
    public boolean educated;


    // methods -- what it does
    public void displayStatus(){
        System.out.println("Name: "+ this.name);
        System.out.println("Hunger: "+ this.hunger);
        System.out.println("Hours of sleep: "+ this.hoursOfSleep);
        System.out.println("Educated: "+ this.educated);
        for(Project project : this.projects){
            System.out.println(project.title + " ( " + project.language + " ) ");   
        }

    }

    

}