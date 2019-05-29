package com.example.traverse;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class places_jaipur extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_places_jaipur);

        ArrayList<Common1> list = new ArrayList<Common1>();
        list.add(new Common1("Nahargarh Fort",R.drawable.picture1));
        list.add(new Common1("City Palace",R.drawable.picture2));
        list.add(new Common1("Hawa Mahal",R.drawable.picture3));
        list.add(new Common1("Lake Palace",R.drawable.picture4));

        Common1Adapter adapter = new Common1Adapter(this,list);
        ListView listplaces = (ListView)findViewById(R.id.list_jplaces);
        listplaces.setAdapter(adapter);

        AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> listplaces, View view, int position, long id) {
                Intent intent = new Intent(places_jaipur.this, jplaces.class);
                intent.putExtra(jplaces.EXTRA_PLACEID, (int) id);
                startActivity(intent);
            }
        };

        listplaces.setOnItemClickListener(itemClickListener);

    }
}
