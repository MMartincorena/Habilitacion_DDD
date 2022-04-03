package domain.usuario.value;

import co.com.sofka.domain.generic.ValueObject;


public class CondicionesMedicas implements ValueObject<CondicionesMedicas.Props> {
    private final Boolean hipertenso;
    private final Boolean diabetes;
    private final Boolean colesterol;

    public CondicionesMedicas(Boolean hipertenso, Boolean diabetes, Boolean colesterol) {
        this.hipertenso = hipertenso;
        this.diabetes = diabetes;
        this.colesterol = colesterol;
    }


    @Override
    public CondicionesMedicas.Props value() {
        return null;
    }

    public interface Props {
    }
}
