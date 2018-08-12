package com.example.shara.kannadalanguage;

import android.media.Image;

public class Kannada {
    private String englishWords;
    private int imageid;
    private String kannadaWords;
     public Kannada(String eWords,int imageKannada,String kWords){
         englishWords=eWords;
         imageid=imageKannada;
         kannadaWords=kWords;

     }

    public int getImageid() {
        return imageid;
    }

    public String getEnglishWords() {
        return englishWords;
    }

    public String getKannadaWords() {
        return kannadaWords;
    }
}
