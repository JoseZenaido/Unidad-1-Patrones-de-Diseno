package mx.edu.utng.patronesdiseno;

/**
 * Created by ZENAIDO-PC
 */
public class Persona {
    private String nombre;
    private String edad;
    private String peso;
    private String estatura;
    private String enfermedad;
    private String localizacion;

    private static Persona unicaPersona;


    private Persona(){
        this.nombre="";
        this.edad="";
        this.peso="";
        this.estatura="";
        this.enfermedad="";
        this.localizacion="";
    }


    public static Persona getUnicaInstancia() {
        if(unicaPersona==null){
            unicaPersona = new Persona();
        }
        return unicaPersona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public String getEstatura() {
        return estatura;
    }

    public void setEstatura(String estatura) {
        this.estatura = estatura;
    }

    public String getEnfermedad() {
        return enfermedad;
    }

    public void setEnfermedad(String enfermedad) {
        this.enfermedad = enfermedad;
    }

    public String getLocalizacion() {
        return localizacion;
    }

    public void setLocalizacion(String localizacion) {
        this.localizacion = localizacion;
    }

    public static Persona getUnicaPersona() {
        return unicaPersona;
    }

    public static void setUnicaPersona(Persona unicaPersona) {
        Persona.unicaPersona = unicaPersona;
    }
}
