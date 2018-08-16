package com.samarpitha.shara.kannadalanguage;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LinearLayout alphatextview = (LinearLayout) findViewById(R.id.alphabets1);
        LinearLayout numtextview = (LinearLayout) findViewById(R.id.number1);
        LinearLayout colorstxtvw = (LinearLayout) findViewById(R.id.color1);
        LinearLayout familytxtvw = (LinearLayout) findViewById(R.id.family1);
        LinearLayout Phrasestxtvw = (LinearLayout) findViewById(R.id.phrases1);


        alphatextview.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent devIntent = new Intent(MainActivity.this, Alphabets.class);
                startActivity(devIntent);
            }
        });
        if (alphatextview != null) {
            alphatextview.setOnClickListener(new View.OnClickListener() {
                // The code in this method will be executed when the numbers View is clicked on.
                @Override
                public void onClick(View view) {
                    Intent devIntent = new Intent(MainActivity.this, Alphabets.class);
                    startActivity(devIntent);
                }
            });
        }
        numtextview.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent devIntent = new Intent(MainActivity.this, NumberActivity.class);
                startActivity(devIntent);
            }
        });
        if (numtextview != null) {
            numtextview.setOnClickListener(new View.OnClickListener() {
                // The code in this method will be executed when the numbers View is clicked on.
                @Override
                public void onClick(View view) {
                    Intent devIntent = new Intent(MainActivity.this, NumberActivity.class);
                    startActivity(devIntent);
                }
            });
        }

        colorstxtvw.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent devIntent = new Intent(MainActivity.this, ColorsActivity.class);
                startActivity(devIntent);
            }
        });
        if (colorstxtvw != null) {
            colorstxtvw.setOnClickListener(new View.OnClickListener() {
                // The code in this method will be executed when the numbers View is clicked on.
                @Override
                public void onClick(View view) {
                    Intent devIntent = new Intent(MainActivity.this, ColorsActivity.class);
                    startActivity(devIntent);
                }
            });
        }

        familytxtvw.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent devIntent = new Intent(MainActivity.this, FamilyActivity.class);
                startActivity(devIntent);
            }
        });
        if (familytxtvw != null) {
            familytxtvw.setOnClickListener(new View.OnClickListener() {
                // The code in this method will be executed when the numbers View is clicked on.
                @Override
                public void onClick(View view) {
                    Intent devIntent = new Intent(MainActivity.this, FamilyActivity.class);
                    startActivity(devIntent);
                }
            });
        }

        Phrasestxtvw.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent devIntent = new Intent(MainActivity.this, PhrasesActivity.class);
                startActivity(devIntent);
            }
        });
        if (Phrasestxtvw != null) {
            Phrasestxtvw.setOnClickListener(new View.OnClickListener() {
                // The code in this method will be executed when the numbers View is clicked on.
                @Override
                public void onClick(View view) {
                    Intent devIntent = new Intent(MainActivity.this, PhrasesActivity.class);
                    startActivity(devIntent);
                }
            });
        }

    }
}
