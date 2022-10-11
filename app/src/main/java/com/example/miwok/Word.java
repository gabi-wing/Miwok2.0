package com.example.miwok;

public class Word {

    String word = "";
    String translation = "";

    public Word (String english, String miwok){
        word = english;
        translation = miwok;
    }

    public String getEnglish(){return word;}
    public String getMiwok(){return translation;}
}
