package com.thedevswissknife.algorithms.sorting;

import java.util.List;

public interface SortingSolver {
    boolean supports(String algorithmName);
    List<Integer> solve(List<Integer> input);
}
