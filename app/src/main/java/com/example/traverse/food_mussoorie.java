package com.example.traverse;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class food_mussoorie extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_places_jaipur);

        ArrayList<Common1>list=new ArrayList<>();
        list.add(new Common1("Maggie",R.drawable.m_food));
        list.add(new Common1("Thali",R.drawable.thali));

        Common1Adapter adapter= new Common1Adapter(this,list);
        ListView listView=(ListView)findViewById(R.id.list_jplaces);
        listView.setAdapter(adapter);
    }
}
