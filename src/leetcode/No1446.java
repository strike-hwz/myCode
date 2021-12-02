package leetcode;

import jdk.nashorn.internal.ir.IfNode;

import java.util.zip.CRC32;

/**
 * @ClassName No1446
 * @Description TODO
 * @Author Ryan(hwz)
 * @Version 1.0.0
 * @Date 2021/12/1 11:13
 */
public class No1446 {
    public int maxPower(String s) {
        if (s.length() < 2)
            return 1;
        int res = 1;
        char curr = s.charAt(0);
        int count = 1;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == curr)
                count++;
            else {
                curr = s.charAt(i);
                count = 1;
            }
            if (count > res)
                res = count;
        }
        return res;
    }
}
