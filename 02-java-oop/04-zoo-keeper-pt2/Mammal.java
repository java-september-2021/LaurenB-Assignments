public class Mammal {
    protected int energyLevel = 100;
    
    public void displayEnergy() {
        System.out.println("Energy level is" + energyLevel);
    }

    public Mammal(int energyLevel) {
        this.energyLevel = energyLevel;
    }
}
