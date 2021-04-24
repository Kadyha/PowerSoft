public class ConcreteFactory extends AbstractFactory {

    @java.lang.Override
    public IBaseDatos factoryBaseDatos(TipoBaseDatos baseDatos) {

        switch (baseDatos) {
            case MongoDb:
                return new BaseMongo();
            case Oracle:
                return new BaseOracle();
            case Sql:
                return new BaseSql();
        }
        return null;
    }
}
