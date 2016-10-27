package com.example.razvan.paragontest;

import java.util.ArrayList;
/**
 * Created by Maria on 3/29/2019.
 */
public class CardHeader {

    ArrayList<String> statName = new ArrayList<>();

    private String stats_raw = "Card Name\tCost\tType\tAffinity\tRarity\tEnergy Damage\tMana Regen\tMax Health\tPhysical Damage\tHealth Regen\tMax Mana\tEnergy Pen\tPhysical Armor\tCooldown Reduction\tPhysical Pen\tEnergy Armor\tCrit Chance\tLifesteal\tCrit Bonus\tAttack Speed\tHarvester Placement Time\tMax Movement Speed\tDamage Bonus\tMaxedEnergy Damage\tMaxedMana Regen\tMaxedMax Health\tMaxedPhysical Damage\tMaxedHealth Regen\tMaxedMax Mana\tMaxedEnergy Pen\tMaxedPhysical Armor\tMaxedCooldown Reduction\tMaxedPhysical Pen\tMaxedEnergy Armor\tMaxedCrit Chance\tMaxedLifesteal\tMaxedCrit Bonus\tMaxedAttack Speed\tMaxedHarvester Placement Time\tMaxedMax Movement Speed\tMaxedDamage Bonus\tSpecial0\tSpecial1\tSpecial2\tMaxedSpecial0\tMaxedSpecial1\tMaxedSpecial2";
    private String stats[] = stats_raw.split("\t");

    public CardHeader(){
        for(String stat:stats) {
            statName.add(stat);
        }
    }
}
