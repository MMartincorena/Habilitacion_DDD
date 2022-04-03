package domain.entrenador_Personalizado.command;

import co.com.sofka.domain.generic.Command;
import domain.entrenador_Personalizado.valor.Precio;
import domain.entrenador_Personalizado.valor.VehiculoId;

public class AgregarPrecio extends Command {

    private final VehiculoId vehiculoId;
    private final Precio precio;

    public AgregarPrecio(VehiculoId vehiculoId, Precio precio) {
        this.vehiculoId = vehiculoId;
        this.precio = precio;
    }

    public VehiculoId getVehiculoId() {
        return vehiculoId;
    }

    public Precio getPrecio() {
        return precio;
    }
}
