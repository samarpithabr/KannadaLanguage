package com.samarpitha.shara.kannadalanguage;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class Alphabets extends AppCompatActivity {
    private MediaPlayer mMediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number);
        final ArrayList<Kannada> arraylst = new ArrayList<Kannada>();
        arraylst.add(new Kannada(getString(R.string.smalla), R.drawable.loud, getString(R.string.ah), R.raw.ca));
        arraylst.add(new Kannada(getString(R.string.ahh), R.drawable.loud, getString(R.string.ahhha), R.raw.caah));
        arraylst.add(new Kannada(getString(R.string.ii), R.drawable.loud, getString(R.string.e), R.raw.ce));
        arraylst.add(new Kannada(getString(R.string.i), R.drawable.loud, getString(R.string.ee), R.raw.cee));
        arraylst.add(new Kannada(getString(R.string.uu), R.drawable.loud, getString(R.string.u), R.raw.cu));
        arraylst.add(new Kannada(getString(R.string.uuu), R.drawable.loud, getString(R.string.oooh), R.raw.cuu));
        arraylst.add(new Kannada(getString(R.string.ruu), R.drawable.loud, getString(R.string.r), R.raw.cru));
        arraylst.add(new Kannada(getString(R.string.ruuu), R.drawable.loud, getString(R.string.ruh), R.raw.cruuu));
        arraylst.add(new Kannada(getString(R.string.eee), R.drawable.loud, getString(R.string.aah), R.raw.ceh));
        arraylst.add(new Kannada(getString(R.string.eeeE), R.drawable.loud, getString(R.string.aaa), R.raw.cehhhhhh));
        arraylst.add(new Kannada(getString(R.string.aiai), R.drawable.loud, getString(R.string.ai), R.raw.ci));
        arraylst.add(new Kannada(getString(R.string.oo), R.drawable.loud, getString(R.string.oov), R.raw.co));
        arraylst.add(new Kannada(getString(R.string.As), R.drawable.loud, getString(R.string.aou), R.raw.cooo));
        arraylst.add(new Kannada(getString(R.string.auau), R.drawable.loud, getString(R.string.ooo), R.raw.cauh));
        arraylst.add(new Kannada(getString(R.string.mm), R.drawable.loud, getString(R.string.ahm), R.raw.cahm));
        arraylst.add(new Kannada(getString(R.string.ha), R.drawable.loud, getString(R.string.ahaha), R.raw.chaha));
        arraylst.add(new Kannada(getString(R.string.kak), R.drawable.loud, getString(R.string.hak), R.raw.ka));
        arraylst.add(new Kannada(getString(R.string.khakhaa), R.drawable.loud, getString(R.string.gag), R.raw.kha));
        arraylst.add(new Kannada(getString(R.string.gaa), R.drawable.loud, getString(R.string.gaga), R.raw.ga));
        arraylst.add(new Kannada(getString(R.string.ghaa), R.drawable.loud, getString(R.string.ghagha), R.raw.gha));
        arraylst.add(new Kannada(getString(R.string.nganga), R.drawable.loud, getString(R.string.jnana), R.raw.jna));
        arraylst.add(new Kannada(getString(R.string.cha), R.drawable.loud, getString(R.string.chahaa), R.raw.cha));
        arraylst.add(new Kannada(getString(R.string.Cha), R.drawable.loud, getString(R.string.chaha), R.raw.ccha));
        arraylst.add(new Kannada(getString(R.string.ja), R.drawable.loud, getString(R.string.jaj), R.raw.ja));
        arraylst.add(new Kannada(getString(R.string.jha), R.drawable.loud, getString(R.string.jhahj), R.raw.jha));
        arraylst.add(new Kannada(getString(R.string.ja), R.drawable.loud, getString(R.string.naha), R.raw.cna));
        arraylst.add(new Kannada(getString(R.string.ta), R.drawable.loud, getString(R.string.tu), R.raw.ta));
        arraylst.add(new Kannada(getString(R.string.tha), R.drawable.loud, getString(R.string.Tahtah), R.raw.taa));
        arraylst.add(new Kannada(getString(R.string.da), R.drawable.loud, getString(R.string.dada), R.raw.da));
        arraylst.add(new Kannada(getString(R.string.dha), R.drawable.loud, getString(R.string.daaa), R.raw.cda));
        arraylst.add(new Kannada(getString(R.string.na), R.drawable.loud, getString(R.string.nan), R.raw.nna));
        arraylst.add(new Kannada(getString(R.string.taa), R.drawable.loud, getString(R.string.taaa), R.raw.cta));
        arraylst.add(new Kannada(getString(R.string.thaha), R.drawable.loud, getString(R.string.thath), R.raw.ttha));
        arraylst.add(new Kannada(getString(R.string.dad), R.drawable.loud, getString(R.string.dah), R.raw.dda));
        arraylst.add(new Kannada(getString(R.string.dhada), R.drawable.loud, getString(R.string.dhaa), R.raw.ddha));
        arraylst.add(new Kannada(getString(R.string.nana), R.drawable.loud, getString(R.string.nah), R.raw.na));
        arraylst.add(new Kannada(getString(R.string.pap), R.drawable.loud, getString(R.string.papah), R.raw.pa));
        arraylst.add(new Kannada(getString(R.string.phaa), R.drawable.loud, getString(R.string.phapa), R.raw.pha));
        arraylst.add(new Kannada(getString(R.string.bab), R.drawable.loud, getString(R.string.baa), R.raw.ba));
        arraylst.add(new Kannada(getString(R.string.bhaba), R.drawable.loud, getString(R.string.bha), R.raw.bha));
        arraylst.add(new Kannada(getString(R.string.mama), R.drawable.loud, getString(R.string.mah), R.raw.ma));
        arraylst.add(new Kannada(getString(R.string.yay), R.drawable.loud, getString(R.string.yah), R.raw.ya));
        arraylst.add(new Kannada(getString(R.string.ra), R.drawable.loud, getString(R.string.rah), R.raw.ra));
        arraylst.add(new Kannada(getString(R.string.lal), R.drawable.loud, getString(R.string.lah), R.raw.la));
        arraylst.add(new Kannada(getString(R.string.waw), R.drawable.loud, getString(R.string.vah), R.raw.va));
        arraylst.add(new Kannada(getString(R.string.sha), R.drawable.loud, getString(R.string.sah), R.raw.sha));
        arraylst.add(new Kannada(getString(R.string.shah), R.drawable.loud, getString(R.string.shahah), R.raw.shha));
        arraylst.add(new Kannada(getString(R.string.saa), R.drawable.loud, getString(R.string.saak), R.raw.sa));
        arraylst.add(new Kannada(getString(R.string.haa), R.drawable.loud, getString(R.string.haha), R.raw.haha));
        arraylst.add(new Kannada(getString(R.string.la), R.drawable.loud, getString(R.string.laak), R.raw.lla));
        KannadaAdapter musadp = new KannadaAdapter(this, arraylst);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(musadp);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Kannada arylst = arraylst.get(position);
                mMediaPlayer = MediaPlayer.create(Alphabets.this, arylst.getAudioId());
                mMediaPlayer.start();
            }


        });
    }
}

