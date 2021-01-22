package easy;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if(strs == null || strs.length == 0)    return "";
        String pre = strs[0];

        System.out.println("pre value " + pre);
        System.out.println(("flow").indexOf("flower"));

        int i = 1;
        while(i < strs.length){

            System.out.println("i value "+ i);

            while(strs[i].indexOf(pre) != 0)

                pre = pre.substring(0,pre.length()-1);

            System.out.println("a value 2 " + pre);

            i++;
        }
        return pre;
    }
}
