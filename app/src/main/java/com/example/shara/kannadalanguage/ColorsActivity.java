package com.example.shara.kannadalanguage;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colors);
        ArrayList<Kannada> arraylst = new ArrayList<Kannada>();
        arraylst.add(new Kannada("White",R.drawable.ic_launcher_background,"ಬಿಳಿ"));
        arraylst.add(new Kannada("Black",R.drawable.ic_launcher_background,"ಕಪ್ಪು"));
        arraylst.add(new Kannada("Red",R.drawable.ic_launcher_background,"ಕೆಂಪು "));
        arraylst.add(new Kannada("Yellow",R.drawable.ic_launcher_background,"ಹಳದಿ"));
        arraylst.add(new Kannada("Blue",R.drawable.ic_launcher_background,"ನೀಲಿ"));
        arraylst.add(new Kannada("Green",R.drawable.ic_launcher_background,"ಹಸಿರು"));
        arraylst.add(new Kannada("Orange",R.drawable.ic_launcher_background,"ಕೇಸರಿ"));
        arraylst.add(new Kannada("Purple",R.drawable.ic_launcher_background,"ನೇರಳೆ"));
        arraylst.add(new Kannada("Pink",R.drawable.ic_launcher_background,"ಗುಲಾಬಿ"));
        arraylst.add(new Kannada("Brown",R.drawable.ic_launcher_background,"ಕಂದು"));
        KannadaAdapter musadp = new KannadaAdapter(this,arraylst);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(musadp);
    }
}
