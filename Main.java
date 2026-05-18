public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome To CS 112!");
        AboutMe();
        Person myPerson = new Person("Jareth", 20);
        AgeInDays(20);
        System.out.println(myPerson);
    }
    
    public static void AboutMe()
    {
        System.out.println("My name is Jareth and I am a student at Miracosta College.");
    }

    public static void AgeInDays(int age)
    {
        System.out.println("Age in days: " + age * 365);
    }
}