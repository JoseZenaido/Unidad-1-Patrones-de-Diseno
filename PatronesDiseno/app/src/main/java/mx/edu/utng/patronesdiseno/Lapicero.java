package mx.edu.utng.patronesdiseno;

/**
 * Created by ZENAIDO-PC on 01/02/2017.
 */
public class Lapicero {

    private String marca;
    private String  color;
    private String tamano;
    private String  exportador;
    private String calidad;

    private static Lapicero lapicero;

    public static Lapicero getLapicero() {
        if (lapicero ==null){
            lapicero = new Lapicero();
        }
        return lapicero;
    }

    public Lapicero() {
        this.marca = "";
        this.color="";
        this.tamano="";
        this.exportador="";
        this.calidad="";
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTamano() {
        return tamano;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }

    public String getExportador() {
        return exportador;
    }

    public void setExportador(String exportador) {
        this.exportador = exportador;
    }

    public String getCalidad() {
        return calidad;
    }

    public void setCalidad(String calidad) {
        this.calidad = calidad;
    }

    public static void setLapicero(Lapicero lapicero) {
        Lapicero.lapicero = lapicero;
    }
}
