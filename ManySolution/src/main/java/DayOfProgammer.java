import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;

class DayOfProgrammer {

    static String dayOfProgrammer(int year) {
        int dayOfYear = 256;
        int resultMonth = 0;
        int resultDay = 0;

        int[] AllDayOfYear = {0,31,28,31,30,31,30,31,31,30,31,30,31};

        if(year == 1800){
            AllDayOfYear[2] -= 13;
        }
        else if((year%4 == 0 && year < 1918 || (year > 1918 && ((year%4 == 0 && year%100 != 0) && year % 400 == 0 )))){
            AllDayOfYear[2]++;
        }

        for(int m = 0; m < AllDayOfYear.length; m++){

            if(dayOfYear <= AllDayOfYear[m]){
                resultMonth = m;

                if(m == 2 && year == 1918){
                    dayOfYear += 13;
                }
                resultDay = dayOfYear;
                break;
            }
            else{
                dayOfYear -= AllDayOfYear[m];
            }
        }

        Date resultDate = new Date(year, resultMonth, resultDay);
//        return String.format(resultDate.toString("dd.MM.yyyy"));
        return "";
    }

    public static void main(String[] args) {
//        dayProgrammer(2019);
    }

}
