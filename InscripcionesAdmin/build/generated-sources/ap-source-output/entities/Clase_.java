package entities;

import entities.Bloque;
import entities.Horario;
import entities.Seccion;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-05-14T17:15:58")
@StaticMetamodel(Clase.class)
public class Clase_ { 

    public static volatile SingularAttribute<Clase, String> sala;
    public static volatile CollectionAttribute<Clase, Horario> horarioCollection;
    public static volatile SingularAttribute<Clase, Seccion> seccioncodseccion;
    public static volatile SingularAttribute<Clase, Bloque> bloquecodbloque;
    public static volatile SingularAttribute<Clase, String> dia;
    public static volatile SingularAttribute<Clase, Integer> codClase;

}