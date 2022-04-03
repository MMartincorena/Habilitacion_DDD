package domain.usuario.entity;

import domain.usuario.value.Caracteristicas;
import domain.usuario.value.Historial;
import domain.usuario.value.MetasId;
import domain.usuario.value.Plan;
import org.w3c.dom.Entity;

public class Metas extends Entity<MetasId> {

    private Plan plan;
    private Caracteristicas caracteristicas;
    private Historial historial;

    public Metas(Plan plan, Caracteristicas caracteristicas, Historial historial) {
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
