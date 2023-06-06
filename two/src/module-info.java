module changge.two {
    exports com.demo.changge.two.factory.impl;
    requires transitive changge.four;

    provides com.demo.changge.four.factory.IFactory with com.demo.changge.two.factory.impl.PersonFactory;
}