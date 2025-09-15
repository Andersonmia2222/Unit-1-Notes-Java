
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





   }
}

