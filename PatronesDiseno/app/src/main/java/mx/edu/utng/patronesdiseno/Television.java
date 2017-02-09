package mx.edu.utng.patronesdiseno;

/**
 * Created by ZENAIDO-PC on 13/09/2016.
 */
public class Television implements Clonable {
    private String marca;
    private  String tamano;
    private  String intensidad;
    private  String brillantez;

    public Television(){
        this.tamano = "";
        this.marca = "";
        this.intensidad = "";
        this.brillantez="";
    }
    public Television(String marca, String tamano, String intensidad,String brillantez){
        this.marca = marca;
        this.tamano = tamano;
        this.intensidad = intensidad;
        this.brillantez=brillantez;
    }
    public Clonable clonable(){
        Television clo = new Television();
        clo.setMarca(marca);
        clo.setTamano(tamano);
        clo.setIntensidad(intensidad);
        clo.setBrillantez(brillantez);
        return clo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTamano() {
        return tamano;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }

    public String getIntensidad() {
        return intensidad;
    }

    public void setIntensidad(String intensidad) {
        this.intensidad = intensidad;
    }

    public String getBrillantez() {
        return brillantez;
    }

    public void setBrillantez(String brillantez) {
        this.brillantez = brillantez;
    }
}
