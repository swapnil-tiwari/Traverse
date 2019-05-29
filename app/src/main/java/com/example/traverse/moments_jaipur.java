package com.example.traverse;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class moments_jaipur extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_places_jaipur);

        ArrayList<Common1> list = new ArrayList<>();
        list.add(new Common1("First","We had an incident with the auto driver. We were coming back after visiting few of the famous spots of the Jaipur. Because it was night time so auto drivers were asking large amount of fare. After many attempts one of the auto driver agreed to take us to our hotel at a reasonable price. On the way we were talking how the other auto drivers were asking such a high price and the auto driver weas listening all this. So when we reached the hotel he too asked for the money which the other auto drivers were asking. After hearing that I lost my cool and told him he will not get a single penny more than what we agreed on. After seeing me angry he backed off and took the fare we agreed on."));
        list.add(new Common1("Second","We reached Jaipur four in the morning. It was winter's time so we couldn't spent the night on the station. We planned to take dormetry available on the station for the night and after during day we will leave it. But at the last moment we changed the plan and decided to go any hotel. There were some cab drivers who took us to various hotels. It was New Year so hotels were charging quite high price. But atlast we found a hotel which was in our budget but the service was pathetic. But somehow we managed coz we only had to sleep there for one night."));
        list.add(new Common1("third","It was our first group trip. We planned everything during our exam time and the day exams got over we left for the Jaipur. Our original plan was to stay in Jaipur for one day and then go to Udaipur from there and stay two days in Udaipur. But while we were exploring the Jaipur we got the information that we have our practical examinations after one day. So our trip got shortened by one day. Still there was no chagne in plan. But due to Booboonil we were not able to go to Udaipur. He said that he will not be able to take that much travelling coz of which we had to return to college from Jaipur."));

        MomentAdapter adapter = new MomentAdapter(this,list);
        ListView listView=(ListView)findViewById(R.id.list_jplaces);
        listView.setAdapter(adapter);
    }
}
