package leetcode;

/**
 * @ClassName No0423_1
 * @Description 参照评论中的思路进行编程，与 No0243同思路，但代码更优
 * @Author Ryan(hwz)
 * @Version 1.0.0
 * @Date 2021/11/29 14:06
 */
public class No0423_1 {
    public String originalDigits(String s) {
        if (s.length() < 3)
            return "";
        int[] count = new int[10];
        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)){
                case 'z':
                    count[0]++;
                    break;
                case 'o':
                    count[1]++;
                    break;
                case 'w':
                    count[2]++;
                    break;
                case 'h':
                    count[3]++;
                    break;
                case 'u':
                    count[4]++;
                    break;
                case 'f':
                    count[5]++;
                    break;
                case 'x':
                    count[6]++;
                    break;
                case 's':
                    count[7]++;
                    break;
                case 'g':
                    count[8]++;
                    break;
                case 'i':
                    count[9]++;
                    break;
            }
        }
        count[5] -= count[4];
        count[3] -= count[8];
        count[1] -= (count[0] + count[2] + count[4]);
        count[7] -= count[6];
        count[9] -= (count[5] + count[6] + count[8]);
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < count[i]; j++) {
                res.append(i);
            }
        }
        return res.toString();
    }
}
