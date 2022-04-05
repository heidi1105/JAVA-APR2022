public class VoiceMessageTest{
    public static void main(String[] args){
        VoiceMessage heidiMachine = new VoiceMessage(); // dependency injection
        System.out.println(heidiMachine.basicGreeting());

        System.out.println(heidiMachine.basicGreeting("Heidi"));
        System.out.println(heidiMachine.basicGreeting(100));
        System.out.println(heidiMachine.basicGreeting("Heidi", 10));

        System.out.println(heidiMachine.getCurrentDate());






    }
}