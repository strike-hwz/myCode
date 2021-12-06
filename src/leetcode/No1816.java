package leetcode;

/**
 * @ClassName No1816
 * @Description TODO
 * @Author Ryan(hwz)
 * @Version 1.0.0
 * @Date 2021/12/6 15:41
 */
public class No1816 {
    public String truncateSentence(String s, int k) {
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' '){
                k--;
            }
            if (k == 0){
                return s.substring(0, i);
            }
        }
        return s;
    }
}
