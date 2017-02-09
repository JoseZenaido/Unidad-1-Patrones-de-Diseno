package mx.edu.utng.patronesdiseno;

/**
 * Created by ZENAIDO-PC on 01/02/2017.
 */
public class Botella {
    private String marca;
    private String tamano;
    private String contenido;
    private String tamanoXPorcion;
    private String porcionXEnvase;
    private String proteina;
    private String grasa;


    private static Botella  botella;

    public static Botella getBotella() {
        if (botella ==null){
            botella = new Botella();
        }
        return botella;
    }

    public Botella() {
        this.marca = "";
        this.tamano = "";
        this.contenido = "";
        this.tamanoXPorcion = "";
        this.porcionXEnvase = "";
        this.proteina = "";
        this.grasa = "";

    }

    public String getTamano() {
        return tamano;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTamanoXPorcion() {
        return tamanoXPorcion;
    }

    public void setTamanoXPorcion(String tamanoXPorcion) {
        this.tamanoXPorcion = tamanoXPorcion;
    }

    public String getPorcionXEnvase() {
        return porcionXEnvase;
    }

    public void setPorcionXEnvase(String porcionXEnvase) {
        this.porcionXEnvase = porcionXEnvase;
    }

    public String getProteina() {
        return proteina;
    }

    public void setProteina(String proteina) {
        this.proteina = proteina;
    }

    public String getGrasa() {
        return grasa;
    }

    public void setGrasa(String grasa) {
        this.grasa = grasa;
    }

    public static void setBotella(Botella botella) {
        Botella.botella = botella;
    }
}
