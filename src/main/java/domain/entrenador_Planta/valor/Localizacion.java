package domain.entrenador_Planta.valor;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Localizacion implements ValueObject<Localizacion.Props> {

    private final String pais;
    private final String ciudad;
    private final String calle;

    public Localizacion(String pais, String ciudad, String calle) {
        this.pais = pais;
        this.ciudad = ciudad;
        this.calle = Objects.requireNonNull(calle);
    }

    @Override
    public Props value() {
        return new Props() {
            @Override
            public String pais() {
                return pais;
            }

            @Override
            public String ciudad() {
                return ciudad;
            }

            @Override
            public String calle() {
                return calle;
            }
        };
    }

    public interface Props {
        String pais();
        String ciudad();
        String calle();
    }
}
