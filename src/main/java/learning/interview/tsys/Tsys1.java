package learning.interview.tsys;

import static java.lang.System.out;

public class Tsys1 {
    public static void main(String[] args) {
        String[] s = {"eat", "ate"};
        String[] s1 = {"pitch", "itch"};

        isAnagram(s1);
    }

    private static void isAnagram(String[] s) {
        String first = s[0];
        String second = s[1];

//        "ate"
//        "at"
//        "t"
//        ""


        String result = second;
        for (int i = 0; i < first.length(); i++) {
            try {
                result = result.replace(String.valueOf(first.charAt(i)), "");
            } catch (Exception e) {
                break;
            }
        }
        out.println(result);
        if ("".equals(result))
            out.println("anagram");
        else
            out.println("not anagram");
    }
}
