package com.xll.test;

import java.util.Calendar;
import java.util.Date;

/**
 * @author 吴瑶/wuyao
 * @version v1.0.0
 * @comment 时间戳获取测试
 * @date 2017/12/27 16:12
 */
public class TestTime {
    /**
     * 测试循环次数
     */
    private static int num = 100000;

    /**
     * java时间戳获取测试
     * 方法 一
     * System.currentTimeMillis();
     *
     * 方法 二
     * Calendar.getInstance().getTimeInMillis();
     *
     * 方法 三
     * new Date().getTime();
     */
    public static void main(String[] args) {
        //开始时间
        long startTime1 = System.currentTimeMillis();
        TestTime.testCurrentTime(num);
        //结束时间
        long endTime1 = System.currentTimeMillis();
        System.out.println("testCurrentTime-->程序运行时间："+(endTime1 - startTime1)+"毫秒");

        TestTime.testCalanderTime(num);
        long endTime2 = System.currentTimeMillis();
        System.out.println("testCalanderTime-->程序运行时间："+(endTime2 - endTime1)+"毫秒");

        TestTime.testDateTime(num);
        long endTime3 = System.currentTimeMillis();
        System.out.println("testDateTime-->程序运行时间："+(endTime3 - endTime2)+"毫秒");

    }

    /**
     * 测试：
     * System.currentTimeMillis();
     */
    public static void testCurrentTime(int num){
        for(int i = 0;i< num ; i++){
            long currentTime = System.currentTimeMillis();
        }
    }

    /**
     * 测试：
     * Calendar.getInstance().getTimeInMillis();
     */
    public static void testCalanderTime(int num){
        // 因为Canlendar要处理时区问题会耗费较多的时间
        for(int i = 0;i< num ; i++){
            long currentTime = Calendar.getInstance().getTimeInMillis();
        }
    }

    /**
     * 测试：
     * new Date().getTime();
     */
    public static void testDateTime(int num){
        for(int i = 0;i< num ; i++){
            long currentTime = new Date().getTime();
        }
    }
}
