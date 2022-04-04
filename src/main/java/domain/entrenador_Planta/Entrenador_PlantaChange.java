package domain.entrenador_Planta;

import co.com.sofka.domain.generic.EventChange;
import domain.entrenador_Personalizado.event.E_PersonalizadoCreado;
import domain.entrenador_Planta.event.E_PlantaCreado;
import domain.entrenador_Planta.value.Salario;
import domain.generic.Direccion;
import domain.generic.Documento;
import domain.generic.Horario;
import domain.generic.Nombre;

import java.util.Set;

public class Entrenador_PlantaChange extends EventChange {

    public Entrenador_PlantaChange(Entrenador_Planta entrenador_planta){

        apply((E_PlantaCreado event) ->{
            entrenador_planta.nombre = event.getNombre();
            entrenador_planta.documento  = event.getDocumento();
            entrenador_planta.direccion = event.getDireccion();
            entrenador_planta.salario = event.getSalario();
            entrenador_planta.horarios = event.getHorarios();

        });
    }
}
