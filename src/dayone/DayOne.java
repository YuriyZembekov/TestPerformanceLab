package dayone;

import dayone.taskone.Line;
import dayone.tasktwo.*;

public class DayOne {
    public static void startTaskOne(){
        Line ab = new Line(1,1,2,2);
        Line cd = new Line(-3,0,1,1);
        String result;
        result = (ab.equals(cd)) ? "Отрезки равны" : "Отрезки не равны";
        System.out.println(result);
    }
    public static Label taskTwo(TextAnalizer[] textAnalizers, String text){
        Label label = Label.OK;
        for (TextAnalizer ta: textAnalizers) {
            label = ta.processText(text);
            if (!label.equals(Label.OK)){
                break;
            }
        }
        return label;
    }

    public static void startTaskTwo(){
        TextAnalizer[] textAnalizers = {new NegativeTextAnalyzer(),
                new SpamAnalyzer(new String[]{"ыыы"}),
                new TooLongTextAnalyzer(10)};
        System.out.println(DayOne.taskTwo(textAnalizers, "  :(  "));
        System.out.println(DayOne.taskTwo(textAnalizers, "  ыыы  "));
        System.out.println(DayOne.taskTwo(textAnalizers, "123456789ыыы :(  "));
        System.out.println(DayOne.taskTwo(textAnalizers, "123456789qwerty"));
    }


}
