// ******************************************************************
//  Sorting.java      Author: Lewis/Loftus
//
//  Demonstrates the selection sort and insertion sort algorithms.
// ******************************************************************

public class Sorting {
  // ----------------------------------------------------------------
  // Sort the specified array of objects using the selection
  // sort algorithm.
  // ----------------------------------------------------------------
  public static void selectionSort(Comparable[] list) {
    int min;
    Comparable temp;

    for (int index = 0; index < list.length - 1; index++) {
      min = index;
      for (int scan = index + 1; scan < list.length; scan++)
        if (list[scan].compareTo(list[min]) < 0)
          min = scan;

      // swap the value
      temp = list[min];
      list[min] = list[index];
      list[index] = temp;
    }
  }

  // ----------------------------------------------------------------
  // Sort the specified array of objects using the insertion
  // sort algorithm.
  // ----------------------------------------------------------------
  public static void insertionSort(Comparable[] list) {
    // Change index = 1 to index = 0
    for (int index = 0; index < list.length; index++) {
      Comparable key = list[index];
      int position = index;

      // Shift larger values to the right
      // Change '<' to '>' for Descending
      while (position > 0 && key.compareTo(list[position - 1]) > 0) {
        list[position] = list[position - 1];
        position--;
      }
      list[position] = key;
    }
  }
}
