public class CountFlips {
  public static void main(String[] args) {
    Coin dime = new Coin();
    int headsCounter = 0;
    int tailsCounter = 0;

    for(int x = 0; x < 100; x++){
      dime.flip();
      if(dime.isHeads()){
        headsCounter++;
      }
      else{
        tailsCounter++;
      }
    }
    System.out.println("The dime landed on heads: " + headsCounter + " times");
    System.out.println("The dime landed on heads: " + tailsCounter + " times");
  }
}
