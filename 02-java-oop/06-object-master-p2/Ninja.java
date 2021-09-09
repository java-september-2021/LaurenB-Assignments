public class Ninja extends Human2 {
    public Ninja() {
        this.stealth = 10;
    }

    public void steal(Human2 target) {
        target.health -= this.stealth;
        this.health += this.stealth;
        System.out.println("Ninja stole health from your opponent! Health is now " + this.health);
    }

    public void runAway() {
        this.health -= 10;
        System.out.println("Ninja lost 10 health for running away");
    }
    

}
