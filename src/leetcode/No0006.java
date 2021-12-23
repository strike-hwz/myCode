package leetcode;

/**
 * @ClassName No006
 * @Description  LeetCode第6题，Z字形变换（medium，坑爹问题，还不如写成 N字形变换）
 * @Author Ryan(hwz)
 * @Version 1.0.0
 * @Date 2021/10/29 9:05
 */
public class No0006 {
    public String convert(String s, int numRows) {
        System.out.println("输入字符串：" + s);
        int len = s.length();
        if (len <= numRows || numRows == 1){
            return s;}
        StringBuilder res = new StringBuilder();
        //根据序号规律判断每个char属于哪一行，并逐行拼接
        //从第一行开始挑选char拼接
        for (int i = 0; i < numRows; i++) {
            if (i < numRows-1){
                //把第一列（除了最后一个）加入结果中
                res.append(s.charAt(i));
            }
            for (int j = (2*numRows-2-i); j < len; j += (2*numRows-2)) {
                if (i==0 || i==numRows-1){
                    res.append(s.charAt(j));}
                else {
                    res.append(s.charAt(j));
                    if ((j+2*i)<len){
                        res.append(s.charAt(j+2*i));}
                }
            }
        }
        return res.toString();
    }
}
