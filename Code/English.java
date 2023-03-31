public class English {
  double englishGPA = 0.0;
  
  public void english(String grade) {
    switch(grade) {
      case "A+":
        englishGPA = 4.0;
      break;
      case "A":
        englishGPA = 4.0;
      break;
      case "A-":
        englishGPA = 3.7;
      break;
      case "B+":
        englishGPA = 3.3;
      break;
      case "B":
        englishGPA = 3.0;
      break;
      case "B-":
        englishGPA = 2.7;
      break;
      case "C+":
        englishGPA = 2.3;
      break;
      case "C":
        englishGPA = 2.0;
      break;
      case "C-":
        englishGPA = 1.7;
      break;
      case "D+":
        englishGPA = 1.3;
      break;
      case "D":
        englishGPA = 1.0;
      break;
      case "D-":
        englishGPA = 0.7;
      break;
      case "F":
        englishGPA = 0.0;
      break;
      case "NULL":
      break;
    }
  }
}