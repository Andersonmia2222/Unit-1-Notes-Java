
//Every java file is a class
public class Main {
// main method is the entryway to the program
   public static void main(String []args) {
      System.out.println(" hiii");
     
     
      //OUTPUT: difference between .print & .println
      
      System.out.print("Hi");
      System.out.println("there");
      System.out.print("!");
   //.println displays the message and then goes to the next line 

   //escape: use \ (backslash) to include speacial characters, use \n for line breaks 
   String message = "\n I woke up and said, \"hello world\"";
   System.out.print(message);

   //Arithmetic Exception expression with opperation 
   System.out.println(4+3);
   System.out.println(4-1);
   System.out.println(6*7);
   System.out.println(5/3); // TRUNCATED! 
   // Integer divison results in truncation which is throwing away the decimal places 
   System.out.println(5.0/3); //.double 
   // compound expressions follow PEMDAS 
   double result = 2+(3*2-6); 
   System.out.println(result);

   //remainder % operator 
   int remain = 23 % 2; //1 -> means odd number
   System.out.println(remain);
   System.out.println(628 % 2); // 0 means even 

   // watch out for the plus sign!
   System.out.println(3 +"3"); //int+ string going to equal a string 

   //you can set one variable to another value

   int zachage = 16;
   int miaage = zach_age;
   
   //both variables above contain the same value 
   //practice copying and re-assigning values 

   int x = 15;
   int y = 21;
   int z = 2;
   x = y; //x now stores the same value as y 
   y= y * 2;
   z = 27; 

system.out.println("x is " +x);
system.out.println("Y is " +y);
system.out.println("Z is " +z);

//type mismatch error 
int num1 = 3; // int would cause an error below
double num2 = 3.14;
num1 = 2 * num2; // can't fit a double into an int 
system.out.println(num1);


// INCREMENT: add on to current valuw 
int score = 0; 
points = points + 1;
// decrement: decrease an existing value 
points = points - 15;
System.out.println(points);


   }
}

