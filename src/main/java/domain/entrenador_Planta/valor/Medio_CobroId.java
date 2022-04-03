package domain.entrenador_Planta.valor;

import co.com.sofka.domain.generic.Identity;

public class Medio_CobroId extends Identity {

    public Medio_CobroId(){

    }

    private Medio_CobroId(String id){
        super (id);
    }

    public static Medio_CobroId of (String id){
        return new Medio_CobroId(id);
    }
}
