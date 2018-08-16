package com.example.shara.kannadalanguage;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {
    private MediaPlayer mMediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_family);
        final ArrayList<Kannada> arraylst = new ArrayList<Kannada>();
        arraylst.add(new Kannada(getString(R.string.grand), R.drawable.loud, getString(R.string.tata), R.raw.thatha));
        arraylst.add(new Kannada(getString(R.string.gmo), R.drawable.loud, getString(R.string.ajj), R.raw.ajji));
        arraylst.add(new Kannada(getString(R.string.fa), R.drawable.loud, getString(R.string.apa), R.raw.appa));
        arraylst.add(new Kannada(getString(R.string.mom), R.drawable.loud, getString(R.string.rathna), R.raw.amma));
        arraylst.add(new Kannada(getString(R.string.elsis), R.drawable.loud, getString(R.string.sis), R.raw.akka));
        arraylst.add(new Kannada(getString(R.string.ysis), R.drawable.loud, getString(R.string.than), R.raw.thangi));
        arraylst.add(new Kannada(getString(R.string.elbro), R.drawable.loud, getString(R.string.anna), R.raw.anna));
        arraylst.add(new Kannada(getString(R.string.ybro), R.drawable.loud, getString(R.string.tamma), R.raw.thamma));
        arraylst.add(new Kannada(getString(R.string.muncle), R.drawable.loud, getString(R.string.mamaa), R.raw.mama));
        arraylst.add(new Kannada(getString(R.string.sisin), R.drawable.loud, getString(R.string.ath), R.raw.atthige));
        arraylst.add(new Kannada(getString(R.string.br), R.drawable.loud, getString(R.string.maid), R.raw.maidhna));
        arraylst.add(new Kannada(getString(R.string.dau), R.drawable.loud, getString(R.string.daul), R.raw.sose));
        arraylst.add(new Kannada(getString(R.string.sinlaw), R.drawable.loud, getString(R.string.ali), R.raw.aliya));
        arraylst.add(new Kannada(getString(R.string.fatlaw), R.drawable.loud, getString(R.string.mava), R.raw.mava));
        arraylst.add(new Kannada(getString(R.string.momlaw), R.drawable.loud, getString(R.string.atthe), R.raw.athe));
        KannadaAdapter musadp = new KannadaAdapter(this, arraylst);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(musadp);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Kannada arylst = arraylst.get(position);
                mMediaPlayer = MediaPlayer.create(FamilyActivity.this, arylst.getAudioId());
                mMediaPlayer.start();
            }


        });

    }
}
