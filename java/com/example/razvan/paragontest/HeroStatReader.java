package com.example.razvan.paragontest;

import android.content.Context;
import android.content.res.AssetManager;

import java.io.InputStream;
import java.util.ArrayList;

/**
 * Created by Razvan on 4/1/2016.
 */
public class HeroStatReader {

    AssetManager assetManager;
    Hero hero;

    Context context;

    public HeroStatReader(AssetManager assetManager, Context context, Hero hero) {
        this.assetManager = assetManager;
        this.context = context;
        this.hero = hero;

        readStats();
    }

    private void readStats() {

        InputStream input;
        try {
            input = assetManager.open(hero.getName().toLowerCase()+".txt");

            int size = input.available();
            byte[] buffer = new byte[size];
            input.read(buffer);
            input.close();

            /* byte buffer into a string */
            String text = new String(buffer);

            /* get all the rows */
            String rows[] = text.split("\n");

            /* rows format :
            * (statName \t statValue)
            * [0] : Affinity
            * [1] : MaxHealth
            * [2] : HealthRegenRate
            * [3] : EnergyArmor
            * [4] : PhysicalArmor
            * [5] : AttackSpeed
            * [6] : CritBonus
            * [7] : moveSpeed
            * [8]: visionRadius
            * */
            String statRow[];

            for (int i=0; i<rows.length-1;++i) {
                statRow = rows[i].split("\t");

                switch (i) {
                    case 0:
                        hero.setAffinity(statRow[1]);
                        break;
                    case 1:
                        hero.setMaxHealth(Float.parseFloat(statRow[1]));
                        break;
                    case 2:
                        hero.setHealthRegen(Float.parseFloat(statRow[1]));
                        break;
                    case 3:
                        hero.setEnergyArmor(Float.parseFloat(statRow[1]));
                        break;
                    case 4:
                        hero.setPhysicalArmor(Float.parseFloat(statRow[1]));
                        break;
                    case 5:
                        hero.setAttackSpeedRating(Float.parseFloat(statRow[1]));
                        break;
                    case 6:
                        hero.setCritBonus(Float.parseFloat(statRow[1]));
                        break;
                    case 7:
                        hero.setMoveSpeed(Float.parseFloat(statRow[1]));
                        break;
                    case 8:
                        hero.setVisionRadius(Float.parseFloat(statRow[1]));
                        break;
                }
            }

        }catch (Exception e){
            e.printStackTrace();
        }

    }


}
