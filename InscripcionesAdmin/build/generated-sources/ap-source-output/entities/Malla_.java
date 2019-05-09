package entities;

import entities.Carrera;
import entities.Ramo;
import entities.Usuario;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-05-09T14:18:23")
@StaticMetamodel(Malla.class)
public class Malla_ { 

    public static volatile SingularAttribute<Malla, String> nomMalla;
    public static volatile SingularAttribute<Malla, Integer> codMalla;
    public static volatile CollectionAttribute<Malla, Ramo> ramoCollection;
    public static volatile SingularAttribute<Malla, Carrera> carreracodcarrera;
    public static volatile CollectionAttribute<Malla, Usuario> usuarioCollection;

}