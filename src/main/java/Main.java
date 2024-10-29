

class Main {
  public static void main(String[] args) {
    int x;
    int rnd = (int)(Math.random()*10);
      for (x = 0; x <= rnd; x++) {
        for (int y = 0; y < 10; y++ ) {
          System.out.print(y +  " ");
        }
  
        System.out.println(x);
        
      }
      System.out.println("After the loop " + x);
  }
}