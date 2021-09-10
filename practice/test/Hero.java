package test;

public class Hero {
    // Attributes
    private String name;
    private int hp = 200;
    private String weapon = "sword";

    // constructors
    public Hero(String name) {
        this.name = name;
    }

    public Hero(String n, String w) {
        name = n;
        weapon = w;
    }

    public Hero(String n, String w, int h) {
        name = n;
        weapon = w;
        hp = h;
    }

    // private String grabTitle() {
    //     return name + " the " + weapon + "sman";
    // }

    // Getters
    public String getName() {
        return name;
    }

    public String toString(){
        return name + " (weapon: " + weapon + ", Hp: " + hp + ")";
    }
}
