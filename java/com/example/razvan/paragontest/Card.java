package com.example.razvan.paragontest;

import android.util.Pair;

import java.util.ArrayList;

/**
 * Created by Maria on 3/29/2016.
 */
public class Card {

    private String cardInfo; /* string with all information about card - cardHeader format */
    private int cardID; /* TODO: get card images from paragorn */
    private String splitCardInfo[]; /* card info split with "\t" token */
    private ArrayList<Pair<String,String>> notableInfo = new ArrayList<>(); /* only stats != 0 in (StatName,StatValue) format */
    private CardHeader header = new CardHeader();


    public Card(String cardInfo, int cardID){
        this.cardID = cardID;
        this.cardInfo = cardInfo;
        splitCardInfo = cardInfo.split("\t");

        for (int i=0; i<splitCardInfo.length-1; ++i){
            if(!splitCardInfo[i].equals("0")){
                notableInfo.add(new Pair(header.statName.get(i),splitCardInfo[i]));
            }
        }
    }


    public String[] getSplitCardInfo() {
        return splitCardInfo;
    }

    public void setSplitCardInfo(String[] splitCardInfo) {
        this.splitCardInfo = splitCardInfo;
    }

    public ArrayList<Pair<String, String>> getNotableInfo() {
        return notableInfo;
    }

    public void setNotableInfo(ArrayList<Pair<String, String>> notableInfo) {
        this.notableInfo = notableInfo;
    }

    public CardHeader getHeader() {
        return header;
    }

    public void setHeader(CardHeader header) {
        this.header = header;
    }

    public String getCardInfo() {
        return cardInfo;
    }

    public void setCardInfo(String cardInfo) {
        this.cardInfo = cardInfo;
    }

    public int getCardID() {
        return cardID;
    }

    public void setCardID(int cardID) {
        this.cardID = cardID;
    }

    public String getCardAffinity() {
        if(this.splitCardInfo[3].equals("Affinity.Order")){
            return "o";
        }
        if(this.splitCardInfo[3].equals("Affinity.Intellect")){
            return "i";
        }
        if(this.splitCardInfo[3].equals("Affinity.Corruption")){
            return "c";
        }
        if(this.splitCardInfo[3].equals("Affinity.Fury")){
            return "f";
        }
        if(this.splitCardInfo[3].equals("Affinity.Growth")){
            return "g";
        }
        if(this.splitCardInfo[3].equals("Affinity.Universal")){
            return "u";
        }
        return null;
    }

    public String getCardType() {

        if(this.splitCardInfo[4].equals("Common")){
            return "c";
        }
        if(this.splitCardInfo[4].equals("Uncommon")){
            return "u";
        }
        if(this.splitCardInfo[4].equals("Starter")){
            return "s";
        }
        return null;
    }
}
