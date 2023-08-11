package com.example.worldcupapp.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.worldcupapp.Model.CountryInfo;
import com.example.worldcupapp.R;

import java.util.ArrayList;

public class CustomAdapter extends ArrayAdapter<CountryInfo> {

    public CustomAdapter(@NonNull Context context, @NonNull ArrayList<CountryInfo> objects) {
        super(context, R.layout.country_item, objects);
    }

    private class ViewHolder {
        TextView count;
        TextView name;
        ImageView flag;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        CountryInfo countryInfo = getItem(position);
        ViewHolder viewHolder;
        if (convertView == null) {
            viewHolder = new ViewHolder();
            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView = inflater.inflate(R.layout.country_item, parent, false);
            viewHolder.count = convertView.findViewById(R.id.textView2);
            viewHolder.name = convertView.findViewById(R.id.textView);
            viewHolder.flag = convertView.findViewById(R.id.imageView);
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }
        viewHolder.count.setText(countryInfo.getCupCount());
        viewHolder.name.setText(countryInfo.getCountryName());
        viewHolder.flag.setImageResource(countryInfo.getImageUrl());
        return convertView;
    }
}
