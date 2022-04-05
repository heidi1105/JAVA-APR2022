import java.util.ArrayList;
public class Developer{
    // attributes -- what it has
    private String name;
    private int hunger;
    private ArrayList<Project> projects;
    private double hoursOfSleep;
    // static variables (variables without instantiating any class)
    private static int devCount = 0;
    private static double totalHoursOfSleep = 0;

    // CONSTRUCTOR
    public Developer(){
        this.name = "A Random developer";
        this.hunger = 100;
        this.hoursOfSleep = 6.5;
        this.projects = new ArrayList<Project>();
        devCount++;
        totalHoursOfSleep += this.hoursOfSleep;
    }

    public Developer(String name){
        this.name = name;
        this.hunger = 30;
        this.hoursOfSleep = 7;
        this.projects = new ArrayList<Project>();
        devCount++;
        totalHoursOfSleep += this.hoursOfSleep;
    }

    // methods -- what it does
    public void displayStatus(){
        System.out.println("Name: "+ this.name);
        System.out.println("Hunger: "+ this.hunger);
        System.out.println("Hours of sleep: "+ this.hoursOfSleep);
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
        this.projects.add(project);
    }
     
    public static int getDevCount(){
        return devCount;
    }

    public static double getTotalHoursOfSleep(){
        return totalHoursOfSleep;
    }

    public static void setDevCount(int newDevCount){
        devCount = newDevCount;
    }

    public static void setTotalHoursOfSleep(double newTotal){
        totalHoursOfSleep= newTotal;
    }



}