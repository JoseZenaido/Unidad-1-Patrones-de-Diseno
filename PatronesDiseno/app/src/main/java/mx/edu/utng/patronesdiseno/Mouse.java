package mx.edu.utng.patronesdiseno;

/**
 * Created by ZENAIDO-PC
 */
public class Mouse {
    private String marca;
    private String modelo;
    private String color;
    private String alimentacion;

    private static Mouse unicaMouse;


    private Mouse(){

        this.marca="";
        this.modelo="";
        this.color="";
        this.alimentacion="";
    }


    public static Mouse getUnicaInstancia() {
        if(unicaMouse ==null){
            unicaMouse = new Mouse();
        }
        return unicaMouse;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getAlimentacion() {
        return alimentacion;
    }

    public void setAlimentacion(String alimentacion) {
        this.alimentacion = alimentacion;
    }

    public static Mouse getUnicaMouse() {
        return unicaMouse;
    }

    public static void setUnicaMouse(Mouse unicaMouse) {
        Mouse.unicaMouse = unicaMouse;
    }
}
