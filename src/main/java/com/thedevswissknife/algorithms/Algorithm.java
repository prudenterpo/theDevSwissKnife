package com.thedevswissknife.algorithms;

public enum Algorithm {
    // Sorting
    QUICKSORT,
    MERGESORT,
    INSERTION_SORT,
    SELECTION_SORT,
    BUBBLE_SORT,
    HEAP_SORT,
    COUNTING_SORT,
    RADIX_SORT,
    SHELL_SORT,

    // Searching
    BINARY_SEARCH,
    LINEAR_SEARCH,

    // Graph
    BFS,
    DFS,
    DIJKSTRA,
    KRUSKAL,
    PRIM,

    // Recursion / Backtracking
    FACTORIAL,
    FIBONACCI,
    N_QUEENS,
    SUDOKU_SOLVER,

    // Dynamic Programming
    KNAPSACK,
    LONGEST_COMMON_SUBSEQUENCE,
    LONGEST_INCREASING_SUBSEQUENCE,
    COIN_CHANGE,

    // Math
    GCD,
    SIEVE_OF_ERATOSTHENES,
    FAST_EXPONENTIATION,

    // Strings
    KMP,
    RABIN_KARP,
    MANACHER,

    // Others
    UNION_FIND,
    TOPOLOGICAL_SORT;

    public static boolean isSupported(String name) {
        for (Algorithm algo : values()) {
            if (algo.name().equalsIgnoreCase(name)) {
                return true;
            }
        }
        return false;
    }
}
