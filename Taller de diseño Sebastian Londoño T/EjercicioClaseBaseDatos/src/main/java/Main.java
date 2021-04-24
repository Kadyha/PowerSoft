import java.util.Random;
public class Main {

    public static void main(String[] args) throws InterruptedException {
        IBaseDatos baseDatos = null;
        ConcreteFactory concreteFactory = new ConcreteFactory();
        Random rnd = new Random();
        Integer var = 0;

        for (; ; ) {
            var =rnd.nextInt(4);
            Thread.sleep(1000);
            switch (var) {
                case 0:
                    baseDatos = concreteFactory.factoryBaseDatos(TipoBaseDatos.MongoDb);
                    break;
                case 1:
                    baseDatos = concreteFactory.factoryBaseDatos(TipoBaseDatos.Oracle);
                    break;
                case 2:
                    baseDatos = concreteFactory.factoryBaseDatos(TipoBaseDatos.Sql);
                    break;
                default:
                    System.out.println("Ninguna conexion hecha" + " ");
                    break;
            }
            baseDatos.crearBaseDatos();
        }
    }
}
