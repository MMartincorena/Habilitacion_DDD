package domain.usuario.useCase;

import co.com.sofka.business.generic.BusinessException;
import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import domain.usuario.Usuario;

import domain.usuario.command.ModificarNombre;

public class ModificarNombreUseCase extends UseCase<RequestCommand<ModificarNombre>, ResponseEvents> {

    @Override
    public void executeUseCase(RequestCommand<ModificarNombre> input) {
        var command = input.getCommand();
        var usuario = Usuario.from(command.getUsuarioId(), retrieveEvents());
        try {
            usuario.modificarNombre(command.getNombre());
        } catch (IllegalArgumentException e) {
            throw new BusinessException(command.getUsuarioId().value(), e.getMessage());
        }
        emit().onResponse(new ResponseEvents(usuario.getUncommittedChanges()));
    }



}
