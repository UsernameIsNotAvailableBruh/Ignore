import java.util.Scanner;

class Program5Unit5 {
   public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    println("Enter a value for rows:");
    int Rows = input.nextInt();
    Triangle(1, Rows);
    //print("\n");
    Triangle(2, Rows);
    //print("\n");
    Triangle(3, Rows);
    //print("\n");
    Triangle(4, Rows);
    //print("\n");
    println("Enter a value for Diamond:");
    int Diamond = input.nextInt();
    Diamond(Diamond);
   }
   public static void Triangle(int Mode, int Rows){
       if (Mode == 1) {
           for (int x=0;x<=Rows;x++){
               for (int y=0;y<x;y++){
                   print("*");
               }
               print("\n");
           }
       }
       else if (Mode == 2) {
           for (int x=1;x<=Rows;x++){
               String rowLine = "";
               for (int y = Rows-x;y>0;y--){print(" ");}
               for (int y=0;y<x;y++){
                   rowLine += "*";
               }
               print(rowLine+"\n");
           }
       }
       else if (Mode == 3) {
         for (int x=Rows;x>0;x--){
            String rowLine = "";
            for (int y=0;y<x;y++){
                rowLine += "*";
            }
            print(rowLine+"\n");
        }
       }
       else if (Mode == 4) {
         for (int x=Rows;x>0;x--){
            String rowLine = "";
            for (int y=0;y<x;y++){
                rowLine += "*";
            }
            for (int y = Rows-x;y>0;y--){print(" ");}
            print(rowLine+"\n");
        }
       }
   }

   public static void Diamond(int Num){
      int MaxStars = 1+(Num-1)*2;
      for (int i=1;i<=MaxStars;i+=2){
        for (int x=0;x<(MaxStars-i)/2;x++){print(" ");}
        for (int x=0;x<i;x++){print("*");}
        println("");
      }
      for (int i=MaxStars-2;i>=1;i-=2){
        for (int x=0;x<(MaxStars-i)/2;x++) {print(" ");}
        for (int x=0;x<i;x++) {print("*");}
        println("");
      }
   }

   //im too lazy to write System.out.print
   public static void print(String a){
       System.out.print(a);
   }
   public static void println(String a){
       System.out.println(a);
   }
}
