import java.util.*;
/**
 * A simple demonstration of how to use the StringTokenizer class.
 * The StringTokenizer class is located in the java.util package.
 * It has three overloaded constructors. Look at the Java API documentation
 * for a description of the three constructors and the available methods.
 *
 * @auther Arion Almond
 * @version 3/15/16
 */
public class BreakingUp
{
  @SuppressWarnings("resource")
public static void main(String[ ] args)
  {
      Scanner keyboard;
      String inputSentence;
      StringTokenizer stok; //declare a reference to hold the address of a StringTokenizer object
      int count;

      keyboard = new Scanner(System.in);
      System.out.print("Enter a line of text: ");
      inputSentence = new String(keyboard.nextLine( ) );
      stok = new StringTokenizer(inputSentence);//the constructor that take a String and uses a space as the delimeter
      count = 1;

      //This output line demonstrates the countTokens( ) method
      System.out.println("This is how many tokens are in your input String: " + stok.countTokens( ));

      //This while loop demonstrates two of the StringTokenizer methods, the hasMoreTokens( ) and the
      // nextToken( ) methods
      while(stok.hasMoreTokens( ) )
      {
          System.out.println("token " + count + ": " + stok.nextToken( ) );
          count++;
      }

      //Enter a new String to demonstrate another StringTokenizer constructor.
      //This version of the constructor takes a second paramenter, a string of characters
      //which will be used to tokenize the String. The delimeters do not
      //count as tokens, but delimit the tokens in the string of characters.
      System.out.print("\nEnter another line of text with some of the following characters ?,.!: ");
      inputSentence = new String(keyboard.nextLine( ) );
      stok = new StringTokenizer(inputSentence,"?,.!");

      System.out.println("This is how many tokens are in your input String: " + stok.countTokens( ));

      //This while loop demonstrates two of the StringTokenizer methods, the hasMoreTokens( ) and the
      // nextToken( ) methods
      count = 1;
      while(stok.hasMoreTokens( ) )
      {
          System.out.println("token " + count + ": " + stok.nextToken( ) );
          count++;
      }

      //For you TODO. Write the code similar to the above examples to see how the third StringTokenize
      //constructor works. Look the constructor papameter list on the Java API documentation.
      //put your code here.



    }//end of main


}
