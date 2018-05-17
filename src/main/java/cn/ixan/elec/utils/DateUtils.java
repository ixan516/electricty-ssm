package cn.ixan.elec.utils;

import org.apache.commons.lang3.StringUtils;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 自定义时间工具类
 */
public class DateUtils {

    /**
     * 返回格式化的时间
     * @return
     */
    public static String getCurrentTime(){
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String formatTime = format.format(new Date(System.currentTimeMillis()));
        return formatTime;
    }

    public static void string2Date() throws ParseException {
        String dateStr = "2010-05-04 12:34:23";
        //注意format的格式要与日期String的格式相匹配
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = sdf.parse(dateStr);
        System.out.println(date.toString()); // Tue May 04 12:34:23 CST 2010
    }

    public static Date string2Date(String dateString) throws ParseException {
        if(StringUtils.isNotBlank(dateString)){
            //注意format的格式要与日期String的格式相匹配
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            Date date = sdf.parse(dateString);
            return date;
        }
        return null;
    }

    public static String date2String(Date date) {
        if(null == date){
            date = new Date();
        }
        DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        String dateStr = format.format(date);
        return dateStr;
    }

    public static Timestamp getTimestamp(){
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        return timestamp;
    }

    public static Timestamp string2Timestamp(String string) {
        // 注：string的类型必须形如： yyyy-mm-dd hh:mm:ss[.f...] 这样的格式
        // String tsStr = "2011-05-09 11:49:45";
        Timestamp ts = Timestamp.valueOf(string);
        return ts;
    }

    public static Timestamp dateToTimestamp() {
        Date date = new Date();
        Timestamp ts = new Timestamp(date.getTime());
        return ts;
    }


    public static String timestamp2String(Timestamp ts) {
        DateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String tsStr = sdf.format(ts);
        return tsStr;
    }

    public static Date timestamp2Date() {
        Timestamp ts = new Timestamp(System.currentTimeMillis());
        Date date = new Date(ts.getTime());
        return date;
    }

    public static void main(String[] args) {
        System.out.println(DateUtils.getTimestamp());
    }
}
