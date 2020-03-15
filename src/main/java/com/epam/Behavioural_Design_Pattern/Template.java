package com.epam.Behavioural_Design_Pattern;

 abstract class SortingAlgorithm {
    public void sortingTemplate(int[] data){
        selectionSort(data);
        mergeSort(data);
    }
    public abstract void selectionSort(int[] data);
    public abstract void mergeSort(int[] data);
}

 class AlgorithmType extends SortingAlgorithm {
    @Override
    public void selectionSort(int[] data) {
        System.out.println("Selection sort algorithm Type 1");
    }

    @Override
    public void mergeSort(int[] data) {
        System.out.println("Merge sort algorithm Type 1");
    }

}

 class AlgorithmType2 extends SortingAlgorithm {

    @Override
    public void selectionSort(int[] data) {
        System.out.println("Selection sort algorithm Type 2");
    }

    @Override
    public void mergeSort(int[] data) {
        System.out.println("Merge sort algorithm Type 2");
    }
}

 class Test {

    public static void main(String[] args) {
        int[] data = { 45, 23, 89, 3423, 77, 33, 78, 322 };
        SortingAlgorithm s1 = new AlgorithmType();
        s1.sortingTemplate(data);;
        SortingAlgorithm s2 = new AlgorithmType2();
        s2.sortingTemplate(data);
    }
}
