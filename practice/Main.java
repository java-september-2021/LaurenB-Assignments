import test.Bird;
import test.Hero;

public class Main {
    public static void main(String[] args) {
        // Bird bird1 = new Bird("red", "small");
        // Bird bird2 = new Bird("blue", "large");
        // System.out.println(bird1);
        // System.out.println(bird2);
        // // System.out.println(tester2);
        // System.out.println(Bird.learnMore());
        System.out.println("Welcome to Zelta.  Make some characters.");

        Hero hero1 = new Hero("Lauren");
        Hero hero2 = new Hero("Brigham", "Gun", 300);
        System.out.println("Hello " + hero1);
        System.out.println("Hello " + hero2);
    }

}
