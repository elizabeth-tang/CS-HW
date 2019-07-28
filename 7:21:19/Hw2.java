public class Hw2{
  public static void main(String[] args){
    int s = 80;
    {System.out.println("Problem 1");}
    if (s >= 1 && s <= 60){
      System.out.println("F");
    }
    else if (s <= 70){
      System.out.println("D");
    }
    else if (s <= 80){
      System.out.println("C");
    }
    else if (s <= 90){
      System.out.println("B");
    }
    else{
      System.out.println("A");
    }
    {System.out.println("Problem 2");}
    for (int x = 1; x <= 50; x = x + 1) {
			if (x % 3 == 0 && x % 4 != 0) {System.out.println(x);}
			if (x % 4 == 0 && x % 3 != 0) {System.out.println(x);}
		}
    {System.out.println("Problem 3");}
    unique();
    {System.out.println("Problem 4");}
    binary();
    {System.out.println("Problem 5");}
    median();
  }
    public static void unique(){
      int x = 3;
      int a = 2;
      int b = 2;
      int c = 2;
      if (a == b) {x = x - 1;}
      if (a == c) {x = x - 1;}
      System.out.println(x);}
    public static void binary(){
      int x = 6;
      int y = 0;
      int z = 0;
      while (x > 0) {
        z += (x % 2) * (Math.pow(10,y));
        y += 1;
        x = (x - (x % 2))/2;
      }
      System.out.println(z);}
    public static void median(){
      var comps = [0,1,2,3,4];
      int median = comps[2];
      System.out.println(median);
    }
  }
