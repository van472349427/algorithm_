package org.van.sorter;

public class QuicklySorter {

    /**
     * 在数据中选择一个数，通常是第一个或者最后一个
     * 一次循环过程中，比这个数大的放在后面，比这个数小的放在前面
     * 重复上述过程
     */

    //不稳定
    //时间复杂度O（nlogn）

    private static int[] source = {20,19,39,9,40,8,52};

    private static int getMiddle(int[] source, int low, int high) {
        int tmp = source[low];
        while (low < high) {
            while (low < high && tmp < source[high]) {
                high--;
            }
            source[low] = source[high];// 比中轴小的记录移到低端

            while (low < high && source[low] < tmp) {
                low++;
            }
            source[high] = source[low];
        }
        source[low] = tmp;
        return low;
    }

    public static void sort(int[] source, int low, int high) {
        if (low < high) {
            int mid = getMiddle(source, low, high);
            sort(source, low, mid);
            sort(source, mid + 1, high);
        }
    }

    public static void main(String[] args) {
        sort(source, 0, source.length - 1);
        for (int i : source) {
            System.out.println(i);
        }
    }

}
