package weekonecars.day3;

import java.util.Scanner;

  public class Day3main {

    public static void fillup(String[] args) {

      System.out.println("What kind of gas would you like: Leaded, Unleaded or Diesel?");
      Scanner lineScanner = new Scanner(System.in);
      String userInput = lineScanner.nextLine();
      System.out.println("Alright! We will fill your car with: " + userInput);
    }

  }