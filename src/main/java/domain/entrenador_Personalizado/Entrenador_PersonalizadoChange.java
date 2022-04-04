package domain.entrenador_Personalizado;

import co.com.sofka.domain.generic.EventChange;
import domain.entrenador_Personalizado.event.E_PersonalizadoCreado;
import domain.entrenador_Personalizado.value.Comision;
import domain.generic.Direccion;
import domain.generic.Documento;
import domain.generic.Horario;
import domain.generic.Nombre;

import java.util.Set;

public class Entrenador_PersonalizadoChange extends EventChange {

    public Entrenador_PersonalizadoChange(Entrenador_Personalizado entrenador_personalizado ){

        apply((E_PersonalizadoCreado event) ->{
            entrenador_personalizado.nombre = event.getNombre();
            entrenador_personalizado.documento = event.getDocumento();
            entrenador_personalizado.direccion = event.getDireccion();
            entrenador_personalizado.comision = event.getComision();
            entrenador_personalizado.horarios = event.getHorarios();
        });

    }
}
