
public class Gorilla extends Mammal2 {
    public Gorilla(int energyLevel) {
        super(energyLevel);
    }

    public void throwSomething() {
        energyLevel -= 5;
        System.out.println("Gorilla has thrown something and lost 5 energy!");

    }

    public void eatBananas() {
        energyLevel += 10;
        System.out.println("Gorilla has eaten a banana and is satisfied! Energy increased by 10!");
    }

    public void climb() {
        energyLevel -= 10;
        System.out.println("Gorilla has climbed a tree and lost 10 energy!");
    }

}
