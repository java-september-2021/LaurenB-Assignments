public class HumanTest2 {
    public static void main(String[] args) {
        Ninja n = new Ninja();
        Wizard w = new Wizard();
        Samurai s = new Samurai();

        n.runAway();
        n.steal(n);
        w.fireball(w);
        w.heal(w); 
        s.deathBlow(s);
        s.Meditate();
        Samurai.howMany();
        
    }
}
