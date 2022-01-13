package com.company;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
//        stringBuilder = new StringBuilder("initial");
        stringBuilder.append(1);
        stringBuilder.append(" ");
        stringBuilder.append(new ImmutableClass(new int[]{1}));
        stringBuilder.delete(2, 5);
        System.out.println(stringBuilder.toString());
        stringBuilder = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            stringBuilder.append(i);
        }
        stringBuilder.deleteCharAt(2);
//        stringBuilder.insert(2, "some input");
        stringBuilder.insert(0, -1);
        stringBuilder.replace(3, 6, " ");
//        stringBuilder.reverse();
        System.out.println(stringBuilder.toString());

        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer = new StringBuffer("initial");
        char c = '\n';

        String str = "cafe with \"Cafe name\" \n this is new line with \\";
        System.out.println(str);

        Pattern pattern = Pattern.compile("cafe", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()) {
            System.out.println(str.substring(matcher.start(), matcher.end()));
        }
    }
}
