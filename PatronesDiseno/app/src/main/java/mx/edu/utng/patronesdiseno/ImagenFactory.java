package mx.edu.utng.patronesdiseno;


public class ImagenFactory {
    private Imagen imagen;

    public Imagen crear(String tipo){
        if(tipo == null) {
            return null;
        } if  (tipo.equalsIgnoreCase("CASA")){
            return new Casa();
        }else if (tipo.equalsIgnoreCase("ZAPATO")){
            return new Zapato();
        }else if (tipo.equalsIgnoreCase("CARRO")){
            return new Carro9();
        }else if (tipo.equalsIgnoreCase("GANZO")){
            return new Ganzo();
        }

        return null;
    }
}
