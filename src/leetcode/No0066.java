package leetcode;

/**
 * @ClassName No0066
 * @Description LeetCode第66题：加一（easy）
 * @Author Ryan(hwz)
 * @Version 1.0.0
 * @Date 2021/12/10 14:28
 */
public class No0066 {
    public int[] plusOne(int[] digits) {
        int len = digits.length;
        int carry = 0;//进位
        if (digits[len-1]+1 < 10){
            digits[len-1] += 1;
        }else {
            digits[len-1] = digits[len-1] + 1 - 10;
            carry = 1;
            for (int i = len-2; i >= 0; i--) {
                if (digits[i] + carry < 10){
                    digits[i] += carry;
                    carry = 0;
                    break;
                }else {
                    digits[i] = digits[i] + carry - 10;
                }
            }
            if (carry == 1){
                int[] res = new int[len+1];
                res[0] = carry;
                System.arraycopy(digits, 0, res, 1, len);
                return res;
            }
        }
        return digits;
    }
}
