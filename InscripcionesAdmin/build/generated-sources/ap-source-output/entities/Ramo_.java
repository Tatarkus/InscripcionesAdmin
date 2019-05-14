package entities;

import entities.Malla;
import entities.Seccion;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-05-14T17:15:58")
@StaticMetamodel(Ramo.class)
public class Ramo_ { 

    public static volatile SingularAttribute<Ramo, String> sigla;
    public static volatile SingularAttribute<Ramo, String> nomRamo;
    public static volatile CollectionAttribute<Ramo, Malla> mallaCollection;
    public static volatile CollectionAttribute<Ramo, Seccion> seccionCollection;

}