public class Main {
    //https://leetcode.com/problems/merge-strings-alternately/
    public static void main(String[] args) {

        System.out.println("Hello world!");
    }

    public String mergeAlternately(String word1, String word2) {
        StringBuilder merge = new StringBuilder("");
        int i = 0;
        while (i < word1.length() || i < word2.length()) {
            try {
                merge.append(word1.charAt(i));
            } catch (Exception e) {
            }
            try {
                merge.append(word2.charAt(i));
            } catch (Exception e) {
            }
            i++;
        }
        return merge.toString();

        
    }


}