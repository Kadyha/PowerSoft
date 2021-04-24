public class BaseMongo implements IBaseDatos{

    @java.lang.Override
    public void crearBaseDatos() {
        System.out.println("Creando Base de datos "+ TipoBaseDatos.MongoDb +" ");

    }
}
