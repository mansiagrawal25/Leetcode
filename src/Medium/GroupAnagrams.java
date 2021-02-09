package Medium;

import java.util.*;



public class GroupAnagrams {

    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> list= new ArrayList<>();
        Map<String,List<String>> map=new HashMap<>();
        for(String s : strs){
            char [] ch= s.toCharArray();
            Arrays.sort(ch);
            String sorted= new String(ch);
            if(!map.containsKey(sorted)){
                map.put(sorted,new ArrayList<>());
            }
            map.get(sorted).add(s);
        }
        list.addAll(map.values());
        return list;
    }
    public static void main(String[] args) {
      String[]  strs = {"eat","tea","tan","ate","nat","bat"};
      GroupAnagrams ga= new GroupAnagrams();
        System.out.println(ga.groupAnagrams(strs));

    }
}
