package daythree;

import daythree.taskone.Pair;
import daythree.tasktwo.Main;

public class DayThree {
    public static void startTaskOne() {
        Pair<Integer, String> pair = Pair.of(1, "hello");
        Integer i = pair.getFirst(); //-> 1
        String s = pair.getSecond(); //-> "hello"
        System.out.print("first - " + i + "  ");
        System.out.println("second - " + s);
        Pair<Integer, String> pair2 = Pair.of(1, "hello");
        Pair<Integer, String> pairWithNull = Pair.of(1, null);
        System.out.println("pair.equals(pair2) - " + pair.equals(pair2));//-> true
        System.out.println("pair.equals(pairWithNull) - " + pair.equals(pairWithNull));//-> false
    }
    public static void startTaskTwo(){
        Main.main(new String[0]);
        System.out.println("Day three, task two completed");
    }
}
