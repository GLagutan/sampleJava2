
package app;
import folder.testClass;
import java.util.Scanner;

public class NewClass extends test2{
    String name;
    int grade;
    
    public static void grades(int grd){
        if(grd <= 74){
            System.out.println("Failed");
        }else if(grd >= 100){
            System.out.println("Grade out of Range");
        }else{
            System.out.println("Passed");
        }
    }
    
}

class test2 extends testClass{

    String operator;
    Scanner enter = new Scanner(System.in);
    
    public static void calculator(int a, int b, String op){
        switch(op){
            case "+":
                System.out.println(a+b);
                break;
            case "-":
                System.out.println(a-b);
                break;
            case "/":
                System.out.println(a/b);
                break;
            case "*":
                System.out.println(a*b);
                break;
            default:
                System.out.println("this operator is not included");
        }
    }
    
}
