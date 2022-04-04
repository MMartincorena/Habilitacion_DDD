package domain.usuario.useCase;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import domain.generic.Direccion;
import domain.generic.Documento;
import domain.generic.Nombre;
import domain.generic.UsuarioId;
import domain.usuario.Usuario;
import domain.usuario.command.CrearUsuario;
import domain.usuario.event.UsuarioCreado;
import domain.usuario.value.Estado;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CrearUsuarioUseCaseTest {

    @Test
    void CrearUsuario(){
         UsuarioId usuarioId = UsuarioId.of("XXXX");
         Estado estado = new Estado(100, 180);
         Nombre nombre = new Nombre("Pa", "XX");
         Long numero = new Long (188);
         Direccion direccion = new Direccion("Kil 12",numero);
         Documento documento = new Documento("CI", 4587455);

    var command = new CrearUsuario(usuarioId, estado, nombre, direccion, documento);
    var useCase = new CrearUsuarioUseCase();


        var events = UseCaseHandler.getInstance()
                .syncExecutor(useCase, new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();

        //assert
        var event = (UsuarioCreado)events.get(0);
        Assertions.assertEquals("domain.usuario.usuariocreado", event.type);
        Estado estado1 = new Estado(100, 180);
        Assertions.assertEquals(estado1.value(),event.Estado().value());
        Nombre nombre1 = new Nombre("Pa", "XX");
        Assertions.assertEquals(nombre1.value(), event.Nombre().value());
        Long numero1 = new Long (188);
        Direccion direccion1 = new Direccion("Kil 12",numero);
        Assertions.assertEquals(direccion, event.Direccion());
        Documento documento1 = new Documento("CI", 4587455);
        Assertions.assertEquals(documento, event.Documento());
        Assertions.assertEquals("XXXX", event.aggregateRootId());




    }


}