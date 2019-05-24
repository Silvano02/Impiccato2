package com.example.silvano.impiccato;

public class Impiccato {
    private String parola;
    private char[] lettere;
    private char[] vuoto;
    private int vite = 6;

    public Impiccato(String parola) {
        this.parola = parola;
        this.lettere= parola.toCharArray();
        this.vuoto = new char[lettere.length];
        for (int i = 0; i < lettere.length; i++) {
            this.vuoto[i]= '*';
        }
    }

    public boolean haiVinto(){
        boolean ritorna = true;
        for (char lettra:vuoto) {
            if (lettra == '*'){
                ritorna = false;
            }
        }return ritorna;
    }

    public char[] getVuoto() {
        return vuoto;
    }

    public int getVite()  {
        return vite;
    }

    public void rimuoviVita()  {
        this.vite --;
    }

    public boolean inserisciLettera(char lettera)  {
        boolean ritorna = true;
        for (int i = 0; i < lettere.length ; i++) {
            if (lettere[i] == lettera) {
                vuoto[i]= lettere[i];
                ritorna = false;
            }
        }
        return ritorna;
    }

    public boolean insericiParola (String parola)  {
        boolean ritorna = false;
        if (parola.equals(this.parola)){
            for (int i = 0; i < lettere.length ; i++) {
                vuoto[i] = parola.charAt(i);
            }
        }else {
            ritorna = true;
        }
        return ritorna;
    }

    @Override
    public String toString() {
        String ritorna = new String();
        for (char lettera:vuoto) {
            ritorna += lettera;
        }
        return ritorna;
    }
}
