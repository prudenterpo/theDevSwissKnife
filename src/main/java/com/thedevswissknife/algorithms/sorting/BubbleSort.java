package com.thedevswissknife.algorithms.sorting;

import com.thedevswissknife.algorithms.Algorithm;

public class BubbleSort implements SortingSolver {

    @Override
    public boolean supports(String algorithmName) {
        return Algorithm.BUBBLE_SORT.name().equalsIgnoreCase(algorithmName);
    }

    @Override
    public int[] sort(int[] input) {
        return input;
    }

//    private void bubblesort(int[] arr, int )

}
