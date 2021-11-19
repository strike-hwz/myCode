package leetcode;

/**
 * @ClassName No006_1
 * @Description 参考题目评论思路进行编程解答
 * @Author Ryan(hwz)
 * @Version 1.0.0
 * @Date 2021/11/1 15:29
 */
public class No0006_1 {
    public String convert(String s, int numRows) {
        int len = s.length();
        if (s.isEmpty() || numRows <= 1 || len <= numRows)
            return s;
        StringBuilder[] strs = new StringBuilder[numRows];
        //列表初始化
        for (int i = 0; i < numRows; i++) {
            strs[i] = new StringBuilder();
        }
        int ans, remain;
        for (int i = 0; i < len; i++) {
            ans = i / (numRows-1);
            remain = i % (numRows-1);
            if (ans % 2 == 0)
                strs[remain].append(s.charAt(i));
            else
                strs[numRows-1-remain].append(s.charAt(i));
        }
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < numRows; i++) {
            res.append(strs[i]);
        }
        return res.toString();
    }
}
