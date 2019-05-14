package com.example.traverse;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

public class jplaces extends AppCompatActivity {

    public static final String EXTRA_PLACEID="placeid";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jplaces);

        int placeid = (Integer)getIntent().getExtras().get(EXTRA_PLACEID);
        Common common = Common.places[placeid];

        TextView name = (TextView)findViewById(R.id.text1);
        name.setText(common.getName());

        TextView place = (TextView)findViewById(R.id.text2);
        place.setText(common.getPlacename());

        ImageView image = (ImageView)findViewById(R.id.image_view);
        image.setImageResource(common.getImageResouceId());
        image.setContentDescription(common.getName());

        TextView des = (TextView)findViewById(R.id.text3);
        des.setText(common.getMdescription());

        ImageView image1=(ImageView)findViewById(R.id.image_view1);
        image1.setImageResource(common.getStarResourceId());
    }
}
