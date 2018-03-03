package org.van.sorter;

public class BubblingSorter {

    /**
     * 在一趟遍历中，不断地对相邻的两个元素进行排序，
     * 小的在前大的在后，这样会造成大值不断沉底的效果，
     * 当一趟遍历完成时，最大的元素会被排在后方正确的位置上。
     * 然后缩小排序范围，即去掉最后方位置正确的元素，
     * 对前方数组进行新一轮遍历，重复第1步骤。
     * 直到范围不能缩小为止，排序完成。
     */

    //稳定
    //时间复杂度O(n)

    private static int[] source = {20,19,39,9,40,8,52};

    public static void sort(int[] source) {
        for (int i = 0; i < source.length - 1; i++) {
            for (int j = 0; j < source.length - 1 - i; j++) {
                if (source[j] > source[j+1]) {
                    int tmp = source[j];
                    source[j] = source[j+1];
                    source[j+1] = tmp;
                }
            }
        }
    }

    public static void main(String[] args) {
        sort(source);
        for (int i : source) {
            System.out.println(i);
        }
    }

}
