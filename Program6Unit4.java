import java.util.Scanner;

class Program6Unit4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        println("Enter a int below:");
        int Num = input.nextInt();

        print(LeftSpace(Num*10, "-"));
        for (int y=1;y<=Num;y++){
            print("+"+SpaceCalc(y, Num, "-"));
        }
        print("\n");
        for (int y=1;y<=Num;y++){
            print(LeftSpace(y, Num*10, "-"));
            for (int x=1;x<=Num;x++){
                int CurrentNum = y*x;
                print("|"+ SpaceCalc(CurrentNum, Num, " "));
            }
            println("|");
        }
    }

    public static String SpaceCalc(int CurrentNum, int MaxNum, String Char){
        int MaxDigits = new String(MaxNum*MaxNum+"").length();
        int CurrentDigits = new String(CurrentNum+"").length();
        int TotalSpace = MaxDigits+2;
        String SpaceLeft = "";
        String SpaceRight = "";
        if ((TotalSpace-CurrentDigits)%2 == 0){
            for (int i=0;i<(TotalSpace-CurrentDigits)/2;i++){
                SpaceLeft += Char;
            }
            SpaceRight = SpaceLeft;
        }
        else {
            for (int i=0;i<(TotalSpace-CurrentDigits/2)/2;i++){
                SpaceLeft += Char;
            }
            for (int i=0;i<(TotalSpace-CurrentDigits)/2;i++){
                SpaceRight += Char;
            }
        }
        return SpaceLeft+CurrentNum+SpaceRight;
    }
    
    public static String LeftSpace(int CurrentNum, int MaxNum, String Char){
        int MaxDigits = new String(MaxNum+"").length();
        int CurrentDigits = new String(CurrentNum+"").length();
        String SpaceLeft = "";
        for (int i=0;i<MaxDigits-CurrentDigits;i++){
            SpaceLeft += Char;
        }
        return CurrentNum+SpaceLeft;
    }

    public static String LeftSpace(int MaxNum, String Char){
        int MaxDigits = new String(MaxNum+"").length();
        String SpaceLeft = "";
        for (int i=0;i<MaxDigits;i++){
            SpaceLeft += Char;
        }
        return SpaceLeft;
    } 
    
    //im too lazy to write System.out.print
    public static void print(Object a){
        System.out.print(a);
    }
    public static void println(Object a){
        System.out.println(a);
    }
}