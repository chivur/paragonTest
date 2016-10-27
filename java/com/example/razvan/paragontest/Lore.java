package com.example.razvan.paragontest;

import android.app.Activity;
import android.content.Intent;
import android.content.res.AssetManager;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by Razvan on 3/27/2016.
 */
public class Lore extends Activity {

    ArrayList<Card> allCards;

    TextView tv;
    ImageView iv;

    AssetManager assetManager;
    int requestCode = 1; /* request from ItemCardReader the ArrayList<Cards> */

    ItemCardReader cardsDatabase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lore);

        tv = (TextView)findViewById(R.id.text);
        iv = (ImageView)findViewById(R.id.image);


        assetManager = getApplicationContext().getAssets();
        cardsDatabase = new ItemCardReader(assetManager,getApplicationContext());

        ArrayList<String> filter = new ArrayList<>();
        filter.add("Energy Damage");

        cardsDatabase.getFilteredCardsAfterStat(filter);
        cardsDatabase.filteredCardsAfterStat.size();

        filter.add("Attack Speed");
        cardsDatabase.getFilteredCardsAfterStat(filter);
        cardsDatabase.filteredCardsAfterStat.size();

        cardsDatabase.getFilteredCardsAfterType("Upgrade");

        iv.setImageResource(cardsDatabase.cards.get(2).getCardID());
        tv.setText(cardsDatabase.cards.get(2).getSplitCardInfo()[0]);

        Hero fengHero=new Hero("FengMao",0,"");

        HeroStatReader fengMao = new HeroStatReader(assetManager,getApplicationContext(),fengHero);




    }


}