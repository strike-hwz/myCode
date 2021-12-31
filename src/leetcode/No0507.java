package leetcode;

/**
 * @ClassName No0507
 * @Description 完美数（easy）
 * @Author Ryan(hwz)
 * @Version 1.0.0
 * @Date 2021/12/31 15:38
 */
public class No0507 {
    public boolean checkPerfectNumber(int num) {
        if (num < 2){
            return false;
        }
        int sum = 1, i;
        double numSqrt = Math.sqrt(num);
        for (i = 2; i < numSqrt; i++) {
            if (sum > num){
                return false;
            }
           if (num % i == 0){
               sum += (num / i + i);
           }
        }
        if (i+1 == numSqrt){
            sum += (i+1);
        }
        return sum == num;
    }
}
