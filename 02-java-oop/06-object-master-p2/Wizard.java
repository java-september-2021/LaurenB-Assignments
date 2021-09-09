public class Wizard extends Human2 {
    public Wizard() {
        this.health = 50;
        this.intelligence = 8;
    }

    public void heal(Human2 target) {
        target.health += this.intelligence;
        System.out.println("Wizard healed target by " + this.intelligence);
    }

    public void fireball(Human2 target) {
        target.health -= (this.intelligence * 3);
        System.out.println("Wizard decreased target's health by " + (this.intelligence *3));
    }
}
