package BronzeV;
import java.util.Calendar;
import java.text.SimpleDateFormat;

public class Today_10699{
    public static void main(String args[]){
        
    	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Calendar c1 = Calendar.getInstance();
        String strToday = sdf.format(c1.getTime());
        System.out.println(strToday);

    }

}
