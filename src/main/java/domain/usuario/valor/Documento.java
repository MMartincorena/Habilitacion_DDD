package domain.usuario.valor;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;


public class Documento implements ValueObject<Documento.Props> {

    private final Long documento;
    private final String tipo;

    public Documento(Long documento, String tipo) {
        this.documento = Objects.requireNonNull(documento);
        this.tipo = tipo;
    }

    @Override
    public Props value() {
        return new Props() {
            @Override
            public Long documento() {
                return documento;
            }

            @Override
            public String tipo() {
                return tipo;
            }
        };
    }

    public interface Props{
        Long documento();
        String tipo();
    }

}
