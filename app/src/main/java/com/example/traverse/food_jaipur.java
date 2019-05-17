package com.example.traverse;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class food_jaipur extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_places_jaipur);

        ArrayList<Common1> listview = new ArrayList<>();
        listview.add(new Common1("Gatte ka Pulao",R.drawable.gatte_ka_pulao));
        listview.add(new Common1("Dil Khushal",R.drawable.khushal_dil));
        listview.add(new Common1("Balu Shahi",R.drawable.shahi_balu));
        listview.add(new Common1("Boondi Raita",R.drawable.raita_boondi));
        listview.add(new Common1("Pyaaz Kachori",R.drawable.pyaaz_kachori));
        listview.add(new Common1("Gujia",R.drawable.gujia));
        listview.add(new Common1("Badam Halwa",R.drawable.badam_halwa));

        Common1Adapter foodadapter = new Common1Adapter(this,listview);
        ListView list =(ListView)findViewById(R.id.list_jplaces);
        list.setAdapter(foodadapter);
    }
}
