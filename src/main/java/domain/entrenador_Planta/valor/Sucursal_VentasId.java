package domain.entrenador_Planta.valor;

import co.com.sofka.domain.generic.Identity;

public class Sucursal_VentasId extends Identity {

    public Sucursal_VentasId(){
    }

    private Sucursal_VentasId(String id) {
        super(id);
    }

    public static Sucursal_VentasId of(String id) {
        return new Sucursal_VentasId(id);
    }

}
