package domain.generic;

import co.com.sofka.domain.generic.Entity;
import domain.generic.ContratoId;
import domain.usuario.value.Tipo;

import java.util.Objects;

public class Contrato_Entity extends Entity<ContratoId> {
    private Tipo tipo;
    private final int valor;

    public Contrato_Entity(ContratoId contratoId, Tipo tipo, int valor) {
        super(contratoId);
        this.tipo = tipo;
        this.valor = Objects.requireNonNull(valor);
        if(valor <= 0){
            throw new IllegalArgumentException("No puede haber un valor de sueldo menor o igual a 0");
        }
    }

    public Tipo getTipo() {
        return tipo;
    }

    public int getValor() {
        return valor;
    }
}
