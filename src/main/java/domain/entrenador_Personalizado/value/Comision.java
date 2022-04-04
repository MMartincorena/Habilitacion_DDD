package domain.entrenador_Personalizado.value;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Comision implements ValueObject<String> {
    private final int cantidadHoras;
    private final int valorHora;
    private final int porcentajeComision;

    public Comision(int cantidadHoras, int valorHora, int porcentajeComision) {
        this.cantidadHoras = Objects.requireNonNull(cantidadHoras);
        if(cantidadHoras < 0){
            throw new IllegalArgumentException("La cantidad de horas no puede ser menor a cero");
        }
        this.valorHora = Objects.requireNonNull(valorHora);
        if(valorHora <= 0){
            throw new IllegalArgumentException("El valor de cada hora no puede ser menor o igual a cero");
        }
        this.porcentajeComision = Objects.requireNonNull(porcentajeComision);
        if(porcentajeComision <= 0){
            throw new IllegalArgumentException("El % de comisión no puede ser menor o igual a cero");
        }
    }

    @Override
    public String value() {
        return null;
    }
}
