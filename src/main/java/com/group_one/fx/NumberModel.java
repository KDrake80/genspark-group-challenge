package com.group_one.fx;

import javafx.beans.property.SimpleStringProperty;

public class NumberModel {
    // using String wrapper class
    private SimpleStringProperty numWord;

    public NumberModel(String numWord)
    {
        this.numWord = new SimpleStringProperty(numWord);
    }

    public String getNumWord() {
        return numWord.get();
    }

    public void setNumWord(String numWord) {
        this.numWord = new SimpleStringProperty(numWord);
    }
}