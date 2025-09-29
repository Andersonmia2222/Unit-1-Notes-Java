public class Main {
   public static void main(String[] args) {
      System.out.println("hiii");

      System.out.print("Hi");
      System.out.println("there");
      System.out.print("!");
     
      String message = "\nI woke up and said, \"hello world\"";
      System.out.print(message);

      System.out.println(4 + 3);
      System.out.println(4 - 1);
      System.out.println(6 * 7);
      System.out.println(5 / 3); 
      System.out.println(5.0 / 3); 
      double result = 2 + (3 * 2 - 6); 
      System.out.println(result);

      int remain = 23 % 2; 
      System.out.println(remain);
      System.out.println(628 % 2);

      System.out.println(3 + "3");  

      int zachAge = 16;
      int miaAge = zachAge;

      int x = 15;
      int y = 21;
      int z = 2;
      x = y; 
      y = y * 2;
      z = 27; 

      System.out.println("x is " + x);
      System.out.println("y is " + y);
      System.out.println("z is " + z);

      int num1 = 3; 
      double num2 = 3.14;
      System.out.println("num1 is still " + num1);

  
      int points = 0; 
      points = points + 1;
     
      points = points - 15;
      System.out.println(points);

      
      int originalValue = 5; 
      double castDouble = (double) originalValue; 
      System.out.println("Cast to double: " + castDouble);
      int castInt = (int) castDouble;
      System.out.println("Cast back to int: " + castInt); 

      System.out.println(3 / 4); //0 
      System.out.println(3.0/ 4); //0.75
       System.out.println(3 / 4.0);//0.75
      System.out.println((double) 3/4); 
      //casting presereved the decimal places 

// Casting is helpful when dividing integers 
int apcs = 13;
int juniors = 40;
double csPercent = (double) apcs/juniors;
System.out.println(csPercent); //0.325
//rounding by casting
double positiveNum = 11.0;
double negativeNum = -4.0;
int nearestPositive = (int) (positiveNum +0.5);
int nearestnegitive = (int) (negativeNum - 0.5);


   }
}