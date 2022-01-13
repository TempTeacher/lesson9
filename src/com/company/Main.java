package com.company;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder = new StringBuilder("initial");

        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer = new StringBuffer("initial");

        String str = "cafe with \"Cafe name\" \n this is new line with \\";
        System.out.println(str);

        Pattern pattern = Pattern.compile("cafe", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()) {
            System.out.println(str.substring(matcher.start(), matcher.end()));
        }
    }
}
