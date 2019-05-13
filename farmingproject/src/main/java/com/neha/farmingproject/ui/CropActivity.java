package com.neha.farmingproject.ui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.neha.farmingproject.R;

public class CropActivity extends AppCompatActivity {
    ImageView imgbarley, imgsugar, imgtomato, imgcauli, imgcotton, imgmaize, imgwheat, imgmustard, imgrice, imgoats, imgonion, imgpotato;
     TextView txtbarley, txtsugar, txttomato, txtcauli, txtcotton, txtmaize, txtwheat, txtmustard, txtrice, txtoats, txtonion, txtpotato;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crop);

        imgbarley = findViewById(R.id.barley);
        imgbarley.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), BarleyActivity.class);
                startActivity(intent);
            }
        });

        imgcauli = findViewById(R.id.cauli);
        imgcauli.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), CauliflowerActivity.class);
                startActivity(intent);
            }
        });
        imgcotton = findViewById(R.id.cotton);
        imgcotton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), CottonActivity.class);
                startActivity(intent);
            }
        });
        imgmaize = findViewById(R.id.maize);
        imgmaize.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MaizeActivity.class);
                startActivity(intent);

            }
        });
        imgmustard = findViewById(R.id.mustard);
        imgmustard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MustardActivity.class);
                startActivity(intent);
            }
        });
        imgoats = findViewById(R.id.oats);
        imgoats.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), OatsActivity.class);
                startActivity(intent);
            }
        });
        imgonion = findViewById(R.id.onion);
        imgonion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), OnionActivity.class);
                startActivity(intent);
            }
        });
        imgpotato = findViewById(R.id.potato);
        imgpotato.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), PotatoActivity.class);
                startActivity(intent);
            }
        });

        imgrice= findViewById(R.id.rice);
        imgrice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), RiceActivity.class);
                startActivity(intent);
            }
        });
        imgsugar = findViewById(R.id.sugarcane);
        imgsugar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), SugarcaneActivity.class);
                startActivity(intent);
            }
        });
        imgtomato = findViewById(R.id.tomato);
        imgtomato.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), TomatoActivity.class);
                startActivity(intent);
            }
        });

        imgwheat = findViewById(R.id.wheat);
        imgwheat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), WheatActivity.class);
                startActivity(intent);
            }
        });

        txtbarley = findViewById(R.id.barleys);
        txtbarley.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), BarleyActivity.class);
                startActivity(intent);
            }
        });

        txtcauli = findViewById(R.id.caulis);
        txtcauli.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), CauliflowerActivity.class);
                startActivity(intent);
            }
        });
        txtcotton = findViewById(R.id.cottons);
        txtcotton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), CottonActivity.class);
                startActivity(intent);
            }
        });
        txtmaize = findViewById(R.id.maizes);
        txtmaize.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MaizeActivity.class);
                startActivity(intent);

            }
        });
        txtmustard = findViewById(R.id.mustards);
        txtmustard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MustardActivity.class);
                startActivity(intent);
            }
        });
        txtoats = findViewById(R.id.oatss);
        txtoats.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), OatsActivity.class);
                startActivity(intent);
            }
        });
        txtonion = findViewById(R.id.onions);
        txtonion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), OnionActivity.class);
                startActivity(intent);
            }
        });
        txtpotato = findViewById(R.id.potatoes);
        txtpotato.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), PotatoActivity.class);
                startActivity(intent);
            }
        });

        txtrice= findViewById(R.id.rices);
        txtrice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), RiceActivity.class);
                startActivity(intent);
            }
        });
        txtsugar = findViewById(R.id.sugarcanes);
        txtsugar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), SugarcaneActivity.class);
                startActivity(intent);
            }
        });
        txttomato = findViewById(R.id.tomatoes);
        txttomato.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), TomatoActivity.class);
                startActivity(intent);
            }
        });

        txtwheat = findViewById(R.id.wheats);
        txtwheat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), WheatActivity.class);
                startActivity(intent);
            }
        });

    }

    }

