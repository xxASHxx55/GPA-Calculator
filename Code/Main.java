/*Author: xxASHxx55
* Date: 03/29/23
* Class: Comp Sci
* Purpose: Calculate high school GPA
*/

import java.io.*;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    int numClasses = 0;
    String[] gradeArray = {"A+", "A", "A-", "B+", "B", "B-", "C+", "C", "C-", "D+", "D", "D-", "F", "NULL"};
    
    ClearScreen.clear(); //clears screen and resets the cursor position to the top of the screen

    //Inital prompt
    System.out.println("--GPA CALCULATOR--");
    System.out.println("Enter in the letter grade for each class. If you are not taking the class type \"null\".");
    
    //ENGLISH
    
    //english scanner
    System.out.print("English: ");
    Scanner englishIn = new Scanner(System.in);
    String englishGrade = englishIn.nextLine();
    englishGrade = englishGrade.toUpperCase();

    //check if user input for english is acceptable
    boolean testEnglish = false;
    for (String i : gradeArray) {
      if (i.equals(englishGrade)) {
        testEnglish = true;
        break;
      }
    }
    
    if (testEnglish == false) {
      System.out.println("Sorry that isn't one of the options.");
      try{
        Thread.sleep(2500);
      }
      catch(Exception e){}
      ClearScreen.clear();
      Main MainObjectEnglish = new Main();
      MainObjectEnglish.main(args);
    }

    //run english class
    English english = new English();
    english.english(englishGrade);

    //add 1 to the number of classes
    if(englishGrade != "null"){
      numClasses++;
    }

    //
  }
}