package easy;

public class FirstOccurrence {
    public static void main(String[] args) {
        FirstOccurrence occ = new FirstOccurrence();
        String test1 = "upleetcodelee";
        String test2 = "lee";
        System.out.println(occ.strStr(test1, test2));
    }

    public int strStr(String haystack, String needle) {
        return haystack.indexOf(needle);
    }
}
