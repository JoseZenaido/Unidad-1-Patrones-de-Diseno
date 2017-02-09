package mx.edu.utng.patronesdiseno;

/**
 * Created by ZENAIDO-PC on 13/09/2016.
 */
public class Casa1 implements Clonable {
    private String tamano;
    private  String color;
    private  String ubicacion;
    private String material;

    public Casa1(){
        this.tamano = "";
        this.color = "";
        this.ubicacion ="";
        this.material="";
    }
    public Casa1(String tamano, String color, String ubicacion,String material){
        this.tamano = tamano;
        this.color = color;
        this.ubicacion = ubicacion;
        this.material=material;
    }
    public Clonable clonable(){
        Casa1 clo = new Casa1();
        clo.setTamano(tamano);
        clo.setColor(color);
        clo.setUbicacion(ubicacion);
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

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
}
