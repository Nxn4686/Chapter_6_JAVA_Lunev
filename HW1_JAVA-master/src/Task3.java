public class Task3 {
    //https://leetcode.com/problems/merge-sorted-array/submissions/858178461/
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int m1 = m - 1, n1 = n - 1, copy = n + m - 1;

        while (n1 >= 0) {
            if (m1 >= 0 && nums1[m1] > nums2[n1]) {
                nums1[copy] = nums1[m1];
                copy--;
                m1--;
            } else {
                nums1[copy] = nums2[n1];
                copy--;
                n1--;
            }
        }


    }
}
