package com.example.shara.kannadalanguage;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phrases);
        ArrayList<Kannada> arraylst = new ArrayList<Kannada>();
        arraylst.add(new Kannada("My Name is Ramu",R.drawable.ic_launcher_background,"ನನ್ನ ಹೆಸರು ರಾಮು"));
        arraylst.add(new Kannada("How much is this?",R.drawable.ic_launcher_background,"ಎಷ್ಟು ರೂಪಾಯಿ ಇದು?"));
        arraylst.add(new Kannada("what is your name?",R.drawable.ic_launcher_background,"ನೀವು ಹೆಸರೇನು "));
        arraylst.add(new Kannada("where do you live?",R.drawable.ic_launcher_background,"ನೀವು ಎಲ್ಲಿ ವಾಸವಿದ್ದಿರ"));
        arraylst.add(new Kannada("I can come tomorrow",R.drawable.ic_launcher_background,"ನಾನು ನಾಳೆ ಬರಬಹುದು"));
        arraylst.add(new Kannada("How far is this?",R.drawable.ic_launcher_background,"ಇದು ಎಷ್ಟು ದೂರ ಇದೆ"));
        arraylst.add(new Kannada("what time is it?",R.drawable.ic_launcher_background,"ಎಷ್ಟು ಹೊತ್ತಿಗೆ"));
        arraylst.add(new Kannada("I can agree with that",R.drawable.ic_launcher_background,"ನಾನು ಅದಕ್ಕೆ ಒಪ್ಪಬಲ್ಲೆ"));
        arraylst.add(new Kannada("I watched it",R.drawable.ic_launcher_background,"ನಾನು ನೋಡಿದೆ"));
        arraylst.add(new Kannada("I am Sorry",R.drawable.ic_launcher_background,"ನನ್ನನ್ನು ಕ್ಷಮಿಸಿ"));
        KannadaAdapter musadp = new KannadaAdapter(this,arraylst);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(musadp);
    }
}
