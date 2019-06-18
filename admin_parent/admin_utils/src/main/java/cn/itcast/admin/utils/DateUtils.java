package cn.itcast.admin.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {
    /**
     * 日期转字符串
     * @param date
     * @param format
     * @return
     */
    public static String Date2String(Date date,String format ){
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat(format);
        String string = simpleDateFormat.format(date);
        return string;
    }


    /**
     * 字符串转日期
     * @param string
     * @param format
     * @return
     * @throws ParseException
     */
    public static Date String2Date(String string,String format) throws ParseException {
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat(format);
        Date date = simpleDateFormat.parse(string);
        return date;
    }
}
