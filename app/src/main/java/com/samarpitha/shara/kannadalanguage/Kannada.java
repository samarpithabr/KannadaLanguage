package com.samarpitha.shara.kannadalanguage;

public class Kannada {
    private String englishWords;
    private int imageid;
    private String kannadaWords;
    private int audioId;

    public Kannada(String eWords, int imageKannada, String kWords, int aId) {
        audioId = aId;
        englishWords = eWords;
        imageid = imageKannada;
        kannadaWords = kWords;

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

    public int getAudioId() {
        return audioId;
    }
}
