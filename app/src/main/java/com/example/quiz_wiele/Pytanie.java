package com.example.quiz_wiele;

public class Pytanie {
    private int tekstPytania;
    private int[] odpowiedzi = new int[3];
    private boolean poprawnosc[] = new boolean[3];

    public Pytanie(int tekstPytania, int[] odpowiedzi, boolean[] poprawnosc) {
        this.tekstPytania = tekstPytania;
        this.odpowiedzi = odpowiedzi;
        this.poprawnosc = poprawnosc;
    }

    public int getTekstPytania() {
        return tekstPytania;
    }

    public int getOdpowiedzi(int i) {
        return odpowiedzi[i];
    }

    public boolean getPoprawnosc(int i) { return poprawnosc[i]; }
}
