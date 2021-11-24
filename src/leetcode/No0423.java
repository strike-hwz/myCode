package leetcode;


import java.util.Arrays;

/**
 * @ClassName No423
 * @Description TODO
 * @Author Ryan(hwz)
 * @Version 1.0.0
 * @Date 2021/11/24 15:12
 */
public class No0423 {
    public String originalDigits(String s) {
        if (s.length() < 3)
            return "";
        char[] charS = s.toCharArray();
        char[] symbol = new char[]{'g', 'u', 'w', 'x', 'z', 'f', 'h', 'o', 's', 'i'};
        char[][] words = new char[][]{ {'e','g','h','i','t'},  {'f','o','r','u'}, {'o','t','w'},
                {'i','s','x'}, {'e','o','r','z'}, {'e','f','i','v'}, {'e','e','h','r','t'},
                {'e','n','o'}, {'e','e','n','s','v'},{'e','n','n','i'}};
        int[] nums = new int[]{8, 4, 2, 6, 0, 5, 3, 1, 7, 9};
        Arrays.sort(charS);
        StringBuilder letters = new StringBuilder(String.valueOf(charS));
        StringBuilder res = new StringBuilder();
        int len = letters.length();
        for (int i = 0; i < 5; i++) {
            int index = 0;
            for (int j = index; j < len; j++) {
                if (letters.charAt(j) == symbol[i]){

                }
            }
        }
        for (int i = 5; i < 9; i++) {
            for (int j = 0; j < len; j++) {

            }
        }
        for (int j = 0; j < len; j++) {

        }
        return res.toString();
    }
}
