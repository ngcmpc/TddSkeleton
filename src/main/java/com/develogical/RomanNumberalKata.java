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
        this.baseSet.put(50, "L");
        this.baseSet.put(100, "C");
    }

    public String convert(int i) {
        String result = "";
        if (this.baseSet.containsKey(i)) {
            result = this.baseSet.get(i);
            return result;
        }
        if (i < 10 ) {
            result = convertUnder10(i);
        }
        else if (i > 10 && i < 40) {
            result = convertUnder4( i / 10, 10) + convert(i % 10);
        }
        else if (i  > 40 && i < 50 ) {
            result = this.baseSet.get(10) + this.baseSet.get(50) + convert(i % 10);
        }
        else if (i  > 50 && i < 90 ) {
            result = this.baseSet.get(50) + convert(i - 50);
        }
        else if (i  > 90 && i < 100 ) {
            result = this.baseSet.get(10) + this.baseSet.get(100) + convert(i % 10);
        }
        return result;
    }



    private String convertUnder10(Integer input) {
        String result = "";
        if (input < 4) {
            result = convertUnder4(input, 1);
        } else if (input == 4) {
            result =  this.baseSet.get(1) + this.baseSet.get(5);
        } else if (input < 9) {
            result = this.baseSet.get(5) + convertUnder4(input-5, 1);
        } else if (input == 9) {
            result = this.baseSet.get(1) + this.baseSet.get(10);
        }
        return result;
    }

    private String convertUnder4(Integer input, int romanCharacterPostition) {
        String result = "";
        for(int i = 0 ; i < input; i++ ) {
            result += this.baseSet.get(romanCharacterPostition);
        }
        return result;
    }
}
