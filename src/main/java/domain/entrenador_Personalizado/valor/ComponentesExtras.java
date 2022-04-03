package domain.entrenador_Personalizado.valor;

import co.com.sofka.domain.generic.ValueObject;


public class ComponentesExtras implements ValueObject<ComponentesExtras> {

    private final ComponentesExtras componentesExtras;

    public ComponentesExtras(ComponentesExtras componentesExtras) {
        this.componentesExtras = componentesExtras;
    }

    @Override
    public ComponentesExtras value() {
        return null;
    }
}
