package domain.entrenador_Personalizado.entity;

import co.com.sofka.domain.generic.Entity;
import domain.entrenador_Personalizado.value.GrupoId;
import domain.entrenador_Planta.Entrenador_Planta;
import domain.generic.Horario;
import domain.usuario.Usuario;

import java.util.Set;

public class Grupo_Entity extends Entity<GrupoId> {
    private final Set<Usuario> integrantes;
    private final Horario horario;
    private final Entrenador_Planta entrenador_planta;

    public Grupo_Entity(GrupoId grupoId, Set<Usuario> integrantes, Horario horario, Entrenador_Planta entrenador_planta) {
        super(grupoId);
        this.integrantes = integrantes;
        this.horario = horario;
        this.entrenador_planta = entrenador_planta;
    }


    public Set<Usuario> getIntegrantes() {
        return integrantes;
    }

    public Horario getHorario() {
        return horario;
    }

    public Entrenador_Planta getEntrenador_planta() {
        return entrenador_planta;
    }
}
