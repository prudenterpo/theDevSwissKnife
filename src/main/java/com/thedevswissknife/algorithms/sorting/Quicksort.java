package com.thedevswissknife.algorithms.sorting;

import com.thedevswissknife.algorithms.Algorithm;
import com.thedevswissknife.utils.Util;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static com.thedevswissknife.utils.Util.swap;

@Component
public class Quicksort implements SortingSolver {

    @Override
    public boolean supports(String algorithmName) {
        return Algorithm.QUICKSORT.name().equalsIgnoreCase(algorithmName);
    }

    @Override
    public int[] sort(int[] input) {
        int[] copy = input.clone();
        quicksort(copy, 0, copy.length - 1);
        return copy;
    }

    private void quicksort(int[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high);
            quicksort(arr, low, pivotIndex - 1);
            quicksort(arr, pivotIndex + 1, high);
        }
    }

    private int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return i + 1;
    }
}
