package domain.usuario.entity;

import co.com.sofka.domain.generic.Entity;
import domain.generic.Caracteristicas;
import domain.usuario.value.MetasId;
import domain.usuario.value.Historial;
import domain.usuario.value.Plan;


public class Metas_Entity extends Entity<MetasId> {

    private Plan plan;
    private Caracteristicas caracteristicas;
    private Historial historial;

    public Metas_Entity(MetasId metasId, Plan plan, Caracteristicas caracteristicas, Historial historial) {
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
