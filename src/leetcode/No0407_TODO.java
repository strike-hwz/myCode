package leetcode;

/**
 * @ClassName No407
 * @Description 接雨水（hard）
 * @Author Ryan(hwz)
 * @Version 1.0.0
 * @Date 2021/11/3 8:43
 */

//TODO 没写出来，需要接着搞
public class No0407_TODO {
    public int trapRainWater(int[][] heightMap) {
        if (heightMap.length <= 2 || heightMap[0].length <= 2)
            return 0;
        int allCapacity = 0;
        int rows = heightMap.length;
        int columns = heightMap[0].length;
        int[][] capacityMap = new int[rows][columns];
        for (int i = 1; i < rows-1; i++) {
            for (int j = 1; j < columns-1; j++) {
                int height = heightMap[i][j];
                int temp1 = Math.min(capacityMap[i-1][j] + heightMap[i-1][j] - height, capacityMap[i+1][j] + heightMap[i+1][j] - height);
                int temp2 = Math.min(heightMap[i][j-1] - height + capacityMap[i][j-1], heightMap[i][j+1] - height + capacityMap[i][j+1]);
                capacityMap[i][j] = Math.min(temp1, temp2);
                if (capacityMap[i][j] < 0)
                    capacityMap[i][j] = 0;
                allCapacity += capacityMap[i][j];
                System.out.println("每次计算allCapacity：" + allCapacity);
            }
        }
        return allCapacity;
    }
}
