package domain.entrenador_Planta.useCase;

import co.com.sofka.business.generic.BusinessException;
import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import domain.entrenador_Planta.Entrenador_Planta;
import domain.entrenador_Planta.command.ModificarDocumento;


public class ModificarDocumentoUseCase extends UseCase<RequestCommand<ModificarDocumento>, ResponseEvents> {


    @Override
    public void executeUseCase(RequestCommand<ModificarDocumento> input) {
        var command = input.getCommand();
        var e_planta = Entrenador_Planta.from(command.getEntrenador_plantaId(),retrieveEvents());
        try{
            e_planta.modificarDocumento(command.getDocumento());
        } catch (IllegalArgumentException e){
            throw new BusinessException(command.getEntrenador_plantaId().value(), e.getMessage());
        }
        emit().onResponse(new ResponseEvents(e_planta.getUncommittedChanges()));
    }
}

