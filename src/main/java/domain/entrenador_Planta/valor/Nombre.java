package domain.entrenador_Planta.valor;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Nombre implements ValueObject<Nombre.Props> {

    private final String nombre1;
    private final String nombre2;
    private final String apellido1;
    private final String apellido2;

    public Nombre(String nombre1, String nombre2, String apellido1, String apellido2) {
        this.nombre1 = Objects.requireNonNull(nombre1);
        this.nombre2 = nombre2;
        this.apellido1 = Objects.requireNonNull(apellido1);
        this.apellido2 = apellido2;
    }

    @Override
    public Props value() {
        return new Props() {
            @Override
            public String nombre1() {
                return nombre1;
            }

            @Override
            public String nombre2() {
                return nombre2;
            }

            @Override
            public String apellido1() {
                return apellido1;
            }

            @Override
            public String apellido2() {
                return apellido2;
            }
        };
    }

    public interface Props {
        String nombre1();
        String nombre2();
        String apellido1();
        String apellido2();
    }

}
