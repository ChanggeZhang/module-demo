package com.demo.changge.four.factory;


import com.demo.changge.four.modle.Person;

public interface IFactory {

    <P extends Person>P createPerson(Class<P> personClass, Object... args);
}
