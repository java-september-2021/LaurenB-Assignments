public class Human {
    // Attributes
    protected int strength = 3;
    protected int stealth = 3;
    protected int intelligence = 3;
    protected int health = 100;

    // Methods
    public void attack(Human target) {
        target.health -= this.strength;
        System.out.println("Health is now " + health);
    }
}
