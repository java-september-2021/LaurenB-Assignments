public class Bat extends Mammal{
    public Bat(int energyLevel) {
        super(energyLevel);
    }

    public void fly() {
        energyLevel -= 50;
        System.out.println("Flap Flap energy decreased by 50!");
    }

    public void eatHumans() {
        energyLevel += 25;
        System.out.println("so-well, never mind, just increase the energy by 25");
    }

    public void attackTown() {
        energyLevel -= 100;
        System.out.println("Crackle Crackle, energy decrease by 100!");
    }
}
