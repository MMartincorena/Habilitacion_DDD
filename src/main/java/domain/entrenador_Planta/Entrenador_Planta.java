package domain.entrenador_Planta;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import domain.entrenador_Planta.event.E_PlantaCreado;
import domain.entrenador_Planta.value.Salario;
import domain.generic.*;
import domain.usuario.event.DocumentoModificado;
import domain.usuario.event.NombreModificado;


import javax.print.Doc;
import java.util.List;
import java.util.Set;

public class Entrenador_Planta extends AggregateEvent<Entrenador_PlantaId> {
    protected Nombre nombre;
    protected Documento documento;
    protected Direccion direccion;
    protected Salario salario;
    protected Set<Horario> horarios;


    public static Entrenador_Planta from(Entrenador_PlantaId entrenador_plantaId, List<DomainEvent> events){
        var entrenador_planta = new Entrenador_Planta(entrenador_plantaId);
        events.forEach(entrenador_planta::applyEvent);
        return entrenador_planta;
    }

    public Entrenador_Planta(Entrenador_PlantaId entrenador_plantaId, Nombre nombre, Documento documento, Direccion direccion, Salario salario){
        super(entrenador_plantaId);
        subscribe(new Entrenador_PlantaChange(this));
    }


    // CREAR Entrenador_Planta
    public Entrenador_Planta(Entrenador_PlantaId entrenador_PlantaId) {
        super(entrenador_PlantaId);
        appendChange(new E_PlantaCreado(nombre, documento, direccion, salario, horarios)).apply();
    }






    public Nombre getNombre() {
        return nombre;
    }

    public Documento getDocumento() {
        return documento;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public Salario getSalario() {
        return salario;
    }

    public Set<Horario> getHorarios() {
        return horarios;
    }

    public void modificarNombre() {
    }


    public void modificarDocumento(Documento documento) {
        appendChange(new DocumentoModificado(documento)).apply();
    }
}
