package com.example.traverse;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class places_jaipur extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_places_jaipur);

        ArrayAdapter<Common> listAdapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,Common.places);
        ListView listplaces = (ListView)findViewById(R.id.list_jplaces);
        listplaces.setAdapter(listAdapter);

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
