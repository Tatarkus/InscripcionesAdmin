package entities;

import entities.Clase;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-05-09T14:18:23")
@StaticMetamodel(Bloque.class)
public class Bloque_ { 

    public static volatile SingularAttribute<Bloque, Date> horaTermino;
    public static volatile CollectionAttribute<Bloque, Clase> claseCollection;
    public static volatile SingularAttribute<Bloque, Integer> codBloque;
    public static volatile SingularAttribute<Bloque, Date> horaInicio;

}