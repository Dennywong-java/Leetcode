import java.util.HashMap;
import java.util.Map;

public class LC242ValidAnagram {
    public static void main(String[] args) {
        System.out.println(isAnagram("anagram","nagaram"));
    }

    public static boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        Map<Character, Integer> map = new HashMap<>();
        for(char ch: s.toCharArray()){
            map.put(ch, map.getOrDefault(ch,0) + 1);
        }
        for(char ch: t.toCharArray()){
            map.put(ch, map.getOrDefault(ch,0) - 1);
            if(map.get(ch) < 0) return false;
        }
        return true;
    }
}
