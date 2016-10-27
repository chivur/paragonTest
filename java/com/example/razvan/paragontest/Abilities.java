package com.example.razvan.paragontest;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Razvan on 3/27/2016.
 */
public class Abilities extends ActionBarActivity {

    /* basic info */
    private String heroName;
    private String role;
    private String type;
    private String scalingStat;
    private String affinities;

    /* Abilities */
    private List<Ability> abilitiesList = new ArrayList<Ability>();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.abilities);


        Intent intent = getIntent();
        heroName = intent.getStringExtra("hero selected");

        populateAbilityList();
        populateListView();

    }


    private void populateAbilityList(){

        if(heroName.equals("FengMao")){
            abilitiesList.add(new Ability(getResources().getString(R.string.feng_mao_name_passive),getResources().getString(R.string.feng_mao_passive),R.drawable.feng_mao_pass));
            abilitiesList.add(new Ability(getResources().getString(R.string.feng_mao_name_lmb),getResources().getString(R.string.feng_mao_lmb),R.drawable.feng_mao_lmb));
            abilitiesList.add(new Ability(getResources().getString(R.string.feng_mao_name_rmb),getResources().getString(R.string.feng_mao_rmb),R.drawable.feng_mao_rmb));
            abilitiesList.add(new Ability(getResources().getString(R.string.feng_mao_name_q),getResources().getString(R.string.feng_mao_q),R.drawable.feng_mao_q));
            abilitiesList.add(new Ability(getResources().getString(R.string.feng_mao_name_e),getResources().getString(R.string.feng_mao_e),R.drawable.feng_mao_e));
            abilitiesList.add(new Ability(getResources().getString(R.string.feng_mao_name_r),getResources().getString(R.string.feng_mao_r),R.drawable.feng_mao_r));
        }

        if(heroName.equals("Dekker")){
            abilitiesList.add(new Ability(getResources().getString(R.string.dekker_name_passive),getResources().getString(R.string.dekker_passive),R.drawable.dekker__pass));
            abilitiesList.add(new Ability(getResources().getString(R.string.dekker_name_lmb),getResources().getString(R.string.dekker_lmb),R.drawable.dekker__lmb));
            abilitiesList.add(new Ability(getResources().getString(R.string.dekker_name_rmb),getResources().getString(R.string.dekker_rmb),R.drawable.dekker__rmb));
            abilitiesList.add(new Ability(getResources().getString(R.string.dekker_name_q),getResources().getString(R.string.dekker_q),R.drawable.dekker__q));
            abilitiesList.add(new Ability(getResources().getString(R.string.dekker_name_e),getResources().getString(R.string.dekker_e),R.drawable.dekker__e));
            abilitiesList.add(new Ability(getResources().getString(R.string.dekker_name_r),getResources().getString(R.string.dekker_r),R.drawable.dekker__r));
        }

        if(heroName.equals("Gideon")){
            abilitiesList.add(new Ability(getResources().getString(R.string.gideon_name_passive),getResources().getString(R.string.gideon_passive),R.drawable.gideon__pass));
            abilitiesList.add(new Ability(getResources().getString(R.string.gideon_name_lmb),getResources().getString(R.string.gideon_lmb),R.drawable.gideon__lmb));
            abilitiesList.add(new Ability(getResources().getString(R.string.gideon_name_rmb),getResources().getString(R.string.gideon_rmb),R.drawable.gideon__rmb));
            abilitiesList.add(new Ability(getResources().getString(R.string.gideon_name_q),getResources().getString(R.string.gideon_q),R.drawable.gideon__q));
            abilitiesList.add(new Ability(getResources().getString(R.string.gideon_name_e),getResources().getString(R.string.gideon_e),R.drawable.gideon__e));
            abilitiesList.add(new Ability(getResources().getString(R.string.gideon_name_r),getResources().getString(R.string.gideon_r),R.drawable.gideon__r));
        }
        if(heroName.equals("Howitzer")){
            abilitiesList.add(new Ability(getResources().getString(R.string.howitzer_name_passive),getResources().getString(R.string.howitzer_passive),R.drawable.howitzer_pass));
            abilitiesList.add(new Ability(getResources().getString(R.string.howitzer_name_lmb),getResources().getString(R.string.howitzer_lmb),R.drawable.howitzer_lmb));
            abilitiesList.add(new Ability(getResources().getString(R.string.howitzer_name_rmb),getResources().getString(R.string.howitzer_rmb),R.drawable.howitzer_rmb));
            abilitiesList.add(new Ability(getResources().getString(R.string.howitzer_name_q),getResources().getString(R.string.howitzer_q),R.drawable.howitzer_q));
            abilitiesList.add(new Ability(getResources().getString(R.string.howitzer_name_e),getResources().getString(R.string.howitzer_e),R.drawable.howitzer_e));
            abilitiesList.add(new Ability(getResources().getString(R.string.howitzer_name_r),getResources().getString(R.string.howitzer_r),R.drawable.howitzer_r));
        }
        if(heroName.equals("Kallari")){
            abilitiesList.add(new Ability(getResources().getString(R.string.kallari_name_passive),getResources().getString(R.string.kallari_passive),R.drawable.kallari_pass));
            abilitiesList.add(new Ability(getResources().getString(R.string.kallari_name_lmb),getResources().getString(R.string.kallari_lmb),R.drawable.kallari_lmb));
            abilitiesList.add(new Ability(getResources().getString(R.string.kallari_name_rmb),getResources().getString(R.string.kallari_rmb),R.drawable.kallari_rmb));
            abilitiesList.add(new Ability(getResources().getString(R.string.kallari_name_q),getResources().getString(R.string.kallari_q),R.drawable.kallari_q));
            abilitiesList.add(new Ability(getResources().getString(R.string.kallari_name_e),getResources().getString(R.string.kallari_e),R.drawable.kallari_e));
            abilitiesList.add(new Ability(getResources().getString(R.string.kallari_name_r),getResources().getString(R.string.kallari_r),R.drawable.kallari_r));
        }
        if(heroName.equals("Rampage")){
            abilitiesList.add(new Ability(getResources().getString(R.string.rampage_name_passive),getResources().getString(R.string.rampage_passive),R.drawable.rampage_pass));
            abilitiesList.add(new Ability(getResources().getString(R.string.rampage_name_lmb),getResources().getString(R.string.rampage_lmb),R.drawable.rampage_lmb));
            abilitiesList.add(new Ability(getResources().getString(R.string.rampage_name_rmb),getResources().getString(R.string.rampage_rmb),R.drawable.rampage_rmb));
            abilitiesList.add(new Ability(getResources().getString(R.string.rampage_name_q),getResources().getString(R.string.rampage_q),R.drawable.rampage_q));
            abilitiesList.add(new Ability(getResources().getString(R.string.rampage_name_e),getResources().getString(R.string.rampage_e),R.drawable.rampage_e));
            abilitiesList.add(new Ability(getResources().getString(R.string.rampage_name_r),getResources().getString(R.string.rampage_r),R.drawable.rampage_r));
        }
        if(heroName.equals("Steel")){
            abilitiesList.add(new Ability(getResources().getString(R.string.steel_name_passive),getResources().getString(R.string.steel_passive),R.drawable.steel_pass));
            abilitiesList.add(new Ability(getResources().getString(R.string.steel_name_lmb),getResources().getString(R.string.steel_lmb),R.drawable.steel_lmb));
            abilitiesList.add(new Ability(getResources().getString(R.string.steel_name_rmb),getResources().getString(R.string.steel_rmb),R.drawable.steel_rmb));
            abilitiesList.add(new Ability(getResources().getString(R.string.steel_name_q),getResources().getString(R.string.steel_q),R.drawable.steel_q));
            abilitiesList.add(new Ability(getResources().getString(R.string.steel_name_e),getResources().getString(R.string.steel_e),R.drawable.steel_e));
            abilitiesList.add(new Ability(getResources().getString(R.string.steel_name_r),getResources().getString(R.string.steel_r),R.drawable.steel_r));
        }
        if(heroName.equals("Murdock")){
            abilitiesList.add(new Ability(getResources().getString(R.string.murdock_name_passive),getResources().getString(R.string.murdock_passive),R.drawable.murdock_pass));
            abilitiesList.add(new Ability(getResources().getString(R.string.murdock_name_lmb),getResources().getString(R.string.murdock_lmb),R.drawable.murdock_lmb));
            abilitiesList.add(new Ability(getResources().getString(R.string.murdock_name_rmb),getResources().getString(R.string.murdock_rmb),R.drawable.murdock_rmb));
            abilitiesList.add(new Ability(getResources().getString(R.string.murdock_name_q),getResources().getString(R.string.murdock_q),R.drawable.murdock_q));
            abilitiesList.add(new Ability(getResources().getString(R.string.murdock_name_e),getResources().getString(R.string.murdock_e),R.drawable.murdock_e));
            abilitiesList.add(new Ability(getResources().getString(R.string.murdock_name_r),getResources().getString(R.string.murdock_r),R.drawable.murdock_r));
        }
        if(heroName.equals("TwinBlast")){
            abilitiesList.add(new Ability(getResources().getString(R.string.twin_blast_name_passive),getResources().getString(R.string.twin_blast_passive),R.drawable.twin_blast_pass));
            abilitiesList.add(new Ability(getResources().getString(R.string.twin_blast_name_lmb),getResources().getString(R.string.twin_blast_lmb),R.drawable.twin_blast_lmb));
            abilitiesList.add(new Ability(getResources().getString(R.string.twin_blast_name_rmb),getResources().getString(R.string.twin_blast_rmb),R.drawable.twin_blast_rmb));
            abilitiesList.add(new Ability(getResources().getString(R.string.twin_blast_name_q),getResources().getString(R.string.twin_blast_q),R.drawable.twin_blast_q));
            abilitiesList.add(new Ability(getResources().getString(R.string.twin_blast_name_e),getResources().getString(R.string.twin_blast_e),R.drawable.twin_blast_e));
            abilitiesList.add(new Ability(getResources().getString(R.string.twin_blast_name_r),getResources().getString(R.string.twin_blast_r),R.drawable.twin_blast_r));
        }
        if(heroName.equals("Grux")){
            abilitiesList.add(new Ability(getResources().getString(R.string.grux_name_passive),getResources().getString(R.string.grux_passive),R.drawable.grux_pass));
            abilitiesList.add(new Ability(getResources().getString(R.string.grux_name_lmb),getResources().getString(R.string.grux_lmb),R.drawable.grux_lmb));
            abilitiesList.add(new Ability(getResources().getString(R.string.grux_name_rmb),getResources().getString(R.string.grux_rmb),R.drawable.grux_rmb));
            abilitiesList.add(new Ability(getResources().getString(R.string.grux_name_q),getResources().getString(R.string.grux_q),R.drawable.grux_q));
            abilitiesList.add(new Ability(getResources().getString(R.string.grux_name_e),getResources().getString(R.string.grux_e),R.drawable.grux_e));
            abilitiesList.add(new Ability(getResources().getString(R.string.grux_name_r),getResources().getString(R.string.grux_r),R.drawable.grux_r));
        }
        if(heroName.equals("Muriel")){
            abilitiesList.add(new Ability(getResources().getString(R.string.muriel_name_passive),getResources().getString(R.string.muriel_passive),R.drawable.murriel_pass));
            abilitiesList.add(new Ability(getResources().getString(R.string.muriel_name_lmb),getResources().getString(R.string.muriel_lmb),R.drawable.murriel_lmb));
            abilitiesList.add(new Ability(getResources().getString(R.string.muriel_name_rmb),getResources().getString(R.string.muriel_rmb),R.drawable.murriel_rmb));
            abilitiesList.add(new Ability(getResources().getString(R.string.muriel_name_q),getResources().getString(R.string.muriel_q),R.drawable.murriel_q));
            abilitiesList.add(new Ability(getResources().getString(R.string.muriel_name_e),getResources().getString(R.string.muriel_e),R.drawable.murriel_e));
            abilitiesList.add(new Ability(getResources().getString(R.string.muriel_name_r),getResources().getString(R.string.muriel_r),R.drawable.murriel_r));
        }

        if(heroName.equals("Sparrow")){
            abilitiesList.add(new Ability(getResources().getString(R.string.sparrow_name_passive),getResources().getString(R.string.sparrow_passive),R.drawable.sparrow_pass));
            abilitiesList.add(new Ability(getResources().getString(R.string.sparrow_name_lmb),getResources().getString(R.string.sparrow_lmb),R.drawable.sparrow_lmb));
            abilitiesList.add(new Ability(getResources().getString(R.string.sparrow_name_rmb),getResources().getString(R.string.sparrow_rmb),R.drawable.sparrow_rmb));
            abilitiesList.add(new Ability(getResources().getString(R.string.sparrow_name_q),getResources().getString(R.string.sparrow_q),R.drawable.sparrow_q));
            abilitiesList.add(new Ability(getResources().getString(R.string.sparrow_name_e),getResources().getString(R.string.sparrow_e),R.drawable.sparrow_e));
            abilitiesList.add(new Ability(getResources().getString(R.string.sparrow_name_r),getResources().getString(R.string.sparrow_r),R.drawable.sparrow_r));
        }


        /* TODO : look for imaget for gadget and sevarog abilities
        if(heroName.equals("Gadget")){
            abilitiesList.add(new Ability(getResources().getString(R.string.gadget_name_passive),getResources().getString(R.string.gadget_passive),R.drawable.gadget_pass));
            abilitiesList.add(new Ability(getResources().getString(R.string.gadget_name_lmb),getResources().getString(R.string.gadget_lmb),R.drawable.gadget_lmb));
            abilitiesList.add(new Ability(getResources().getString(R.string.gadget_name_rmb),getResources().getString(R.string.gadget_rmb),R.drawable.gadget_rmb));
            abilitiesList.add(new Ability(getResources().getString(R.string.gadget_name_q),getResources().getString(R.string.gadget_q),R.drawable.gadget_q));
            abilitiesList.add(new Ability(getResources().getString(R.string.gadget_name_e),getResources().getString(R.string.gadget_e),R.drawable.gadget_e));
            abilitiesList.add(new Ability(getResources().getString(R.string.gadget_name_r),getResources().getString(R.string.gadget_r),R.drawable.gadget_r));
        }
        if(heroName.equals("Sevarog")){
            abilitiesList.add(new Ability(getResources().getString(R.string.sevarog_name_passive),getResources().getString(R.string.sevarog_passive),R.drawable.sevarog_pass));
            abilitiesList.add(new Ability(getResources().getString(R.string.sevarog_name_lmb),getResources().getString(R.string.sevarog_lmb),R.drawable.sevarog_lmb));
            abilitiesList.add(new Ability(getResources().getString(R.string.sevarog_name_rmb),getResources().getString(R.string.sevarog_rmb),R.drawable.sevarog_rmb));
            abilitiesList.add(new Ability(getResources().getString(R.string.sevarog_name_q),getResources().getString(R.string.sevarog_q),R.drawable.sevarog_q));
            abilitiesList.add(new Ability(getResources().getString(R.string.sevarog_name_e),getResources().getString(R.string.sevarog_e),R.drawable.sevarog_e));
            abilitiesList.add(new Ability(getResources().getString(R.string.sevarog_name_r),getResources().getString(R.string.sevarog_r),R.drawable.sevarog_r));
        }
        */


    }

    private void populateListView() {

        ArrayAdapter<Ability> adapter = new AbilityListAdapter();
        ListView listView = (ListView) findViewById(R.id.abilityList);
        listView.setAdapter(adapter);

    }


    private class AbilityListAdapter extends ArrayAdapter<Ability>{


        public AbilityListAdapter() {
            super(Abilities.this,R.layout.ability_view, abilitiesList);
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {

            View itemView = convertView;

            if(itemView == null){
                itemView = getLayoutInflater().inflate(R.layout.ability_view,parent,false);
            }

            Ability currAbility = abilitiesList.get(position);

            ImageView img = (ImageView) itemView.findViewById(R.id.img);
            img.setImageResource(currAbility.getIconID());

            TextView name = (TextView) itemView.findViewById(R.id.name);
            name.setText(currAbility.getName());

            TextView desc = (TextView) itemView.findViewById(R.id.description);
            desc.setText(currAbility.getDescription());

            return itemView;

        }

    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getScalingStat() {
        return scalingStat;
    }

    public void setScalingStat(String scalingStat) {
        this.scalingStat = scalingStat;
    }

    public String getAffinities() {
        return affinities;
    }

    public void setAffinities(String affinities) {
        this.affinities = affinities;
    }

    public List<Ability> getHeroes() {
        return abilitiesList;
    }

    public void setHeroes(List<Ability> heroes) {
        this.abilitiesList = heroes;
    }


}
