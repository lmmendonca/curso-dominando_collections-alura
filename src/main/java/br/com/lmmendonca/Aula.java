package br.com.lmmendonca;


public class Aula implements Comparable<Aula> {

    private String  aula;
    private Integer tempo;


    public Aula(String aula, Integer tempo) {
        this.aula = aula;
        this.tempo = tempo;
    }

    public String getAula() {
        return aula;
    }

    public Integer getTempo() {
        return tempo;
    }

    @Override
    public int compareTo(Aula o) {
        return this.aula.compareTo(o.getAula());
    }

    @Override
    public String toString() {
        return "[AULA: " + this.aula + ", TEMPO: " + this.tempo + "]";
    }
}

