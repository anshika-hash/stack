import java.io.*;
import java.util.*;

public class Main {

  public static void main(String[] args) throws Exception {

    String str;
    Scanner scnr = new Scanner(System.in);
//System.out.print("Enter a string: ");
    str = scnr.nextLine();

//System.out.println();

//System.out.print("The string entered by the user is: " + str );
    Stack<Character> stack = new Stack<Character>();

    for (int i = 0; i < str.length(); i++) {
      char ch = str.charAt(i);
      if (ch == ')') {
        if (stack.peek() == '(') {
          System.out.println(true);
          return;
        } else {
          while (stack.peek() != '(') {
            stack.pop();
          }
          stack.pop();

        }
      } else {
        stack.push(ch);
      }
    }
    System.out.println(false);
  }

}
