class Solution {
    public int[] replaceElements(int[] arr) {
        int maxSoFar = -1;
        int temp = 0;

        for (int i = arr.length - 1; i > -1; --i) {
            temp = arr[i];
            arr[i] = maxSoFar;
            if (temp > maxSoFar) {
                maxSoFar = temp;
            }
        }
        return arr;
    }
}