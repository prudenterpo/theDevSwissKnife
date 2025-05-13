package com.thedevswissknife.algorithms.sorting;

import com.thedevswissknife.algorithms.Algorithm;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class Mergesort implements SortingSolver {

    @Override
    public boolean supports(String algorithmName) {
        return Algorithm.MERGESORT.name().equalsIgnoreCase(algorithmName);
    }

    @Override
    public List<Integer> sort(List<Integer> input) {
        List<Integer> copy = new ArrayList<>(input);
        mergesort(copy, 0, copy.size() - 1);
        return copy;
    }

    private void mergesort(List<Integer> arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergesort(arr, left, mid);
            mergesort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }

    private void merge(List<Integer> arr, int left, int mid, int right) {
        List<Integer> leftPart = new ArrayList<>(arr.subList(left, mid + 1));
        List<Integer> rightPart = new ArrayList<>(arr.subList(mid + 1, right + 1));

        int i = 0, j = 0, k = left;

        while (i < leftPart.size() && j < rightPart.size()) {
            if (leftPart.get(i) <= rightPart.get(j)) {
                arr.set(k++, leftPart.get(i++));
            } else {
                arr.set(k++, rightPart.get(j++));
            }
        }

        while (i < leftPart.size()) {
            arr.set(k++, leftPart.get(i++));
        }

        while (j < rightPart.size()) {
            arr.set(k++, rightPart.get(j++));
        }
    }
}
