public class TheTwelveDaysOfChristmas {
  public static void main(String[] args) {
    String suffix = " ";
    for(int day = 1; day <= 12; day++){
      //Assigns the proper suffix for the day
      switch (day)
      {
      case 1: 
      suffix = "st";
      break;

      case 2:
      suffix = "nd";
      break;

      case 3:
      suffix = "rd";
      break;

      default:
      suffix = "th";
    }
     System.out.println("On the " + day + suffix + " day of Christmas my true love gave to me");
     //Prints out lyrics according to song based on day
     switch (day)
      {
      case 12:
      System.out.println("Twelve drummers drumming,");

      case 11:
      System.out.println("Eleven pipers piping,");

      case 10:
      System.out.println("Ten lords a-leaping,");

      case 9:
      System.out.println("Nine ladies dancing,");

      case 8:
      System.out.println("Eight maids a-milking,");

      case 7:
      System.out.println("Seven swans a-swimming,");

      case 6:
      System.out.println("Six geese a-laying,");

      case 5:
      System.out.println("Five golden rings,");

      case 4:
      System.out.println("Four calling birds,");

      case 3:
      System.out.println("Three French hens,");

      case 2:
      System.out.println("Two turtle doves, and");

      default:
      System.out.println("A partridge in a pear tree\n");
      break;
      }
    }
  }
}