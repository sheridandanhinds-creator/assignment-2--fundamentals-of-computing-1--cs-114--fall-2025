import java.util.Scanner;

public class PrintVowelsAndNonVowels {
  public static void main(String[] args) {
    System.out.println("Please enter phrase:");
    Scanner scan = new Scanner(System.in);
    String phrase = scan.nextLine(); 
    scan.close();

    int aCounter = 0;
    int eCounter = 0;
    int iCounter = 0;
    int oCounter = 0;
    int uCounter = 0;
    int consonantCounter = 0;
    
    //Sorts each letter to the correct counter
    for(int x = 0; x < phrase.length(); x++){
      switch(phrase.charAt(x))
       { 
       case 'a': 
       aCounter++;
       break; 

       case 'e':
       eCounter++;
       break;

       case 'i':
       iCounter++;
       break;

       case 'o':
       oCounter++;
       break;

       case 'u':
       uCounter++;
       break;

       case ' ':
       break;

       default:
       consonantCounter++;
       break;

      }
    }
    System.out.print("Here are your character counts: A = " + aCounter + " E = " + eCounter + " I = " + iCounter + " O = ");
    System.out.print(oCounter + " U = " + uCounter + " Consonants = " + consonantCounter);
  }
}
