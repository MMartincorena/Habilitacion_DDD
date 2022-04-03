package domain.usuario.valor;

import co.com.sofka.domain.generic.ValueObject;

public class Direccion implements ValueObject<Direccion.Props> {

    private final String ciudad;
    private final String lugar;

    public Direccion(String ciudad, String lugar) {
        this.ciudad = ciudad;
        this.lugar = lugar;
    }


    @Override
    public Props value() {
        return new Props() {
            @Override
            public String ciudad() {
                return ciudad;
            }

            @Override
            public String lugar() {
                return lugar;
            }
        };
    }

    public interface  Props{
        String ciudad();
        String lugar();
    }
}
