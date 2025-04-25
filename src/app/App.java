
package app;
import folder.testClass;

public class App {

    public static void main(String[] args) {
        NewClass nc = new NewClass();
        nc.grade = 85;
        nc.grades(nc.grade);
        
        String st_name = nc.name = "Gerome";
        nc.student(st_name);
        String op = nc.operator = "+";
        nc.calculator(nc.grade,10,op);
        
//        testClass tc = new testClass();
//        String student_name = tc.name = "Gerome";
//        
//        tc.student(student_name);
        
    }
    
}
