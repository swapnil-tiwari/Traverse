package com.example.traverse;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class MomentAdapter extends ArrayAdapter<Common1> {

    public MomentAdapter(Activity context, ArrayList<Common1> list) {
        super(context, 0, list);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.layout_moments, parent, false
            );
        }
        Common1 currentplace = getItem(position);
        TextView textView1 = (TextView) listItemView.findViewById(R.id.text_view1);
        textView1.setText(currentplace.getName());

        TextView textView2 = (TextView) listItemView.findViewById(R.id.text_view2);
        textView2.setText(currentplace.getmMemory());

        return listItemView;
    }
}
