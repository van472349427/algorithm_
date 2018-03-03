package org.van.searcher;

public class BinarySearcher {

    /**
     * 二分查找
     */

    private static int[] source = {20,191,392,409,410,821,852};

    public static int search(int[] source, int start, int end, int key) {
        int mid = (end - start) / 2 + start;
        if (source[mid] == key) {
            return mid;
        }
        if (start >= end) {
            return -1;
        }
        else if (key > source[mid]) {
            return search(source, mid + 1, end, key);
        }
        else if (key < source[mid]) {
            return search(source, start, mid - 1, key);
        }
        return -1;
    }

    public static void main(String[] args) {
        int index = search(source, 0, source.length - 1, 1);
        System.out.println(index);
    }

}
