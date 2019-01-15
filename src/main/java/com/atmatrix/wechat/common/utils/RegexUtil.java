package com.atmatrix.wechat.common.utils;

import net.gcardone.junidecode.Junidecode;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class RegexUtil {


    public static String getPhone(String resource) {
        String pattern = CheckPhoneUtil.SIMPLE_PHONE;
//        String pattern = "\\p{N}{10}";
        Pattern r = Pattern.compile(pattern);

        Matcher matcher = r.matcher(resource);
        StringBuffer bf = new StringBuffer(64);
        while (matcher.find()) {
            bf.append(matcher.group()).append(",");
        }
        int len = bf.length();
        if (len > 0) {
            bf.deleteCharAt(len - 1);
        }
        return bf.toString();

    }
    public static void main(String[] args) {
        String str = "高涛\uD83D\uDC49 ¹⁸⁶⁸⁸⁶⁶²⁹⁸¹\n";
//        String pattern = "\\p{N}";
        System.out.println(getPhone(Junidecode.unidecode(str)));
        System.out.println(getPhone(str));

    }
}
