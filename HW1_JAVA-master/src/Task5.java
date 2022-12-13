public class Task5 {
    //https://leetcode.com/problems/valid-palindrome/submissions/858249188/
    public boolean isPalindrome(String s) {
            // задаем два курсор l=идет слева r= идет справа
        for (int l = 0, r = s.length() - 1; l < r; l++, r--){
            while (l<r && !Character.isLetterOrDigit(s.charAt(l))){
                l++;
            }
            while (l<r && !Character.isLetterOrDigit(s.charAt(r))){
                r--;
            }
            if (Character.toLowerCase(s.charAt(l)) != Character.toLowerCase(s.charAt(r))){
                return false;
            }

        }
        return true;


    }
}
