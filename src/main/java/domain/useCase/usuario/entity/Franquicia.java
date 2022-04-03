package domain.useCase.usuario.entity;

import co.com.sofka.domain.generic.Entity;
import domain.useCase.usuario.value.Direccion;
import domain.useCase.usuario.value.FranquiciaId;
import domain.useCase.usuario.value.Ciudad;

public class Franquicia extends Entity<FranquiciaId> {

    private Direccion direccion;
    private Ciudad ciudad;

    public Franquicia(FranquiciaId entityId, Direccion direccion, Ciudad ciudad) {
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
