package domain.entrenador_Personalizado.valor;

import co.com.sofka.domain.generic.Identity;

public class CaracteristicasId extends Identity {

    public CaracteristicasId(){
    }

    private CaracteristicasId(String id) {
        super(id);
    }

    public static CaracteristicasId of(String id) {
        return new CaracteristicasId(id);
    }
}
