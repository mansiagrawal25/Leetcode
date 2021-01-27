package Medium;

import java.util.Map;
import java.util.TreeMap;

public class RemoveDuplicateLetters {
//    public String removeDuplicateLetters(String s) {
//        Map<Character, Integer> last = new TreeMap<>();
//        for (int i = 0; i < s.length(); i++) {
//            last.put(s.charAt(i), s.length() - i);
//        }
//        return solve(s, last);
//    }
//
//    private String solve(String s, Map<Character, Integer> last) {
//        for (Character c: last.keySet()) {
//            int index = s.indexOf(c);
//            if (last.values().stream().allMatch(x -> x <= s.length() - index)) {
//                last.remove(c);
//                return c + solve(s.substring(index + 1), last);
//            }
//        }
//        return "";
//    }

}
