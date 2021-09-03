import java.util.HashMap;
import java.util.Set;
public class SongMap {
    public static void main(String[] args) {
    HashMap<String, String> songMap = new HashMap<String, String>();
    songMap.put("Safe and Sound", "I remember tears streaming down your face...");
    songMap.put("One Call Away", "I'm only one call away....");
    songMap.put("If I Die Young", "If I die young bury me in satin.....");
    songMap.put("Butter", "Smooth like butter, crimal undercover....");
    
    Set<String> keys = songMap.keySet();
    for (String key: keys) {
        System.out.println(key);
        System.out.println(songMap.get(key));
        System.out.println(String.format("Track: %s Lyrics: %s", key, songMap.get(key)));
        }
    } 


}
