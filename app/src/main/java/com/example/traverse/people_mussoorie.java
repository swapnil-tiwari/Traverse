package com.example.traverse;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class people_mussoorie extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_places_jaipur);

        ArrayList<Common1> list = new ArrayList<>();
        list.add(new Common1("Booboonil",R.drawable.m_swapnil));
        list.add(new Common1("Suryansh",R.drawable.m_aryansh));
        list.add(new Common1("Ehraaz",R.drawable.m_ehraaz));
        list.add(new Common1("Udit",R.drawable.m_udit));
        list.add(new Common1("Arpit",R.drawable.m_aryansh));
        list.add(new Common1("Deepak",R.drawable.deepak));
        list.add(new Common1("Suraj",R.drawable.m_suraj));

        Common1Adapter adapter= new Common1Adapter(this,list);
        ListView listView=(ListView)findViewById(R.id.list_jplaces);
        listView.setAdapter(adapter);
    }
}
