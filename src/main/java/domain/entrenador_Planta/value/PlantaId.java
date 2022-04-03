package domain.entrenador_Planta.value;

import co.com.sofka.domain.generic.Identity;


public class PlantaId extends Identity {

    public PlantaId(String id) {
        super(id);
    }

    public PlantaId() {
    }

    public static PlantaId of(String id) {
        return new PlantaId(id);
    }

}
