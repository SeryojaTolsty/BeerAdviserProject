package ru.gb.beeradviser;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.List;


public class FindBeerActivity extends Activity {
    BeerExpert expert = new BeerExpert();

    Spinner color;
    Button findBeerButton;
    TextView brands;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_beer);

        color = findViewById(R.id.color);
        findBeerButton = findViewById(R.id.find_beer);
        brands = findViewById(R.id.brands);

        findBeerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String beerType = String.valueOf(color.getSelectedItem());
                List<String> brandList = expert.getBrands(beerType);
                StringBuilder brandsFormatted = new StringBuilder();
                for (String brand : brandList) {
                    brandsFormatted.append(brand).append('\n');
                }
                brands.setText(brandsFormatted);
            }
        });
    }


}