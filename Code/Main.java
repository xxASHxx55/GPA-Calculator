import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    int numClasses = 0;
    
    ClearScreen.clear(); //clears screen and resets the cursor position to the top of the screen

    //Inital prompt
    System.out.println("--GPA CALCULATOR--");
    System.out.println("Enter in the letter grade for each class. If you are not taking the class type \"null\".");
    
    //english
    //english scanner
    System.out.print("English: ");
    Scanner englishIn = new Scanner(System.in);
    String englishGrade = englishIn.nextLine();
    englishGrade = englishGrade.toUpperCase();
    
    English english = new English();
    english.english(englishGrade);

    //add 1 to the number of classes
    if(englishGrade != "null"){
      numClasses++;
    }
    
  }
}