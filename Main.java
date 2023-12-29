/* Author: Ash Foster
* Date: 04/04/23
* Purpose: calculate high school GPA for current year and total high school GPA
* Version: GPA Calculator
* Programming Language: Java
*/

import java.io.*;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    int numClasses = 0;
    String[] gradeArray = {"A+", "A", "A-", "B+", "B", "B-", "C+", "C", "C-", "D+", "D", "D-", "F", "NULL"};

    ClearScreen.clear(); //clears screen and resets the cursor position to the top of the screen

    //initial prompt
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

    //english GPA object
    GPA englishGPAobj = new GPA();
    double englishGPA = englishGPAobj.gpa(englishGrade);

    //add 1 to the number of classes
    if(englishGrade.equals("NULL") == false){
      numClasses++;
    }

    //MATH
    //math scanner
    System.out.print("Math: ");
    Scanner mathIn = new Scanner(System.in);
    String mathGrade = mathIn.nextLine();
    mathGrade = mathGrade.toUpperCase();

    //check if user input for english is acceptable
    boolean testMath = false;
    for (String i : gradeArray) {
      if (i.equals(mathGrade)) {
        testMath = true;
        break;
      }
    }

    if (testMath == false) {
      System.out.println("Sorry that isn't one of the options.");
      try{
        Thread.sleep(2500);
      }
      catch(Exception e){}
      ClearScreen.clear();
      Main MainObjectEnglish = new Main();
      MainObjectEnglish.main(args);
    }

    //math object
    GPA mathGPAobj = new GPA();
    double mathGPA = mathGPAobj.gpa(mathGrade);

    //add 1 to the number of classes
    if(mathGrade.equals("NULL") == false){
      numClasses++;
    }

    //LANGUAGE
    //language scanner
    System.out.print("Foreign Language: ");
    Scanner languageIn = new Scanner(System.in);
    String languageGrade = languageIn.nextLine();
    languageGrade = languageGrade.toUpperCase();

    //check if user input for language is acceptable
    boolean testLanguage = false;
    for (String i : gradeArray) {
      if (i.equals(languageGrade)) {
        testLanguage = true;
        break;
      }
    }

    if (testLanguage == false) {
      System.out.println("Sorry that isn't one of the options.");
      try{
        Thread.sleep(2500);
      }
      catch(Exception e){}
      ClearScreen.clear();
      Main MainObjectEnglish = new Main();
      MainObjectEnglish.main(args);
    }

    //language object
    GPA languageGPAobj = new GPA();
    double languageGPA = languageGPAobj.gpa(languageGrade);

    //add 1 to the number of classes
    if(languageGrade.equals("NULL") == false){
      numClasses++;
    }

    //HEALTH
    //health scanner
    System.out.print("Health: ");
    Scanner healthIn = new Scanner(System.in);
    String healthGrade = healthIn.nextLine();
    healthGrade = healthGrade.toUpperCase();

    //check if user input for health is acceptable
    boolean testHealth = false;
    for (String i : gradeArray) {
      if (i.equals(healthGrade)) {
        testHealth = true;
        break;
      }
    }

    if (testHealth == false) {
      System.out.println("Sorry that isn't one of the options.");
      try{
        Thread.sleep(2500);
      }
      catch(Exception e){}
      ClearScreen.clear();
      Main MainObjectEnglish = new Main();
      MainObjectEnglish.main(args);
    }

    //health object
    GPA healthGPAobj = new GPA();
    double healthGPA = healthGPAobj.gpa(healthGrade);

    //add 1 to the number of classes
    if(healthGrade.equals("NULL") == false){
      numClasses++;
    }

    //SOCIAL STUDIES
    //history scanner
    System.out.print("Social Studies: ");
    Scanner historyIn = new Scanner(System.in);
    String historyGrade = historyIn.nextLine();
    historyGrade = historyGrade.toUpperCase();

    //check if user input for social studies is acceptable
    boolean testHistory = false;
    for (String i : gradeArray) {
      if (i.equals(historyGrade)) {
        testHistory = true;
        break;
      }
    }

    if (testHistory == false) {
      System.out.println("Sorry that isn't one of the options.");
      try{
        Thread.sleep(2500);
      }
      catch(Exception e){}
      ClearScreen.clear();
      Main MainObjectEnglish = new Main();
      MainObjectEnglish.main(args);
    }

    //social studies object
    GPA historyGPAobj = new GPA();
    double historyGPA = historyGPAobj.gpa(historyGrade);

    //add 1 to the number of classes
    if(historyGrade.equals("NULL") == false){
      numClasses++;
    }

    //ART
    //art scanner
    System.out.print("Art: ");
    Scanner artIn = new Scanner(System.in);
    String artGrade = artIn.nextLine();
    artGrade = artGrade.toUpperCase();

    //check if user input for art is acceptable
    boolean testArt = false;
    for (String i : gradeArray) {
      if (i.equals(artGrade)) {
        testArt = true;
        break;
      }
    }

    if (testArt == false) {
      System.out.println("Sorry that isn't one of the options.");
      try{
        Thread.sleep(2500);
      }
      catch(Exception e){}
      ClearScreen.clear();
      Main MainObjectEnglish = new Main();
      MainObjectEnglish.main(args);
    }

    //art object
    GPA artGPAobj = new GPA();
    double artGPA = artGPAobj.gpa(artGrade);

    //add 1 to the number of classes
    if(artGrade.equals("NULL") == false){
      numClasses++;
    }

    //SCIENCE
    //science scanner
    System.out.print("Science: ");
    Scanner scienceIn = new Scanner(System.in);
    String scienceGrade = scienceIn.nextLine();
    scienceGrade = scienceGrade.toUpperCase();

    //check if user input for science is acceptable
    boolean testScience = false;
    for (String i : gradeArray) {
      if (i.equals(scienceGrade)) {
        testScience = true;
        break;
      }
    }

    if (testScience == false) {
      System.out.println("Sorry that isn't one of the options.");
      try{
        Thread.sleep(2500);
      }
      catch(Exception e){}
      ClearScreen.clear();
      Main MainObjectEnglish = new Main();
      MainObjectEnglish.main(args);
    }
    //science object
    GPA scienceGPAobj = new GPA();
    double scienceGPA = scienceGPAobj.gpa(scienceGrade);

    if (scienceGrade.equals("NULL") == false) {
      numClasses++;
    }
    //calculate GPA
    double totalGPA = ((englishGPA + mathGPA + languageGPA + healthGPA + historyGPA + artGPA + scienceGPA) / numClasses);

    double totalGPArounded = Math.round(totalGPA * 100) / 100.0;

        //print GPA
        System.out.println();
        System.out.println("Your total GPA for this year is " + totalGPArounded);

    //ask if user wants to calculate full highschool GPA
    System.out.println();
    System.out.println("Would you like to calculate your full highschool GPA?");
    //yes/no scanner
    Scanner yesNoIn = new Scanner(System.in);
    String yesNoAns = yesNoIn.nextLine();
    yesNoAns = yesNoAns.toUpperCase();

    //check if user input for yes/no is acceptable
    String[] yesNoArray = {"YES", "NO"};
    boolean testYesNo = false;
    for (String i : yesNoArray) {
      if (i.equals(yesNoAns)) {
        testYesNo = true;
        break;
      }
    }

    if (testYesNo == false) {
      System.out.println("Sorry that isn't one of the options.");
      try{
        Thread.sleep(2500);
      }
      catch(Exception e){}
      ClearScreen.clear();
      Main MainObjectEnglish = new Main();
      MainObjectEnglish.main(args);
    }

    //if user wants to calculate full highschool GPA
    int[] yearArray = {9, 10, 11, 12};
    if (yesNoAns.equals("YES")) {
      System.out.println();
      System.out.println("What grade are you in? ie. 9, 10, 11, 12");

      //grade scanner
      Scanner gradeIn = new Scanner(System.in);
      int grade = gradeIn.nextInt();

      //check if user input for grade is acceptable
      boolean testGrade = false;
      for (int i : yearArray) {
        if (i == grade) {
          testGrade = true;
          break;
        }
      }

      if (testGrade == false) {
        System.out.println("Sorry that isn't one of the options.");
        try{
          Thread.sleep(2500);
        }
        catch(Exception e){}
        ClearScreen.clear();
        Main MainObjectEnglish = new Main();
        MainObjectEnglish.main(args);
      }

      if (grade == 9) {
        System.out.println();
        System.out.println("Your highschool GPA is " + totalGPArounded + "!");
      }

      else if (grade == 10) {
        System.out.println();
        System.out.println("What was your 9th grade GPA?");
        //9th grade GPA scanner
        Scanner nineGPAIn = new Scanner(System.in);
        double nineGPA = nineGPAIn.nextDouble();
        //calculate 10th grade GPA
        double nineGPArounded = Math.round(nineGPA * 100) / 100.0;
        double highschoolGPA = ((totalGPArounded + nineGPArounded) / 2);
        double highschoolGPArounded = Math.round(highschoolGPA * 100) / 100.0;
        System.out.println();
        System.out.println("Your highschool GPA is " + highschoolGPArounded + "!");
      }

      else if (grade == 11) {
        System.out.println();
        System.out.println("What was your 9th grade GPA?");
        //9th grade GPA scanner
        Scanner nineGPAIn = new Scanner(System.in);
        double nineGPA = nineGPAIn.nextDouble();
        System.out.println();
        System.out.println("What was your 10th grade GPA?");
        //10th grade GPA scanner
        Scanner tenGPAIn = new Scanner(System.in);
        double tenGPA = tenGPAIn.nextDouble();
        //calculate 11th grade GPA
        double nineGPArounded = Math.round(nineGPA * 100) / 100.0;
        double tenGPArounded = Math.round(tenGPA * 100) / 100.0;
        double highschoolGPA = ((totalGPArounded + nineGPArounded + tenGPArounded) / 3);
        double highschoolGPArounded = Math.round(highschoolGPA * 100) / 100.0;
        System.out.println();
        System.out.println("Your highschool GPA is " + highschoolGPArounded + "!");
      }

      else if (grade == 12) {
        System.out.println();
        System.out.println("What was your 9th grade GPA?");
        //9th grade GPA scanner
        Scanner nineGPAIn = new Scanner(System.in);
        double nineGPA = nineGPAIn.nextDouble();
        System.out.println();
        System.out.println("What was your 10th grade GPA?");
        //10th grade GPA scanner
        Scanner tenGPAIn = new Scanner(System.in);
        double tenGPA = tenGPAIn.nextDouble();
        System.out.println();
        System.out.println("What was your 11th grade GPA?");
        //11th grade GPA scanner
        Scanner elevenGPAIn = new Scanner(System.in);
        double elevenGPA = elevenGPAIn.nextDouble();
        //calculate 12th grade GPA
        double nineGPArounded = Math.round(nineGPA * 100) / 100.0;
        double tenGPArounded = Math.round(tenGPA * 100) / 100.0;
        double elevenGPArounded = Math.round(elevenGPA * 100) / 100.0;
        double highschoolGPA = ((nineGPArounded + tenGPArounded + elevenGPArounded + totalGPArounded) / 4);
        double highschoolGPArounded = Math.round(highschoolGPA * 100) / 100.0;
        System.out.println();
        System.out.println("Your highschool GPA is " + highschoolGPArounded + "!");
      }
    }

    else if (yesNoAns.equals("NO")) {
      System.out.println();
      System.out.println("Okay, have a good day!");    
    }
  }
}
