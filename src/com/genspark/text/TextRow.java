package com.genspark.text;

public class TextRow {

    public TextRow(String firstColumnText) {
        if (firstColumnText == null) {
            String excMsg = "First column text must not be null";
            throw new NullPointerException(excMsg);
        }
    }

}
