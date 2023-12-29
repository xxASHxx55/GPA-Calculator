public class GPA {
  double GPA = 0.0;

  public double gpa(String grade) {
    switch (grade) {
      case "A+":
        GPA = 4.0;
      break;
      case "A":
        GPA = 4.0;
      break;
      case "A-":
        GPA = 3.7;
      break;
      case "B+":
        GPA = 3.3;
      break;
      case "B":
        GPA = 3.0;
      break;
      case "B-":
        GPA = 2.7;
      break;
      case "C+":
        GPA = 2.3;
      break;
      case "C":
        GPA = 2.0;
      break;
      case "C-":
        GPA = 1.7;
      break;
      case "D+":
        GPA = 1.3;
      break;
      case "D":
        GPA = 1.0;
      break;
      case "D-":
        GPA = 0.7;
      break;
      case "F":
        GPA = 0.0;
      break;
      case "NULL":
        GPA = 0.0;
      break;
    }
  return GPA;
  }
}