package com.company;

public class WordleBlock {
    private String letter;
    private String color;
    public WordleBlock(String let, String col){
        letter = let;
        color = col;
    }
    public String getColor(){
        return color;
    }
    public String getLetter(){
        return letter;
    }
    public boolean isAMatch(WordleBlock other){
        return letter.equals(other.letter);
    }
}
