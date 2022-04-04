package domain.usuario;

import co.com.sofka.domain.generic.EventChange;
import domain.usuario.event.UsuarioCreado;

public class UsuarioChange extends EventChange {
    public UsuarioChange(Usuario usuario){

        apply((UsuarioCreado event) ->{
            usuario.estado = event.Estado();
            usuario.nombre = event.Nombre();
            usuario.direccion = event.Direccion();
            usuario.documento = event.Documento();
        });


    }
}
