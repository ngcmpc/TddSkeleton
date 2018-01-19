package com.develogical;

import java.util.HashMap;
import java.util.HashSet;

public class RomanNumberalKata {


    private HashMap<Integer, String>  baseSet;

    public RomanNumberalKata() {
        this.baseSet = new HashMap<Integer, String>();
        this.baseSet.put(1, "I");
        this.baseSet.put(5, "V");
        this.baseSet.put(10, "X");
    }

    public String convert(int i) {
        String result = "";
        if (this.baseSet.containsKey(i)) {
            result = this.baseSet.get(i);
        }
        if (i < 4) {
            result = convertUnder4(i);
        } else if (i == 4) {
            result =  "IV";
        } else if (i < 9) {
            result = "V" + convertUnder4(i-5);
        } else if (i == 9) {
            result = "IX";
        }
        return result;
    }

    private String convertUnder4(Integer input) {
        String result = "";
        for(int i = 0 ; i < input; i++ ) {
            result += this.baseSet.get(1);
        }
        return result;
    }
}
