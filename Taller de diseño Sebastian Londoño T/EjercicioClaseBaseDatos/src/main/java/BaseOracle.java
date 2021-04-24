public class BaseOracle implements IBaseDatos {
    @java.lang.Override
    public void crearBaseDatos() {

        System.out.println("Creando base de datos " + TipoBaseDatos.Oracle + " ");
    }
}
