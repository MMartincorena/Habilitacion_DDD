package domain.usuario.useCase;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.domain.generic.DomainEvent;
import domain.generic.Direccion;
import domain.generic.Documento;
import domain.generic.Nombre;
import domain.generic.UsuarioId;
import domain.usuario.command.ModificarNombre;
import domain.usuario.event.NombreModificado;
import domain.usuario.event.UsuarioCreado;
import domain.usuario.value.Estado;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class ModificarNombreUseCaseTest {

    @Mock
    DomainEventRepository repository;

    @Test
    void modificarNombre(){
        UsuarioId usuarioId = UsuarioId.of("XXXX");
        Nombre nombre = new Nombre("Pa", "XX");

    var command = new ModificarNombre(usuarioId, nombre);
    Mockito.when(repository.getEventsBy(null)).thenReturn(events());

    var useCase = new ModificarNombreUseCase();
    useCase.addRepository(repository);

        var events = UseCaseHandler.getInstance()
                .syncExecutor(useCase,new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();

        var event = (NombreModificado) events.get(0);
        Assertions.assertEquals("domain.usuario.nombremodificado", event.type);
        Nombre nombre1 = new Nombre("Pa", "XX");
        Assertions.assertEquals(nombre1.value(), event.getNombre().value());
        Assertions.assertEquals(usuarioId.value(), event.aggregateRootId());
    }

    private List<DomainEvent> events(){
        Estado estado = new Estado(100, 180);
        Nombre nombre = new Nombre("Pa", "XX");
        Long numero = new Long (188);
        Direccion direccion = new Direccion("Kil 12",numero);
        Documento documento = new Documento("CI", 4587455);

    return List.of(new UsuarioCreado(estado, nombre, direccion, documento));
    }



}