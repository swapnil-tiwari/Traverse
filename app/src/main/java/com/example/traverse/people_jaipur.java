package com.example.traverse;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class people_jaipur extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_places_jaipur);

        ArrayList<Common1> list = new ArrayList<Common1>();
        list.add(new Common1("Priyanshu",R.drawable.priyanshu));
        list.add(new Common1("Ehraaz",R.drawable.ehraaz));
        list.add(new Common1("Booboonil",R.drawable.booboo));
        list.add(new Common1("Deepak",R.drawable.deepak));
        list.add(new Common1("Udit",R.drawable.udit));

        Common1Adapter adapter = new Common1Adapter(this,list);
        ListView listplaces = (ListView)findViewById(R.id.list_jplaces);
        listplaces.setAdapter(adapter);

    }
}
