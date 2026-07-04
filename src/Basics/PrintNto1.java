package Basics;

import java.util.Scanner;

public class PrintNto1 {
  public static void main(String[] args) {
    System.out.println("Enter a number: ");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    for (int i = n ;i >=1 ;i--) {
      System.out.println(i);
    }
  }
}
