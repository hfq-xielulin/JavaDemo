package com.xll.test;



/**
 * @author 吴瑶/wuyao
 * @version v1.0.0
 * @comment 某些特定字符串问题
 * @date 2017/12/27 16:37
 */
public class TestStr {

    /**
     * 原字符串
     */
    private static String str = "文章的卡发牢骚了很多<a href='http://www.baidu.com' target='_blank'>会找房</a>范德萨范德萨";
    private static String repStr = "http://www.baidu.com";
    private static String newStr = "https://www.huizhaofang.com";

    /**
     * 测试循环次数
     */
    private static int num = 100000;

    /**
     * 测试String的replace与subString
     */
    public static void main(String[] args) {
        //开始时间
        long startTime1 = System.currentTimeMillis();
        TestStr.replaceStr(str, repStr, newStr, num);
        //结束时间
        long endTime1 = System.currentTimeMillis();
        System.out.println("replaceStr-->程序运行时间："+(endTime1 - startTime1)+"毫秒");


        TestStr.subStr(str, repStr, newStr, num);
        //结束时间
        long endTime2 = System.currentTimeMillis();
        System.out.println("subStr-->程序运行时间："+(endTime2 - endTime1)+"毫秒");
    }

    /**
     * 字符串替换
     * @param str 字符串
     * @param num 循环次数
     */
	public static void replaceStr(String str, String repStr, String newStr, int num) {
        for(int i = 0;i< num ; i++){
            str.replace(repStr, newStr);
        }
	}

    /**
     * 截取替换字符串
     * @param str 字符串
     * @param num 循环次数
     */
	public static void subStr(String str, String repStr, String newStr, int num) {

        for(int i = 0;i< num ; i++){
            int lastIndexBegin = str.lastIndexOf(repStr);
            int lastIndexEnd = lastIndexBegin + repStr.length();
            String sstr1 = str.substring(0, lastIndexBegin);
            String sstr2 = str.substring(lastIndexEnd, str.length());
            sstr2 = sstr1 + newStr + sstr2;
        }
	}
}
