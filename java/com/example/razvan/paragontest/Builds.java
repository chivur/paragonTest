package com.example.razvan.paragontest;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import java.util.ArrayList;

/**
 * Created by Razvan on 3/27/2016.
 */
public class Builds extends Activity {

    ArrayList<ImageButton> imgBtns = new ArrayList<>();
    Hero heroSelected;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.builds_view);

        Intent intent = getIntent();
        heroSelected.setName("");

        int contentID=0;

        /* get reference to all image buttons */
        for(int i=1;i<7;i++){
            contentID = getResources().getIdentifier("img_btn_" + i,"drawable", getPackageName());
            imgBtns.add((ImageButton)findViewById(contentID));
        }

        registerClickListners();

    }

    private void registerClickListners() {

        for(ImageButton btn : imgBtns){
            btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    /* TODO : call another activity and wait for its result -> one with a dropdown menu to choose
                     * an item + some buttons for filtering after stat / cost / type
                     * NOTE:  when clicking user should be provided with 2 options : remove current selected item
                     * and choose card[action which is described at the beginning of the to-do ]
                      * */

                    /* after you ger the result, update heroSelected's stats accordingly and the imageButton src with
                      * the selected item  */
                }
            });
        }
    }



}
