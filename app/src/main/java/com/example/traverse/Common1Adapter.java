package com.example.traverse;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class Common1Adapter extends ArrayAdapter<Common1> {

    private static final String LOG_TAG = Common1Adapter.class.getSimpleName();

    public Common1Adapter(Activity context, ArrayList<Common1> list) {
        super(context, 0, list);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

            View listItemView = convertView;
            if (listItemView == null) {
                listItemView = LayoutInflater.from(getContext()).inflate(
                        R.layout.list_item, parent, false);
            }
            Common1 currentplace = getItem(position);
            // Find the TextView in the list_item.xml layout with the ID version_name
            TextView nameTextView = (TextView) listItemView.findViewById(R.id.text_view2);
            // Get the version name from the current AndroidFlavor object and
            // set this text on the name TextView
            nameTextView.setText(currentplace.getName());

            // Find the TextView in the list_item.xml layout with the ID version_number
            ImageView imageView = (ImageView) listItemView.findViewById(R.id.image_view);
            // Get the version number from the current AndroidFlavor object and
            // set this text on the number TextView
            imageView.setImageResource(currentplace.getmImageResourceId());

            return listItemView;
    }
}
