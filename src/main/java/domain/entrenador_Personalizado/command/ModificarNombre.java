package domain.entrenador_Personalizado.command;

import co.com.sofka.domain.generic.Command;
import domain.generic.Entrenador_PersonalizadoId;
import domain.generic.Nombre;

  public class ModificarNombre extends Command {
        private final Entrenador_PersonalizadoId entrenador_personalizadoId;
        private final Nombre nombre;


      public ModificarNombre(Entrenador_PersonalizadoId entrenador_personalizadoId, Nombre nombre) {
          this.entrenador_personalizadoId = entrenador_personalizadoId;
          this.nombre = nombre;
      }

      public Entrenador_PersonalizadoId getEntrenador_personalizadoId() {
          return entrenador_personalizadoId;
      }

      public Nombre getNombre() {
          return nombre;
      }
  }
