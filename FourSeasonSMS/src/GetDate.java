import java.util.Calendar;

public class GetDate {
    public static String getDate() {
        // 获取当前星期几
        Calendar calendar = Calendar.getInstance();
        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
        // Calendar.SUNDAY = 1, Calendar.WEDNESDAY = 4, Calendar.THURSDAY = 5, Calendar.SATURDAY = 7
        if (dayOfWeek >= Calendar.SUNDAY && dayOfWeek <= Calendar.WEDNESDAY) {
            return "18:30";
        } else {
            return "19:00";
        }
    }
}
