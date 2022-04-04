package domain.entrenador_Planta.useCase;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import domain.entrenador_Planta.Entrenador_Planta;
import domain.entrenador_Planta.command.CrearE_Planta;


public class CrearE_PlantaUseCase extends UseCase<RequestCommand<CrearE_Planta>, ResponseEvents> {

    @Override
    public void executeUseCase(RequestCommand<CrearE_Planta> input) {
        var command = input.getCommand();
        var entrenador_planta = new Entrenador_Planta(command.getEntrenador_plantaId(), command.getNombre(), command.getDocumento(), command.getDireccion(), command.getSalario());
        emit().onResponse(new ResponseEvents(entrenador_planta.getUncommittedChanges()));
    }


}
