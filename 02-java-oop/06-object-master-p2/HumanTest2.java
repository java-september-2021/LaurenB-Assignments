public class HumanTest2 {
    public static void main(String[] args) {
        Ninja n = new Ninja();
        Wizard w = new Wizard();
        Samurai s = new Samurai();
        
        n.runAway();
        n.steal(w);
        w.fireball(n);
        w.heal(s); 
        s.deathBlow(w);
        s.Meditate();
        Samurai.howMany();
        
    }
}
