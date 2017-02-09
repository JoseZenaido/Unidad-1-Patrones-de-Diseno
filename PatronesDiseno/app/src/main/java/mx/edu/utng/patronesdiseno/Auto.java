package mx.edu.utng.patronesdiseno;

/**
 * Created by ZENAIDO-PC on 13/09/2016.
 */
public class Auto implements Clonable {
    private String modelo;
    private  String color;
    private  String tipo;
    private String ano;
    private String combustible;

    public Auto(){
        this.modelo = "";
        this.tipo = "";
        this.color = "";
        this.ano="";
        this.combustible="";
    }
    public Auto(String modelo, String tipo, String color, String ano,String combustible){
        this.modelo = modelo;
        this.tipo = tipo;
        this.color = color;
        this.ano=ano;
        this.combustible=combustible;
    }
    public Clonable clonable(){
        Auto clo = new Auto();
        clo.setModelo(modelo);
        clo.setTipo(tipo);
        clo.setColor(color);
        clo.setAno(ano);
        clo.setCombustible(combustible);
        return clo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTipo(){
        return  tipo;
    }
    public  void  setTipo(String tipo){
        this.tipo=tipo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getCombustible() {
        return combustible;
    }

    public void setCombustible(String combustible) {
        this.combustible = combustible;
    }
}
