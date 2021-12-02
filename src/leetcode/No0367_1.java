package leetcode;

/**
 * @ClassName No0367_1
 * @Description 参考评论与题解来编程（判断正整数 num是否为完全平方数）
 * @Author Ryan(hwz)
 * @Version 1.0.0
 * @Date 2021/11/30 9:21
 */
public class No0367_1 {
//    //方法一：限定循环范围
//    public boolean isPerfectSquare(int num) {
//        for (int i = 1; i <= num/i; i++) {
//            if (i*i == num)
//                return true;
//        }
//        return false;
//    }

//    //方法二：二分法查找
//    public boolean isPerfectSquare(int num) {
//
//    }

    //方法三：n^2 = 1+3+5+7+9+…+(2n-1)
    public boolean isPerfectSquare(int num) {
        int param = 1;
        while (num > 0){
            num -= param;
            param += 2;
        }
        return num==0;
    }
}