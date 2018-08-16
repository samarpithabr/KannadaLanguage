package com.samarpitha.shara.kannadalanguage;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {
    private MediaPlayer mMediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colors);
        final ArrayList<Kannada> arraylst = new ArrayList<Kannada>();
        arraylst.add(new Kannada(getString(R.string.w), R.drawable.loud, getString(R.string.b), R.raw.white));
        arraylst.add(new Kannada(getString(R.string.bck), R.drawable.loud, getString(R.string.kapp), R.raw.kappu));
        arraylst.add(new Kannada(getString(R.string.red), R.drawable.loud, getString(R.string.kem), R.raw.kempu));
        arraylst.add(new Kannada(getString(R.string.yel), R.drawable.loud, getString(R.string.hal), R.raw.haladi));
        arraylst.add(new Kannada(getString(R.string.blu), R.drawable.loud, getString(R.string.neeli), R.raw.neeli));
        arraylst.add(new Kannada(getString(R.string.grn), R.drawable.loud, getString(R.string.has), R.raw.hasiru));
        arraylst.add(new Kannada(getString(R.string.or), R.drawable.loud, getString(R.string.kes), R.raw.kesari));
        arraylst.add(new Kannada(getString(R.string.pur), R.drawable.loud, getString(R.string.nera), R.raw.nerale));
        arraylst.add(new Kannada(getString(R.string.pnk), R.drawable.loud, getString(R.string.gu), R.raw.gulabi));
        arraylst.add(new Kannada(getString(R.string.brn), R.drawable.loud, getString(R.string.kan), R.raw.kandu));
        KannadaAdapter musadp = new KannadaAdapter(this, arraylst);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(musadp);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Kannada arylst = arraylst.get(position);
                mMediaPlayer = MediaPlayer.create(ColorsActivity.this, arylst.getAudioId());
                mMediaPlayer.start();
            }


        });
    }
}
