package domain.entrenador_Personalizado.value;

import co.com.sofka.domain.generic.Identity;
import domain.generic.Entrenador_PlantaId;

public class GrupoId extends Identity {

    public GrupoId(String id) {
        super(id);
    }

    public GrupoId() {
    }

    public GrupoId of(String id){
        return  new GrupoId(id);
    }
}
