package easy;

import java.util.Arrays;

public class CommonPrefix {

    public static void main(String[] args) {
        CommonPrefix letters = new CommonPrefix();
        String[] test = {"flower","flow","flight"};
        //System.out.println(Arrays.toString(test)); // (showing array in the right way just for cheking);
        System.out.println('"' + letters.longestCommonPrefix(test) + '"');

    }

    public String longestCommonPrefix(String[] strs) {
        int size = strs.length;
        if (size == 0) return ""; // if no words - so no prefix;
        if (size == 1) return strs[0]; // if one word - so the prefix is the whole word;

        /* whaaaaat kind of sort is here??? */
        Arrays.sort(strs);

        /* dunno what's going on here too */
        int end = Math.min(strs[0].length(), strs[size - 1].length());

        /* find the common prefix between the first and last string */
        int i = 0;
        while (i < end && strs[0].charAt(i) == strs[size - 1].charAt(i))
            i++;

        return strs[0].substring(0, i);
    }

}
