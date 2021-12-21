package leetcode;

/**
 * @ClassName No1154
 * @Description 一年中的第几天（easy）
 * @Author Ryan(hwz)
 * @Version 1.0.0
 * @Date 2021/12/21 15:30
 */
public class No1154 {
    public int dayOfYear(String date) {
        int[] months = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int currYear = Integer.parseInt(date.substring(0, 4));
        int currMonth = Integer.parseInt(date.substring(5, 7));
        int currDay = Integer.parseInt(date.substring(8));
        int res = 0;
        for (int i = 0; i < currMonth-1; i++) {
            res += months[i];
        }
        res += currDay;
        if (currMonth < 3) {
            return res;
        }
        //当月份大于2时，判断是否为闰年
        if (currYear % 100 == 0){
            if (currYear % 400 == 0){
                res += 1;
            }
        }else{
            if (currYear % 4 == 0){
                res += 1;
            }
        }
        return res;
    }
}
