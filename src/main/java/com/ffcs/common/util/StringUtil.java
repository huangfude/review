package com.ffcs.common.util;

/**
 * Created by Administrator on 2016/10/04.
 */
public class StringUtil {
    public static String splitLast(String str, String regex)
    {
        String[] split = str.split(regex);
        return split[(split.length - 1)];
    }

    public static boolean isEmpty(String str)
    {
        return (str == null) || (str.length()==0);
    }

    public static boolean isNotBlank(String str)
    {
        return (str != null) && (str.length()!=0);
    }
}
