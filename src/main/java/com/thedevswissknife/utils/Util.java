package com.thedevswissknife.utils;

public class Util {

    public static void swap(int[] arr, int idxA, int indxB) {
        int aux = arr[idxA];
        arr[idxA] = arr[indxB];
        arr[indxB] = aux;
    }
}
