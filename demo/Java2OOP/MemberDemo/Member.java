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

    public static int getMemberCount(){
        return memberCount;
    }

    public static int getTotalPoints(){
        return totalPoints;
    }

    // customized methods
    public void earnPoints(int earnedPoints){
        this.points += earnedPoints;
        totalPoints += earnedPoints;
    }

    public void redeemPoints(int redeemedPoints){
        if(this.points < redeemedPoints){
            System.out.println("You do not have enough points");
        }else{
            this.points -= redeemedPoints;
            totalPoints -= redeemedPoints;
        }
    }



}