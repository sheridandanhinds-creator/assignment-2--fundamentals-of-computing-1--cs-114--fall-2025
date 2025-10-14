import java.util.Scanner;

public class PrintVowelsAndNonVowels {
  public static void main(String[] args) {
    System.out.println("Please enter phrase:");
    Scanner scan = new Scanner(System.in);
    String phrase = scan.next(); 
    scan.close();

    int vowel = 0;
    int letter;

    letter = (int);
    boolean isVowel(){
      return (letter == vowel);
    }

public String toString() {
    String letterName;

    if (letter == vowel) {
      letterName = "a, e, i, o, u++";
    } else {
      letterName = "x++";
    }
    return letterName;
  }
}

    int letter = ??;
    int vowelCounter = 0;
    //needs to account for a, e, i, o, and u individually (isVowel)
    int letterCounter = 0;{
      if(letter.isVowel){
        //a, e, i, o, or u ++
      }
      else{
        otherLetter++;
      }
    }
  }
}
