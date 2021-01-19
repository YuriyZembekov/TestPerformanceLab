import dayone.DayOne;
import daytwo.DayTwo;

import java.net.URISyntaxException;
import java.util.function.Function;

public class Main {

    public static void main(String[] args) throws URISyntaxException {
        startDayOne();
        startDayTwo();
    }
    private static void startDayOne(){
        System.out.println("Start day 1");
        DayOne.startTaskOne();
        DayOne.startTaskTwo();
        System.out.println("End day 1");
        System.out.println();
    }
    private static void startDayTwo() throws URISyntaxException {
        System.out.println("Start day 2");
        DayTwo.startTaskOne();
        DayTwo.startTaskTwo();
        DayTwo.startTaskThree();
        System.out.println("End day 2");
        System.out.println();
    }
    private static void startDayThree(){}
}
