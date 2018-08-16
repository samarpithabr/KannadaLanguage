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
        final ArrayList<Kannada> arraylst = new ArrayList<Kannada>();
        arraylst.add(new Kannada(getString(R.string.o), R.drawable.loud, getString(R.string.on), R.raw.one));
        arraylst.add(new Kannada(getString(R.string.tw), R.drawable.loud, getString(R.string.er), R.raw.two));
        arraylst.add(new Kannada(getString(R.string.thr), R.drawable.loud, getString(R.string.moo), R.raw.three));
        arraylst.add(new Kannada(getString(R.string.fr), R.drawable.loud, getString(R.string.nal), R.raw.foor));
        arraylst.add(new Kannada(getString(R.string.fv), R.drawable.loud, getString(R.string.aid), R.raw.five));
        arraylst.add(new Kannada(getString(R.string.si), R.drawable.loud, getString(R.string.ar), R.raw.six));
        arraylst.add(new Kannada(getString(R.string.sev), R.drawable.loud, getString(R.string.elu), R.raw.svn));
        arraylst.add(new Kannada(getString(R.string.eg), R.drawable.loud, getString(R.string.ent), R.raw.eight));
        arraylst.add(new Kannada(getString(R.string.nin), R.drawable.loud, getString(R.string.om), R.raw.nine));
        arraylst.add(new Kannada(getString(R.string.t), R.drawable.loud, getString(R.string.hat), R.raw.ten));
        KannadaAdapter musadp = new KannadaAdapter(this, arraylst);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(musadp);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Kannada arylst = arraylst.get(position);
                mMediaPlayer = MediaPlayer.create(NumberActivity.this, arylst.getAudioId());
                mMediaPlayer.start();
            }


        });
    }
}
