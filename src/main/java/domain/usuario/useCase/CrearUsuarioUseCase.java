package domain.usuario.useCase;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import domain.usuario.Usuario;
import domain.usuario.command.CrearUsuario;

public class CrearUsuarioUseCase extends UseCase<RequestCommand<CrearUsuario>, ResponseEvents> {

    @Override
    public void executeUseCase(RequestCommand<CrearUsuario>input) {
        var command=input.getCommand();
        var usuario = new Usuario(command.UsuarioId(),
                command.Estado(),
                command.Nombre(),
                command.Direccion(),
                command.Documento());
        emit().onResponse(new ResponseEvents(usuario.getUncommittedChanges()));
    }
}
