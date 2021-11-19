package leetcode;

/**
 * @ClassName No007
 * @Description 整数反转（easy）
 * @Author Ryan(hwz)
 * @Version 1.0.0
 * @Date 2021/10/19 13:54
 */
public class No0007 {
    public int reverse(int x) {
        long temp = x;
        long abs_x = Math.abs(temp);
        StringBuilder str_x = new StringBuilder(Long.toString(abs_x));
        String rev_str_x = str_x.reverse().toString();
        long rev_abs_x = Long.parseLong(rev_str_x);
        if ((int)rev_abs_x != rev_abs_x)
//        if (rev_abs_x >= Math.pow(2,31) || rev_abs_x < Math.pow(2, -31))
            return 0;
        int result  = x>0 ? (int)rev_abs_x : (int) (0-rev_abs_x);
        return result;
    }
}