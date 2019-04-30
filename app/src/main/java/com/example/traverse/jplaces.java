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

        TextView des = (TextView)findViewById(R.id.text2);
        des.setText(common.getDescription());

        ImageView image = (ImageView)findViewById(R.id.image_view);
        image.setImageResource(common.getImageResouceId());
        image.setContentDescription(common.getName());
    }
}
