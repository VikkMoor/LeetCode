package easy;

import java.util.Arrays;

public class CommonPrefix {

    public static void main(String args[]) {
        CommonPrefix letters = new CommonPrefix();
        String[] test = {"flower", "flow", "flight"};
        //System.out.println(Arrays.toString(test)); // showing array in the right way;
        System.out.println('"' + letters.longestCommonPrefix(test) + '"');

    }

    public String longestCommonPrefix(String[] strs) {
        int size = strs.length;
        if (size == 0) return "";
        if (size == 1) return strs[0];


        return;
    }

}
