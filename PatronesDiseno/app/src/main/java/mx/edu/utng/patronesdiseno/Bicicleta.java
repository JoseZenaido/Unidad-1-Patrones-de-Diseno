package mx.edu.utng.patronesdiseno;

/**
 * Created by ZENAIDO-PC on 13/09/2016.
 */
public class Bicicleta implements Clonable {
    private String marca;
    private  String color;
    private  String numSerie;
    private String rodada;

    public Bicicleta(){
        this.marca = "";
        this.color = "";
        this.numSerie ="";
        this.rodada="";
    }
    public Bicicleta(String marca, String color, String numSerie,String rodada){
        this.marca = marca;
        this.color = color;
        this.numSerie = numSerie;
        this.rodada=rodada;
    }
    public Clonable clonable(){
        Bicicleta clo = new Bicicleta();
        clo.setMarca(marca);
        clo.setColor(color);
        clo.setNumSerie(numSerie);
        clo.rodada=rodada;
        return clo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getNumSerie() {
        return numSerie;
    }

    public void setNumSerie(String numSerie) {
        this.numSerie = numSerie;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getRodada() {
        return rodada;
    }

    public void setRodada(String rodada) {
        this.rodada = rodada;
    }
}
