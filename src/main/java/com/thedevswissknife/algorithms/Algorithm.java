package com.thedevswissknife.algorithms;

public enum Algorithm {
    QUICKSORT,
    MERGESORT,
    INSERTION_SORT,
    SELECTION_SORT,
    BUBBLE_SORT,
    HEAP_SORT,
    COUNTING_SORT,
    RADIX_SORT,
    SHELL_SORT,

    BINARY_SEARCH,
    LINEAR_SEARCH,

    BFS,
    DFS,
    DIJKSTRA,
    KRUSKAL,
    PRIM,

    FACTORIAL,
    FIBONACCI,
    N_QUEENS,
    SUDOKU_SOLVER,

    KNAPSACK,
    LONGEST_COMMON_SUBSEQUENCE,
    LONGEST_INCREASING_SUBSEQUENCE,
    COIN_CHANGE,

    GCD,
    SIEVE_OF_ERATOSTHENES,
    FAST_EXPONENTIATION,

    KMP,
    RABIN_KARP,
    MANACHER,

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
