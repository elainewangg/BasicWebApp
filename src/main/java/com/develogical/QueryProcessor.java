package com.develogical;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class QueryProcessor {

    public String process(String query) {
        if (query.toLowerCase().contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        }
        if(query.contains("what is your name")) {
            return "notfluffy";
        }

    
        if(query.contains("which of the following numbers is the largest")) {
            int maximum = 0;
            String parsed = query;
            Pattern regex = Pattern.compile("which of the following numbers is the largest: (\\d+), (\\d+), (\\d+)");
            Matcher matcher = regex.matcher(query);
            for (int i = 1; i < 4; i++){
                if (Integer.parseInt(matcher.group(i)) > maximum) {
                    maximum = Integer.parseInt(matcher.group(i));
                }
            }
            return Integer.toString(maximum);

        }
        return "";

    }
}
