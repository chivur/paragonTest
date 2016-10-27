package com.example.razvan.paragontest;

import android.content.Intent;
import android.content.res.AssetManager;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;


public class MainActivity extends ActionBarActivity {

    private List<Hero> heroes = new ArrayList<Hero>();
    private AssetManager assetManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        populateHeroList();
        populateListView();
        registerClickCallback();

    }

    private void registerClickCallback() {

        ListView list = (ListView) findViewById(R.id.heroListView);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parrent, View view_clicked, int pos, long id) {

                Hero clickedHero = heroes.get(pos);

                /* enter hero info screen */

                Intent intent = new Intent(MainActivity.this,HeroSelected.class);
                intent.putExtra("hero selected",clickedHero.getName());
                intent.putExtra("hero icon",clickedHero.getIconID());
                intent.putExtra("hero role",clickedHero.getRole());
                startActivity(intent);

            }
        });

    }

    private void populateListView() {

        ArrayAdapter<Hero> adapter = new HeroListAdapter();

        ListView listView = (ListView) findViewById(R.id.heroListView);
        listView.setAdapter(adapter);

    }

    private void populateHeroList() {

        /* heroes.txt format : <heroName>\t<heroRole> <endl> */

        assetManager = getAssets();
        InputStream input;
        try {
            input = assetManager.open("heroes.txt");

            int size = input.available();
            byte[] buffer = new byte[size];
            input.read(buffer);
            input.close();

            /* byte buffer into a string */
            String text = new String(buffer);

            /* get all the rows (aka name + role) */
            String heroNamesAndRoles[] = text.split("\n");

            String splitHeroInfo[];
            int imgID=0;
            for(String heroInfo : heroNamesAndRoles){
                /* for each hero information add a new Hero obj */
                splitHeroInfo = new String[2]; /* splitHeroInfo[0] = heroName , [1] = heroRole */
                splitHeroInfo = heroInfo.split("\t");

                /* get the hero.iconID */
                /* the .png will have the name in the format : <heroName>.lowerCase.png */
                imgID = getResources().getIdentifier(splitHeroInfo[0].toLowerCase(),"drawable",getPackageName());
                heroes.add(new Hero(splitHeroInfo[0],imgID,splitHeroInfo[1]));
            }

        }catch (Exception e){
            e.printStackTrace();
        }

    }


    private class HeroListAdapter extends ArrayAdapter<Hero> {

        public HeroListAdapter(){
            super(MainActivity.this,R.layout.hero_view, heroes);
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            View itemView = convertView;

            if(itemView == null){
                itemView = getLayoutInflater().inflate(R.layout.hero_view,parent,false);
            }

            Hero currHero = heroes.get(position);

            ImageView img = (ImageView) itemView.findViewById(R.id.img);
            img.setImageResource(currHero.getIconID());

            TextView text = (TextView) itemView.findViewById(R.id.name);
            text.setText(currHero.getName());

            TextView role = (TextView) itemView.findViewById(R.id.role);
            role.setText(currHero.getRole());

            return itemView;
        }

    }
}
