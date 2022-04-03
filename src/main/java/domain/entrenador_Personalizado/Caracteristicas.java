package domain.entrenador_Personalizado;

import co.com.sofka.domain.generic.Entity;
import domain.entrenador_Personalizado.valor.CaracteristicasId;
import domain.entrenador_Personalizado.valor.ComponentesExtras;

public class Caracteristicas extends Entity<CaracteristicasId> {

    protected ComponentesExtras componentesExtras;

    public Caracteristicas(CaracteristicasId entityId) {
        super(entityId);
    }

    /** Getters */
    public ComponentesExtras getComponentesExtras() {
        return componentesExtras;
    }
}
