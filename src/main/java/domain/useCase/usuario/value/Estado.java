package domain.useCase.usuario.value;

import co.com.sofka.domain.generic.ValueObject;
import domain.generic.dataViewerUsuario.Altura;
import domain.generic.dataViewerUsuario.Peso;

public class Estado implements ValueObject<Estado.Props> {
    private final Peso peso;
    private final Altura altura;



    public Estado(Peso peso, Altura altura) {
        this.peso = peso;
        this.altura = altura;
    }


    @Override
    public Estado.Props value() {
        return null;
    }

    public interface Props {
    }
}
