public class Basichw{
	public static void main(String[] args){
		{System.out.println("Problem 1");}
		for (int x = 50; x <= 100; x = x+2) {System.out.println(x);}
		{System.out.println("Problem 2");}
		{int x = 1; int y = 0;
			while (x <= 10) {
				y = y + x; x = x + 1;}
				{System.out.println(y);}
			}
		{System.out.println("Problem 3");}
		for (int x = 1; x <= 100; x = x + 1) {
			if (x % 5 == 4 || x % 5 == 1) {System.out.println(x);}
		  }
		{System.out.println("Problem 4");}
//		for (int x = 1; x < Double.POSITIVE_INFINITY; x = x+1) {
		for (int x = 1; x <= 100; x = x + 1) {
			if (x % 3 == 0 && x % 4 != 0) {System.out.println(x);}
			if (x % 4 == 0 && x % 3 != 0) {System.out.println(x);}
		}
		{System.out.println("Problem 5");}
		{int x = 1; int y = 0; int z = 1;
//			while (x < Double.POSITIVE_INFINITY)
			while (x <= 100) {
				{System.out.println(z);}
				z = x + y; y = x; x = z;
			}
		}
		}
	}
