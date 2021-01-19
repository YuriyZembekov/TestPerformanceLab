package daytwo.tasktwo;

public class SimplifyzerPath {
    public static String simplifyPath(String text){
        while (text.contains("..")){
            text=text.replaceAll("\\w+/\\.\\./","");
        }
        if (text.lastIndexOf('/')==text.length()-1){
            text=text.substring(0,text.length()-1);
        }
        return text;
    }
}
