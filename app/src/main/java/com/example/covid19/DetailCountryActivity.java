package com.example.covid19;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

public class DetailCountryActivity extends AppCompatActivity {
    private  int positionCountry;
    TextView tvCountry,tvCases,tvRecovered,tvCritical,tvActive,tvTodayCases,tvTotalDeaths,tvTodayDeaths;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_country);
        getSupportActionBar().setTitle("Details Countries");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        Intent intent=getIntent();
        positionCountry=intent.getIntExtra("position",0);


        tvCountry = findViewById(R.id.tvCoutry);
        tvCases = findViewById(R.id.tvCases);
        tvRecovered = findViewById(R.id.tvRecovered);
        tvCritical = findViewById(R.id.tvCritical);
        tvActive = findViewById(R.id.tvActive);
        tvTodayCases = findViewById(R.id.tvTodayCases);
        tvTotalDeaths = findViewById(R.id.tvDeaths);
        tvTodayDeaths = findViewById(R.id.tvTodayDeaths);

        tvCountry.setText(CountriesActivity.countryModelsList.get(positionCountry).getCountry());
        tvCases.setText(CountriesActivity.countryModelsList.get(positionCountry).getCases());
        tvRecovered.setText(CountriesActivity.countryModelsList.get(positionCountry).getRecovered());
        tvCritical.setText(CountriesActivity.countryModelsList.get(positionCountry).getCritical());
        tvActive.setText(CountriesActivity.countryModelsList.get(positionCountry).getActive());
        tvTodayCases.setText(CountriesActivity.countryModelsList.get(positionCountry).getTodayCases());
        tvTotalDeaths.setText(CountriesActivity.countryModelsList.get(positionCountry).getDeaths());
        tvTodayDeaths.setText(CountriesActivity.countryModelsList.get(positionCountry).getTodayDeaths());

    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId()==android.R.id.home)
            finish();
        return super.onOptionsItemSelected(item);
    }
}
