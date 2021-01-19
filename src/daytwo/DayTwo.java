package daytwo;

import daytwo.taskone.ExceptionCatching;
import daytwo.taskthree.Integrator;
import daytwo.tasktwo.SimplifyzerPath;

import java.net.URISyntaxException;

public class DayTwo {
    public static void startTaskOne() throws URISyntaxException {
        ExceptionCatching.main(new String[0]);
    }
    public static void startTaskTwo(){
        System.out.println("Входные данные - " + "/a/b/c/../d");
        System.out.println("Выходные данные - " + SimplifyzerPath.simplifyPath("/a/b/c/../d"));
        System.out.println("Входные данные - " + "/a/");
        System.out.println("Выходные данные - " + SimplifyzerPath.simplifyPath("/a/"));
    }
    public static void startTaskThree(){
        System.out.println(Integrator.integrate( x -> x, 0, 10));
    }

}
