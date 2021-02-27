package easy;

public class MergeStringsAlternatly {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < word1.length() || i < word2.length(); i++) {
            if (i < word1.length()) {
                answer.append(word1.charAt(i));
            }
            if (i < word2.length()) {
                answer.append(word1.charAt(i));
            }

        }
        return answer.toString();

    }
    public void main(String[] args){

    }
}
