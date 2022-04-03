package domain.entrenador_Planta.event;

import co.com.sofka.domain.generic.DomainEvent;
import domain.entrenador_Planta.Salario;

public class SalarioModificado extends DomainEvent {
    private final Salario salario;


    public SalarioModificado(Salario salario) {
        super("domain.entrenador_planta.salariomodificado");
        this.salario = salario;
    }

    public Salario getSalario() {
        return salario;
    }
}
