package domain.generic;

import co.com.sofka.domain.generic.Entity;
import domain.usuario.value.FranquiciaId;

public class Franquicia_Entity extends Entity<FranquiciaId> {

    private Direccion direccion;
    private Ciudad ciudad;

    public Franquicia_Entity(FranquiciaId entityId, Direccion direccion, Ciudad ciudad) {
        super(entityId);
        this.direccion = direccion;
        this.ciudad = ciudad;
    }

    public Direccion Direccion() {
        return direccion;
    }

    public Ciudad Ciudad() {
        return ciudad;
    }
}
