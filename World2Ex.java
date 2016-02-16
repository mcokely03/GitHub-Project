import java.util.*; //makes a scanner 


class World2Ex{
   public static void main(String argv[]){
   Scanner input = new Scanner (System.in);
   System.out.println("Enter a name");
   String x = input.next ();
   System.out.print("hello " + x);
   System.out.println("Hey, kids, I'm writing some Rad Code");
   
   input.close();
   
   }
}

//system is physical system 
//keyboard= system.in
//screen= system.out
// once you have scanner made you need to prompt the user for information. The input sucks 
//the scanner in and it gives next string 
