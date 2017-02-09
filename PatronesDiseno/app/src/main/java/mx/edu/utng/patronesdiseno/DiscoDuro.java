package mx.edu.utng.patronesdiseno;

/**
 * Created by ZENAIDO-PC on 01/02/2017.
 */
public class DiscoDuro {
    private String marca;
    private String  capacidad;
    private String sistemaArchivos;
    private String  tipo;
    private String unidad;




    private static DiscoDuro  discoDuro;

    public static DiscoDuro getDiscoDuro() {
        if (discoDuro ==null){
            discoDuro = new DiscoDuro();
        }
        return discoDuro;
    }

    public DiscoDuro() {
        this.marca = "";
        this.capacidad="";
        this.sistemaArchivos="";
        this.tipo="";
        this.unidad="";
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(String capacidad) {
        this.capacidad = capacidad;
    }

    public String getSistemaArchivos() {
        return sistemaArchivos;
    }

    public void setSistemaArchivos(String sistemaArchivos) {
        this.sistemaArchivos = sistemaArchivos;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getUnidad() {
        return unidad;
    }

    public void setUnidad(String unidad) {
        this.unidad = unidad;
    }

    public static void setDiscoDuro(DiscoDuro discoDuro) {
        DiscoDuro.discoDuro = discoDuro;
    }
}
