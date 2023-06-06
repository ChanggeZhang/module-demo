module changge.three{
    exports com.demo.changge.three.modle;
    exports com.demo.changge.three.factory;
    uses com.demo.changge.four.factory.IFactory;

    requires transitive changge.four;
}