package leetcode;

/**
 * @ClassName No007_1
 * @Description 参考精选题解思路进行编程解答
 * @Author Ryan(hwz)
 * @Version 1.0.0
 * @Date 2021/10/28 15:04
 */
public class No0007_1 {
    public int reverse(int x) {
        long res = 0;
        while (x != 0){
            int tmp = x % 10;
            res = res*10 + tmp;
            x /= 10;
        }
        if (res > Integer.MAX_VALUE || res < Integer.MIN_VALUE)
            return 0;
        return (int)res;
    }
}