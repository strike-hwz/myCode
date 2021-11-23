import com.sun.xml.internal.bind.v2.model.core.EnumLeafInfo;
import sun.security.timestamp.TSRequest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @ClassName Test
 * @Description TODO
 * @Author Ryan(hwz)
 * @Version 1.0.0
 * @Date 2021/10/25 16:53
 */
public class Test {
    public static void main(String[] args) {
//        System.out.println("出门一笑无拘束，云在西湖月在天！");
        List<Integer> numList = new ArrayList<Integer>(){
            {
                add(12);
                add(45);
                add(78);
                add(689);
                add(567);
                add(203);
            }
        };
        numList.remove(3);
        System.out.println(numList);
    }
}