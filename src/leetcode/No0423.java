package leetcode;


import java.util.*;

/**
 * @ClassName No423
 * @Description 从英文中重建数字（medium）
 * @Author Ryan(hwz)
 * @Version 1.0.0
 * @Date 2021/11/24 15:12
 */
//时间性能不佳，No0423参照评论思路进行调整
public class No0423 {
    public String originalDigits(String s) {
        if (s.length() < 3)
            return "";
        char[] symbol1 = new char[]{'g', 'u', 'w', 'x', 'z'};
        char[] symbol2 = new char[]{'f', 'h', 'o', 's'};
        int[] nums = new int[]{8, 4, 2, 6, 0, 5, 3, 1, 7, 9};
        int[] count1 = new int[5];
        List<Integer> resList = new ArrayList<>();
        for (int i = 0; i < symbol1.length; i++) {
            int count = 0;
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == symbol1[i])
                    count++;

            }
            count1[i] = count;
            for (int j = 0; j < count; j++) {
                resList.add(nums[i]);
            }
        }
        System.out.println(Arrays.toString(count1));
        int countFive = 0;
        for (int i = 0; i < symbol2.length; i++) {
            int count = 0;
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == symbol2[i])
                    count++;
            }
            System.out.print(count + "      ");
            switch (i){
                case 0 :
                    count -= count1[1];
                    countFive = count;
                    break;
                case 1 :
                    count -= count1[0];
                    break;
                case 2 :
                    count -= (count1[1] + count1[2] + count1[4]);
                    break;
                case 3 :
                    count -= count1[3];
                    break;
            }
            System.out.println(count);
            for (int j = 0; j < count; j++) {
                resList.add(nums[5+i]);
            }

        }
        int countNine = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'i')
                countNine++;
        }
        countNine -= (count1[0] + count1[3] + countFive);
        System.out.println(countNine);
        for (int i = 0; i < countNine; i++) {
            resList.add(9);
        }
        Collections.sort(resList);
        StringBuilder res = new StringBuilder();
        for (Integer integer : resList) {
            res.append(integer);
        }
        return res.toString();
    }
}
