import java.util.ArrayList;
public class Developer{
    // attributes -- what it has
    private String name;
    private int hunger;
    private ArrayList<Project> projects;
    private double hoursOfSleep;

    // CONSTRUCTOR
    public Developer(){
        // this.name = "A Random developer";
        // this.hunger = 100;
        // this.hoursOfSleep = 6.5;
    }

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

    // getters & setters
    // setter -- no return type, need parameter
    public void setName(String name){
        this.name = name;
    }

    public void setHunger(int hunger){
        this.hunger = hunger;
    }

    public void setHoursOfSleep(double hoursOfSleep){
        this.hoursOfSleep= hoursOfSleep;
    }

    public void setProjects(ArrayList<Project> projects){
        this.projects = projects;
    }

    // getter -- need return type, no parameter
    public String getName(){
        return this.name;
    }

    public int getHunger(){
        return this.hunger;
    }

    public double getHoursOfSleep(){
        return this.hoursOfSleep;
    }
    public ArrayList<Project> getProjects(){
        return this.projects;
    }

    public void addToProjects(Project project){
        if(this.projects == null){
            this.projects = new ArrayList<Project>();
        }
        this.projects.add(project);
    }
    

}