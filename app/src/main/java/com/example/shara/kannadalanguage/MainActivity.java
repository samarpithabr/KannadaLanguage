package com.example.shara.kannadalanguage;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView numtextview= (TextView) findViewById(R.id.numberstxt);
        TextView colorstxtvw = (TextView) findViewById(R.id.colrstxt);
        TextView familytxtvw =(TextView) findViewById(R.id.familytxt);
        TextView Phrasestxtvw = (TextView) findViewById(R.id.phrasestxt);

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
