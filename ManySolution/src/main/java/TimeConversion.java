import java.text.ParseException;

public class TimeConversion {
    public static void main(String[] args) throws ParseException {
        result("07:18:09PM");
    }


    static String result(String s) throws ParseException {
//        DateFormat date = new SimpleDateFormat("HH:mm:ss");
//        Date date1 = date.parse(s);
//        System.out.println(date.format(date1));
//        return date.toString();
        String [] tempArray = s.split(":");
        String hours = tempArray[0];
        String minutes = tempArray[1];
        String seconds = tempArray[2].substring(0, 2);

        int tempHours;

        if (tempArray[2].substring(2, 4).equalsIgnoreCase("PM")) {
            if (Integer.parseInt(hours) < 12) {
                tempHours = Integer.parseInt(hours);
                tempHours += 12;
                hours = Integer.toString(tempHours);
            }
        }
        if (tempArray[2].substring(2, 4).equalsIgnoreCase("AM")) {
            if (Integer.parseInt(hours) == 12) {
                hours = "00";
            }
        }
        System.out.println(hours + ":" + minutes + ":" + seconds);
        return hours + ":"+ minutes + ":" + seconds;
    }
}
