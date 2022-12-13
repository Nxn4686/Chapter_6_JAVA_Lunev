public class Task4 {
    //https://leetcode.com/problems/reverse-words-in-a-string/description/

    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        int end = s.length() - 1; // определиня конца строки
        while (end >= 0) {
            if (s.charAt(end) == ' ') {
                end -= 1;
                continue;
            }

            int start = end - 1; // точка старта начинается в конце

            while (start >= 0 && s.charAt(start) != ' ') {
                start -= 1;
            }
            sb.append(" ");
            sb.append(s.substring(start + 1, end + 1));
            end = start - 1;
        }
        if (sb.length()>0)  {
            sb.deleteCharAt(0);
        }
        return  sb.toString();
    }
}
