package entities;

import entities.Clase;
import entities.Ramo;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-05-09T20:43:51")
@StaticMetamodel(Seccion.class)
public class Seccion_ { 

    public static volatile SingularAttribute<Seccion, String> seccion;
    public static volatile SingularAttribute<Seccion, Integer> codSeccion;
    public static volatile SingularAttribute<Seccion, Ramo> ramosigla;
    public static volatile CollectionAttribute<Seccion, Clase> claseCollection;

}