package com.develogical;

public class RomanNumberalKata {

    private String I;

    public RomanNumberalKata() {
        this.I = "I";
    }

    public String convert(int i) {
        return this.convertUnder4(i);
    }

    private String convertUnder4(int input) {
        String result = "";
        for(int i = 0 ; i < input; i++ ) {
            result += "I";
        }
        return result;
    }
}
