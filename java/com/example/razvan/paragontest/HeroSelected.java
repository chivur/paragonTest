package com.example.razvan.paragontest;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


public class HeroSelected extends ActionBarActivity {

    ImageView img;
    TextView name;
    TextView role;

    Button abilities;
    Button lore;
    Button builds;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hero_selected);

        /* get UI elements */
        img = (ImageView)findViewById(R.id.img);
        name = (TextView)findViewById(R.id.name);
        role = (TextView)findViewById(R.id.role);
        abilities = (Button)findViewById(R.id.abilities);
        lore = (Button)findViewById(R.id.lore);
        builds = (Button)findViewById(R.id.builds);


        /* see what hero was selected */
        Intent intent = getIntent();
        int iconID = intent.getIntExtra("hero icon",0);
        name.setText(intent.getStringExtra("hero selected"));
        img.setImageResource(iconID);
        role.setText(intent.getStringExtra("hero role"));


         /* register click listners for abilities,lore and builds */
        registerClickListners();


    }


    private void registerClickListners() {

        abilities.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent abilitiesIntent = new Intent(HeroSelected.this,Abilities.class);
                abilitiesIntent.putExtra("hero selected",name.getText());
                startActivity(abilitiesIntent);

            }
        });

        lore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent loreIntent = new Intent(HeroSelected.this, Lore.class);
                loreIntent.putExtra("hero selected",name.getText());
                startActivity(loreIntent);

            }
        });

        builds.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent buildsIntent = new Intent(HeroSelected.this, Builds.class);
                buildsIntent.putExtra("hero selected",name.getText());
                startActivity(buildsIntent);

            }
        });

    }


}
