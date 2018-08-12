package com.example.shara.kannadalanguage;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_family);
        ArrayList<Kannada> arraylst = new ArrayList<Kannada>();
        arraylst.add(new Kannada("Grand Father",R.drawable.ic_launcher_background,"ತಾತ"));
        arraylst.add(new Kannada("Grand Mother",R.drawable.ic_launcher_background,"ಅಜ್ಜಿ"));
        arraylst.add(new Kannada("Father",R.drawable.ic_launcher_background,"ಅಪ್ಪ "));
        arraylst.add(new Kannada("Mother",R.drawable.ic_launcher_background,"ಅಮ್ಮ"));
        arraylst.add(new Kannada("Elder Sister",R.drawable.ic_launcher_background,"ಅಕ್ಕ"));
        arraylst.add(new Kannada("Younger Sister",R.drawable.ic_launcher_background,"ತಂಗಿ"));
        arraylst.add(new Kannada("Elder Brother",R.drawable.ic_launcher_background,"ಅಣ್ಣ"));
        arraylst.add(new Kannada("Younger Brother",R.drawable.ic_launcher_background,"ತಮ್ಮ"));
        arraylst.add(new Kannada("Maternal Uncle",R.drawable.ic_launcher_background,"ಮಾಮ"));
        arraylst.add(new Kannada("Paternle Uncle",R.drawable.ic_launcher_background,"ದೊಡ್ಡಪ್ಪ"));
        arraylst.add(new Kannada("Siter-in-law",R.drawable.ic_launcher_background,"ಅತ್ತಿಗೆ"));
        arraylst.add(new Kannada("Brother-in-law",R.drawable.ic_launcher_background,"ಮೈದ್ನ"));
        arraylst.add(new Kannada("Daughter-in-law",R.drawable.ic_launcher_background,"ಸೊಸೆ"));
        arraylst.add(new Kannada("Son-in-law",R.drawable.ic_launcher_background,"ಅಳಿಯ"));
        arraylst.add(new Kannada("Father-in-law",R.drawable.ic_launcher_background,"ಮಾವ"));
        arraylst.add(new Kannada("Mother-in-law",R.drawable.ic_launcher_background,"ಅತ್ತೆ"));
        KannadaAdapter musadp = new KannadaAdapter(this,arraylst);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(musadp);
    }
}
