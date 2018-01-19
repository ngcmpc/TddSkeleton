package com.develogical;

public class RomanNumberalKata {

    private String I;

    public RomanNumberalKata() {
        this.I = "I";
    }

    public String convert(int i) {
        if (i < 4) {
            return convertUnder4(i);
        } else if (i == 4) {
            return "IV";
        } else if (i == 5) {
            return "V";
        } else if (i < 9) {
            return "V" + convertUnder4(i-5);
        } else if (i == 9) {
            return "IX";
        } else  {
            return "X";
        }
    }

    private String convertUnder4(int input) {
        String result = "";
        for(int i = 0 ; i < input; i++ ) {
            result += "I";
        }
        return result;
    }
}
