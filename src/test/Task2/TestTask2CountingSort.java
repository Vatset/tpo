package test.Task2;

import main.Task2.Task2CountingSort;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestTask2CountingSort {

    @Test
    public void testCountSort() {
        int[] arr = {4, 1, 12, 6, 8};
        int[] expectedOutput = {1, 4, 6, 8, 12};

        Task2CountingSort countSort = new Task2CountingSort(arr);
        int[] output = countSort.countSort();
        assertArrayEquals(expectedOutput, output);
    }

    @Test
    public void testCountSortNeg() {
        int[] arr = {-5, -7, -1, 3, 2};
        int[] expectedOutput = {-7, -5, -1, 2, 3};
        Task2CountingSort countSort = new Task2CountingSort(arr);
        int[] output = countSort.countSort();
        assertArrayEquals(expectedOutput, output);
    }

    @Test
    public void testCountSortDuplicated() {
        int[] arr = {8, 6, 4, 2, 2, 4, 6};
        int[] expectedOutput = {2, 2, 4, 4, 6, 6, 8};
        Task2CountingSort countSort = new Task2CountingSort(arr);
        int[] output = countSort.countSort();
        assertArrayEquals(expectedOutput, output);
    }

    @Test
    public void testCountSortEmpty() {
        int[] arr = {};
        int[] expectedOutput = {};
        Task2CountingSort countSort = new Task2CountingSort(arr);
        int[] output = countSort.countSort();
        assertArrayEquals(expectedOutput, output);
    }

    @Test
    public void testCountSortOneNumber() {
        int[] arr = {99};
        int[] expectedOutput = {99};
        Task2CountingSort countSort = new Task2CountingSort(arr);
        int[] output = countSort.countSort();
        assertArrayEquals(expectedOutput, output);
    }

}