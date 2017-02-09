package mx.edu.utng.patronesdiseno;

/**
 * Created by ZENAIDO-PC on 13/09/2016.
 */
public class Puerta implements Clonable {
    private String tamano;
    private  String color;
    private  String costo;
    private String material;

    public Puerta(){
        this.tamano = "";
        this.color = "";
        this.costo = "";
        this.material="";
    }
    public Puerta(String tamano, String color, String costo,String material){
        this.tamano = tamano;
        this.color = color;
        this.costo = costo;
        this.material=material;
    }
    public Clonable clonable(){
        Puerta clo = new Puerta();
        clo.setTamano(tamano);
        clo.setColor(color);
        clo.setCosto(costo);
        clo.setMaterial(material);
        return clo;
    }

    public String getTamano() {
        return tamano;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getCosto() {
        return costo;
    }

    public void setCosto(String costo) {
        this.costo = costo;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
}
