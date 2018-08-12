package com.example.shara.kannadalanguage;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class NumberActivity extends AppCompatActivity {
    private MediaPlayer mMediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_number);
        ArrayList<Kannada> arraylst = new ArrayList<Kannada>();
        arraylst.add(new Kannada("one",R.drawable.ic_launcher_background,"ಒಂದು"));
        arraylst.add(new Kannada("two",R.drawable.ic_launcher_background,"ಎರಡು"));
        arraylst.add(new Kannada("three",R.drawable.ic_launcher_background,"ಮೂರೂ "));
        arraylst.add(new Kannada("four",R.drawable.ic_launcher_background,"ನಾಲ್ಕು"));
        arraylst.add(new Kannada("five",R.drawable.ic_launcher_background,"ಐದು"));
        arraylst.add(new Kannada("six",R.drawable.ic_launcher_background,"ಆರು"));
        arraylst.add(new Kannada("seven",R.drawable.ic_launcher_background,"ಏಳು"));
        arraylst.add(new Kannada("eight",R.drawable.ic_launcher_background,"ಎಂಟು"));
        arraylst.add(new Kannada("nine",R.drawable.ic_launcher_background,"ಒಂಬತ್ತು"));
        arraylst.add(new Kannada("ten",R.drawable.ic_launcher_background,"ಹತ್ತು"));
        KannadaAdapter musadp = new KannadaAdapter(this,arraylst);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(musadp);
         listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                mMediaPlayer = MediaPlayer.create(NumberActivity.this, R.raw.first);
                mMediaPlayer.start();
            }



        });
    }
}
