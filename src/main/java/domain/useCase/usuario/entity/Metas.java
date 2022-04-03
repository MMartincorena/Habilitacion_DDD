package domain.useCase.usuario.entity;

import co.com.sofka.domain.generic.Entity;
import domain.useCase.usuario.value.Caracteristicas;
import domain.useCase.usuario.value.MetasId;
import domain.useCase.usuario.value.Historial;
import domain.useCase.usuario.value.Plan;


public class Metas extends Entity<MetasId> {

    private Plan plan;
    private Caracteristicas caracteristicas;
    private Historial historial;

    public Metas(MetasId metasId, Plan plan, Caracteristicas caracteristicas, Historial historial) {
        super(metasId);
        this.plan = plan;
        this.caracteristicas = caracteristicas;
        this.historial = historial;
    }

    public Plan Plan(){
        return plan;
    }

    public Caracteristicas Caracteristicas() {
        return caracteristicas;
    }

    public Historial Historial() {
        return historial;
    }
}
