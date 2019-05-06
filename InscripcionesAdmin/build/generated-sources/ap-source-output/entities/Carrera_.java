package entities;

import entities.Malla;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-05-06T16:52:16")
@StaticMetamodel(Carrera.class)
public class Carrera_ { 

    public static volatile SingularAttribute<Carrera, String> nomCarrera;
    public static volatile SingularAttribute<Carrera, Integer> codCarrera;
    public static volatile CollectionAttribute<Carrera, Malla> mallaCollection;

}