package com.niyu.util;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

/**
 * @author peiqi
 * @date 2022/3/210:05
 */
public class IdUtil {
    public static String getArticleId(){
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
        String formatDate = sdf.format(date);
        //加上两位随机数
        Random random = new Random();
        int end2 = random.nextInt(99);
        //如果不足两位前面补0
        String str = formatDate + String.format("%02d", end2);
        return str;
    }

    public static void main(String[] args) {
        System.out.println(getArticleId());
    }
}
