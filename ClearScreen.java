public class ClearScreen {
  static void clear() {
    System.out.println("\033[H\033[2J"); //clears the screen or console
    System.out.flush(); //resets the cursor position to the top of the screen
  }
}