package com.niyu.util;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

/**
 * @author peiqi
 * @date 2022/3/110:42
 */
public class ISODateUtil {

    public static String dateToISODate(Date dateStr) {
        TimeZone tz = TimeZone.getTimeZone("UTC");
            // 解析字符串时间
//            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
            DateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
            df.setTimeZone(tz);
            String nowAsISO = df.format(dateStr);
            System.out.println(nowAsISO);
        return nowAsISO;
    }
}
