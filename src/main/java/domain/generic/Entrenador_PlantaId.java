package domain.generic;

import co.com.sofka.domain.generic.Identity;

public class Entrenador_PlantaId extends Identity {
    private Entrenador_PlantaId(String id){
        super(id);
    }

    public Entrenador_PlantaId() {
    }

    public Entrenador_PlantaId of(String id){
        return  new Entrenador_PlantaId(id);
    }

}
