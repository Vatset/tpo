package Task2;

public class Task2CountingSort {
    private int[] array;

    public Task2CountingSort(int[] values) {
        array = values.clone();
    }

    public int[] countSort() {
        if (array.length == 0) {
            return new int[0];
        }
        int min = array[0];
        int max = array[0];
        for (int value : array) {
            if (value > max) max = value;
            if (value < min) min = value;
        }
        // for negative
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] - min;
        }
        int[] countArray = new int[max - min + 1];
        for (int num : array) {
            countArray[num]++;
        }
        for (int i = 1; i < countArray.length; i++) {
            countArray[i] += countArray[i - 1];
        }
        int[] sortedArray = new int[array.length];
        for (int i = array.length - 1; i >= 0; i--) {
            int num = array[i];
            int index = countArray[num] - 1;
            sortedArray[index] = num;
            countArray[num]--;
        }
        // for neg shift back
        for (int i = 0; i < sortedArray.length; i++) {
            sortedArray[i] += min;
        }
        System.arraycopy(sortedArray, 0, array, 0, array.length);
        return array;
    }
}

