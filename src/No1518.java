/**
 * @ClassName No1518
 * @Description TODO
 * @Author Ryan(hwz)
 * @Version 1.0.0
 * @Date 2021/12/17 17:33
 */
public class No1518 {
    public int numWaterBottles(int numBottles, int numExchange) {
        int res = numBottles;
        while (numBottles >= numExchange){
            int extraBottles = numBottles / numExchange;
            numBottles = numBottles - extraBottles*numExchange + extraBottles;
            res += extraBottles;
        }
        return res;
    }
}
