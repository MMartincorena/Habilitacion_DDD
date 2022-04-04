package domain.entrenador_Planta.useCase;

import co.com.sofka.business.generic.BusinessException;
import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import domain.entrenador_Planta.Entrenador_Planta;
import domain.entrenador_Planta.command.EliminarE_Planta;

public class EliminarE_PlantaUseCase extends UseCase<RequestCommand<EliminarE_Planta>, ResponseEvents> {

    @Override
    public void executeUseCase(RequestCommand<EliminarE_Planta> input) {
        var command = input.getCommand();
        var entrenador_planta = Entrenador_Planta.from(command.getEntrenador_plantaId(), retrieveEvents());
        try {
            entrenador_planta.eliminarE_Planta(command.getEntrenador_plantaId());

        } catch (IllegalArgumentException e) {
            throw new BusinessException(command.getEntrenador_plantaId().value(), e.getMessage());
        }
        emit().onResponse(new ResponseEvents(entrenador_planta.getUncommittedChanges()));
    }
}
