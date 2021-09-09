public class Samurai extends Human2 {
    static int numOfSamurai;

    public Samurai() {
        this.health = 200;
        numOfSamurai++;
    }

    public void deathBlow(Human2 target) {
        target.health = 0;
        this.health = (this.health / 2);
        System.out.println("Target's health is zero and Samurai's health increased by " + (this.health/2));
    }

    public void Meditate() {
        this.health += (this.health / 2);
        System.out.println("Samurai's health increased by " + (this.health / 2));
    }

    public static void howMany() {
        System.out.println(numOfSamurai);
    }
}
