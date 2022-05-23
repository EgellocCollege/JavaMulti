import java.text.DateFormatSymbols;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public final static void main  (String[] args)  {
        System.out.println("ccc");
        String[] ww = new DateFormatSymbols().getWeekdays();

        List<String> xx = new ArrayList<>(Arrays.asList(ww));

        System.out.println("ww = " + ww.length);
        for(String a:xx){
            System.out.print("0"+a+"0");
        }

        for(String a:ww){
            System.out.print("["+a+"]");
        }

        try {
            uyyy();
        } catch (Exception e) {
            //e.printStackTrace();
            System.out.println("exceotion" + e.getMessage());
        }
        System.out.println("ggg");
    }


    public final static void uyyy() {
        xxx(null);
    }

    public final static void xxx  (String args) throws IllegalArgumentException{
        if (args == null) {
            throw new IllegalArgumentException("xxxxxx");
        }
    }
}
