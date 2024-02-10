package io.sfinias.codintinterviewpatterns.twopointers;


/*
Given two strings containing backspaces (identified by the character ‘#’), check if the two strings are equal.

Example 1:

Input: str1="xy#z", str2="xzz#"
Output: true
Explanation: After applying backspaces the strings become "xz" and "xz" respectively.

Example 2:

Input: str1="xy#z", str2="xyz#"
Output: false
Explanation: After applying backspaces the strings become "xz" and "xy" respectively.

Example 3:

Input: str1="xp#", str2="xyz##"
Output: true
Explanation: After applying backspaces the strings become "x" and "x" respectively.
In "xyz##", the first '#' removes the character 'z' and the second '#' removes the character 'y'.

Example 4:

Input: str1="xywrrmp", str2="xywrrmu#p"
Output: true
Explanation: After applying backspaces the strings become "xywrrmp" and "xywrrmp" respectively.
 */

public class BackspaceCompare {

    public static boolean compare(String str1, String str2) {

        int index1 = str1.length() - 1, index2 = str2.length() - 1;
        while (index1 >= 0 || index2 >= 0) {
            int remove1 = 0, remove2 = 0;
            while (str1.charAt(index1) == '#') {
                remove1++;
                index1--;
            }
            while (str2.charAt(index2) == '#') {
                remove2++;
                index2--;
            }
            index1 -= remove1;
            index2 -= remove2;
            if (str1.charAt(index1) != str2.charAt(index2)) return false;
            index1--;
            index2--;
        }
        return index1 == index2;
    }


}
