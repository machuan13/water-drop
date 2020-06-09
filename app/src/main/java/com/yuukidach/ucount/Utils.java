package com.yuukidach.ucount;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Utils {
    public static boolean checkTel(String tel){
        Pattern p = Pattern.compile("^[1][3,4,5,7,8,9][0-9]{9}$");
        Matcher matcher = p.matcher(tel);
        return matcher.matches();
    }
}
