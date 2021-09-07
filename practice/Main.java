import test.Bird;

public class Main {
    public static void main(String[] args) {
        Bird bird1 = new Bird("red", "small");
        Bird bird2 = new Bird("blue", "large");
        System.out.println(bird1);
        System.out.println(bird2);
        // System.out.println(tester2);
        System.out.println(Bird.learnMore());
    }

}
