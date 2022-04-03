package domain.entrenador_Planta.command;

import co.com.sofka.domain.generic.Command;
import domain.entrenador_Planta.Salario;
import domain.generic.Entrenador_PlantaId;

public class ModificarSalario extends Command {
    private final Entrenador_PlantaId entrenador_plantaId;
    private final Salario salario;


    public ModificarSalario(Entrenador_PlantaId entrenador_plantaId, Salario salario) {
        this.entrenador_plantaId = entrenador_plantaId;
        this.salario = salario;
    }

    public Entrenador_PlantaId getEntrenador_plantaId() {
        return entrenador_plantaId;
    }

    public Salario getSalario() {
        return salario;
    }
}
