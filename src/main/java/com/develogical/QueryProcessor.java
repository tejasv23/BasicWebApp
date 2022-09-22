package com.develogical;

import java.util.Arrays;

public class QueryProcessor {

    public String process(String query) {
        if (query.toLowerCase().contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        }
        if (query.toLowerCase().contains("large")){

            query.replaceAll("%20", "");
            query.replaceAll("[^0-9]+", " ");
            List<Int> x = Arrays.asList(query.trim().split(" "));

            return x.max();
        }

        if (query.toLowerCase().contains("plus")){

            query.replaceAll("%20", "");
            query.replaceAll("[^0-9]+", " ");
            List<Int> x = Arrays.asList(query.trim().split(" "));

            int sum = 0;
            for(int i = 0; i < x.size(); i++){
                sum += x.get(i);
            }

            return sum;
        }


        if (query.toLowerCase().contains("multip")){

            query.replaceAll("%20", "");
            query.replaceAll("[^0-9]+", " ");
            List<Int> x = Arrays.asList(query.trim().split(" "));

            int sum = 1;
            for(int i = 0; i < x.size(); i++){
                sum = sum * x.get(i);
            }

            return sum;
        }

        return "";
    }
}
