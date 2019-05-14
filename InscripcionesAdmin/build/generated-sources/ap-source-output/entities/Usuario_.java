package entities;

import entities.Horario;
import entities.Malla;
import entities.TipoUsuario;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-05-14T17:15:58")
@StaticMetamodel(Usuario.class)
public class Usuario_ { 

    public static volatile SingularAttribute<Usuario, String> apellidos;
    public static volatile SingularAttribute<Usuario, String> dv;
    public static volatile SingularAttribute<Usuario, String> password;
    public static volatile SingularAttribute<Usuario, TipoUsuario> tipousuario;
    public static volatile CollectionAttribute<Usuario, Horario> horarioCollection;
    public static volatile SingularAttribute<Usuario, String> correo;
    public static volatile SingularAttribute<Usuario, Integer> run;
    public static volatile SingularAttribute<Usuario, Malla> mallacodmalla;
    public static volatile SingularAttribute<Usuario, Integer> semestre;
    public static volatile SingularAttribute<Usuario, String> nombres;

}