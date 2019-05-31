package com.example.traverse;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

public class mplaces extends AppCompatActivity {

    public static final String EXTRA_PLACEID="placeid";

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jplaces);

        int placeid=(Integer)getIntent().getExtras().get(EXTRA_PLACEID);
        mplace_holder holder = mplace_holder.places[placeid];

        TextView name =(TextView)findViewById(R.id.text1);
        name.setText(holder.getMname());

        TextView placename= (TextView)findViewById(R.id.text2);
        placename.setText(holder.getMplacename());

        ImageView image=(ImageView)findViewById(R.id.image_view);
        image.setImageResource(holder.getMimageresourceid());
        image.setContentDescription(holder.getMname());

        ImageView image1=(ImageView)findViewById(R.id.image_view1);
        image1.setImageResource(holder.getMstars());

        TextView des =(TextView)findViewById(R.id.text3);
        des.setText(holder.getMdescription());
    }
}
