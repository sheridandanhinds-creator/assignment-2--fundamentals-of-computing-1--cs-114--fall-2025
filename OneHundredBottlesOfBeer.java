public class OneHundredBottlesOfBeer {
  public static void main(String[] args) {
    for(int x = 100; x > 0; x--){
      //Maintains proper grammar for lyrics
      String bottleType;
      if(x == 1) {
        bottleType = "bottle";
      }
      else{
        bottleType = "bottles"; 
      }

    System.out.println(x + " " + bottleType + " of beer on the wall ");
    System.out.println(x + " " + bottleType + " of beer ");
    System.out.println("If one of those bottles should happen to fall");
    System.out.println((x - 1) + " bottles of beer on the wall\n ");

    }
  }
}