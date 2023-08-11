package com.example.worldcupapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.worldcupapp.Adapter.CustomAdapter;
import com.example.worldcupapp.Model.CountryInfo;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.listView);
        ArrayList<CountryInfo> countryInfoArrayList = new ArrayList<>();
        countryInfoArrayList.add(new CountryInfo(R.drawable.germany, "Germany", "6"));
        countryInfoArrayList.add(new CountryInfo(R.drawable.france, "France", "1"));
        countryInfoArrayList.add(new CountryInfo(R.drawable.argentina, "Argentina", "2"));
        countryInfoArrayList.add(new CountryInfo(R.drawable.netherlands, "Netherlands", "6"));
        countryInfoArrayList.add(new CountryInfo(R.drawable.turkey, "Turkey", "3"));
        countryInfoArrayList.add(new CountryInfo(R.drawable.canada, "Canada", "0"));
        countryInfoArrayList.add(new CountryInfo(R.drawable.argentina, "Iran", "2"));
        countryInfoArrayList.add(new CountryInfo(R.drawable.france, "USA", "1"));
        countryInfoArrayList.add(new CountryInfo(R.drawable.germany, "UK", "5"));


        CustomAdapter adapter = new CustomAdapter(this, countryInfoArrayList);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(), countryInfoArrayList.get(position).getCountryName() + " has won " +
                        countryInfoArrayList.get(position).getCupCount() + " worldcup", Toast.LENGTH_LONG).show();
            }
        });

    }
}