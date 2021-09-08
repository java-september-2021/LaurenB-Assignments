public class Mammal2 {
    protected int energyLevel = 100;
    
    public void displayEnergy() {
        System.out.println("Energy level is" + energyLevel);
    }

    public Mammal2(int energyLevel) {
        this.energyLevel = energyLevel;
    }
}
