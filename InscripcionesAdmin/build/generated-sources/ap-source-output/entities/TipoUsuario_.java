package entities;

import entities.Usuario;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-05-14T17:15:58")
@StaticMetamodel(TipoUsuario.class)
public class TipoUsuario_ { 

    public static volatile SingularAttribute<TipoUsuario, String> tipo;
    public static volatile SingularAttribute<TipoUsuario, Integer> codTipo;
    public static volatile CollectionAttribute<TipoUsuario, Usuario> usuarioCollection;

}