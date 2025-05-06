package com.thedevswissknife.algorithms.sorting;

import com.thedevswissknife.algorithms.Algorithm;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Component
public class QuicksortSolver implements SortingSolver {

    @Override
    public boolean supports(String algorithmName) {
        return Algorithm.QUICKSORT.name().equalsIgnoreCase(algorithmName);
    }

    @Override
    public List<Integer> solve(List<Integer> input) {
        List<Integer> copy = new ArrayList<>(input);
        quicksort(copy, 0, copy.size() - 1);

        return copy;
    }

    private void quicksort(List<Integer> arr, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high);
            quicksort(arr, low, pivotIndex - 1);
            quicksort(arr, pivotIndex + 1, high);
        }
    }

    private int partition(List<Integer> arr, int low, int high) {
        int pivot = arr.get(high);
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr.get(j) <= pivot) {
                i++;
                Collections.swap(arr, i, j);
            }
        }
        Collections.swap(arr, i + 1, high);
        return i + 1;
    }
}
