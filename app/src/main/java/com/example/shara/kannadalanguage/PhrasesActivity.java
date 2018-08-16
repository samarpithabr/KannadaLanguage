package com.example.shara.kannadalanguage;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {
    private MediaPlayer mMediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phrases);
        final ArrayList<Kannada> arraylst = new ArrayList<Kannada>();
        arraylst.add(new Kannada(getString(R.string.my), R.drawable.loud, getString(R.string.nanna), R.raw.ramu));
        arraylst.add(new Kannada(getString(R.string.how), R.drawable.loud, getString(R.string.edu), R.raw.rupayee));
        arraylst.add(new Kannada(getString(R.string.wh), R.drawable.loud, getString(R.string.nimma), R.raw.hesaru));
        arraylst.add(new Kannada(getString(R.string.where), R.drawable.loud, getString(R.string.neevu), R.raw.vasavidhiri));
        arraylst.add(new Kannada(getString(R.string.plsd), R.drawable.loud, getString(R.string.nimmannu), R.raw.santhosha));
        arraylst.add(new Kannada(getString(R.string.hw), R.drawable.loud, getString(R.string.eddhu), R.raw.edhe));
        arraylst.add(new Kannada(getString(R.string.dodo), R.drawable.loud, getString(R.string.neevur), R.raw.mathadthira));
        arraylst.add(new Kannada(getString(R.string.lng), R.drawable.loud, getString(R.string.thu), R.raw.kanisalilla));
        arraylst.add(new Kannada(getString(R.string.esc), R.drawable.loud, getString(R.string.nodide), R.raw.nodidhe));
        arraylst.add(new Kannada(getString(R.string.sry), R.drawable.loud, getString(R.string.khs), R.raw.kshamisu));
        KannadaAdapter musadp = new KannadaAdapter(this, arraylst);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(musadp);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Kannada arylst = arraylst.get(position);
                mMediaPlayer = MediaPlayer.create(PhrasesActivity.this, arylst.getAudioId());
                mMediaPlayer.start();
            }


        });
    }
}
