public class Member{
    // attributes
    private int points; // Integer points --> null | int --> 0 
    private static int memberCount; // belongs to the class
    private static int totalPoints; // belongs to the class

    // constructors
    public Member(){
        memberCount++; // no "this" for static variables
    }

    // getters & setters
    public int getPoints(){
        return this.points;
    }

}