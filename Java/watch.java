import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

class watch {
    public static void main(String[] args) {

        while (true) {
            Date date = Calendar.getInstance().getTime();
            DateFormat formatter = new SimpleDateFormat("hh:mm:ss");
            String today = formatter.format(date);
            System.out.print("\r " + today);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}