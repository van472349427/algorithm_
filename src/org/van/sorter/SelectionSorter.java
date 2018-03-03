package org.van.sorter;

public class SelectionSorter {

    /**
     选择排序比较好理解，一句话概括就是依次按位置挑选出适合此位置的元素来填充。
     暂定第一个元素为最小元素，往后遍历，逐个与最小元素比较，若发现更小者，与先前的"最小元素"交换位置。
     达到更新最小元素的目的。
     一趟遍历完成后，能确保刚刚完成的这一趟遍历中，最的小元素已经放置在前方了。
     然后缩小排序范围，新一趟排序从数组的第二个元素开始。
     在新一轮排序中重复第1、2步骤，直到范围不能缩小为止，排序完成。
     */

    //不稳定
    //时间复杂度O(n2)
    private static int[] source = {20,19,39,9,40,8,52};

    public static void sort(int[] source) {
        for(int i = 0; i < source.length - 1; i++) {
            for (int j = i + 1; j < source.length; j++) {
                if (source[i] > source[j]) {
                    int tmp = source[j];
                    source[j] = source[i];
                    source[i] = tmp;
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
