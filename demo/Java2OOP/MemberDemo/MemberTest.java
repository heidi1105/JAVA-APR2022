public class MemberTest{
    public static void main(String[] args){
       System.out.println("Total Members: " + Member.getMemberCount());
        Member m1 = new Member();
        Member m2 = new Member();
        Member m3 = new Member();

        m1.earnPoints(1000);
        m2.earnPoints(2000);
        System.out.println("m1 Points: " + m1.getPoints());
        System.out.println("m2 Points: " + m2.getPoints());
        m1.redeemPoints(500);
        m2.redeemPoints(1300);
        m2.redeemPoints(1300);
        System.out.println("m1 Points: " + m1.getPoints());
        System.out.println("m2 Points: " + m2.getPoints());


        System.out.println("Total Members: " + Member.getMemberCount());
        System.out.println("Total Points: " + Member.getTotalPoints());

    }
}