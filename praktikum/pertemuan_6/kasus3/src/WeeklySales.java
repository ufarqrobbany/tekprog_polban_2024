// ******************************************************************
//  WeeklySales.java
//
//  Sorts the Sales staff in descending order by sales.
// ******************************************************************

import java.util.Scanner;

public class WeeklySales {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.print("How many sales do you want to input? ");
    int MAX_SALES = scan.nextInt();
    scan.nextLine();

    Salesperson[] salesStaff = new Salesperson[MAX_SALES];

    for (int i = 0; i < MAX_SALES; i++) {
      System.out.println("\nSales number " + (i + 1));
      System.out.print("Enter first name: ");
      String first = scan.nextLine();
      System.out.print("Enter last name: ");
      String last = scan.nextLine();
      System.out.print("Enter total sales: ");
      int totalSales = scan.nextInt();
      scan.nextLine();

      salesStaff[i] = new Salesperson(first, last, totalSales);
    }

    scan.close();
    
    Sorting.insertionSort(salesStaff);
    
    System.out.println("\nRanking of Sales for the Week\n");
    for (Salesperson s : salesStaff)
      System.out.println(s);
  }
}