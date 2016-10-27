package com.example.razvan.paragontest;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.os.Bundle;
import android.util.Pair;
import android.widget.ImageView;
import android.widget.TextView;


import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

/**
 * Created by Maria on 3/29/2016.
 */
public class ItemCardReader {


    AssetManager assetManager;
    ArrayList<Card> cards = new ArrayList<>();/* after class constructor finishes, it will contain all cards available */
    int requestCode = 1; /* request for the ArrayList<Card> cards */

    ArrayList<Card> filteredCardsAfterStat;
    ArrayList<Card> filteredCardsAfterType;

    Context context;

    public ItemCardReader(AssetManager assetManager, Context context){
        this.assetManager = assetManager;
        this.context = context;

        readCards();
    }


    /* get all cards with the type "cardType"
     *
     * cardType can be : Passive/Active/Upgrade
     *
     */
    public void getFilteredCardsAfterType(String cardType){
        filteredCardsAfterType = new ArrayList<>();
        for(Card currCard : cards){
            if(currCard.getNotableInfo().get(2).second.equals(cardType)){
                filteredCardsAfterType.add(currCard);
            }
        }
    }


    /* get all cards that have filterStat stat
     *
     * can fiter after stats like armor,damage,etc
     *
     */
    public void getFilteredCardsAfterStat(ArrayList<String> filterStats){

        filteredCardsAfterStat = new ArrayList<Card>();
        int addCount = 0;

        for(Card currCard : cards){
            /* for every card */
            addCount = 0;
            for(String currFilterStat : filterStats){
                /* for every stat filter, we look in */
                /* notable info = pairs(statName , statValue) */
                for(Pair<String,String> currStat : currCard.getNotableInfo()){
                    if(currStat.first.equals(currFilterStat)){
                        /* found that card has one of the stats from the filter */
                        addCount++; /* we count how many stats we have */
                    }
                }
            }

            /* we looked for all the filtered stats */
            /* find out if we have all stats matching the filter or not */
            if(addCount == filterStats.size()){
                filteredCardsAfterStat.add(currCard);
            }
        }
    }

    public ArrayList<Card> getCards() {
        return cards;
    }

    public void readCards() {


        InputStream input;
        try {
            input = assetManager.open("cards.txt");

            int size = input.available();
            byte[] buffer = new byte[size];
            input.read(buffer);
            input.close();

            /* byte buffer into a string */
            String text = new String(buffer);

            /* get all the rows */
            String rows[] = text.split("\n");


            Card curr_card;
            for (int i = 0; i < rows.length; ++i) {
                curr_card = new Card(rows[i], 0);/* will set cardID later */
                cards.add(curr_card);
            }

            /* now we have the cards array, we can get the cardID for every card
             *
             * cardIconID format : beta_[type](U/C/S)_[affinity]_[number_index_in_affinity]_full
             *
              * */

            int afinity_index = 1;
            String prevAfinity = "";
            String indexString = new String();
            String currType = "";
            String currAffinity = "";

            /* set cardID -- map card with cardID from R.drawable */
            for (Card currCard : cards) {

                currAffinity = currCard.getCardAffinity();
                currType = currCard.getCardType();

                if (currAffinity == null || currType == null) {
                    continue;
                }
                if (currAffinity.equals(prevAfinity)) {
                    afinity_index++;
                    indexString = (afinity_index < 10 ? "0" : "") + afinity_index;
                } else {
                    afinity_index = 1;
                    indexString = "01";
                }

                currCard.setCardID(context.getResources().getIdentifier("beta_" + currType + "_" + currAffinity + "_" + indexString + "_" + "full"
                        , "drawable", context.getPackageName()));

                prevAfinity = currAffinity; /* for next iteration */

            }

            /* all cards should be available with both information and cardIDs in cards ArrayList */


        }
        catch (Exception e) {
            e.printStackTrace();
        }

    }



}
