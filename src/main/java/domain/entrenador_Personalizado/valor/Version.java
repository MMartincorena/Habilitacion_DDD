package domain.entrenador_Personalizado.valor;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Version implements ValueObject<Version> {

    private final Version version;

    public Version(Version version) {
        this.version = Objects.requireNonNull(version);
    }

    @Override
    public Version value() {
        return null;
    }

    public Version getVersion() {
        return version;
    }
}
