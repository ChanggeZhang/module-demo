package com.demo.changge.two.factory.impl;

import com.demo.changge.four.factory.IFactory;
import com.demo.changge.four.modle.Person;

import java.lang.reflect.InvocationTargetException;

public class PersonFactory implements IFactory {

    @Override
    public <P extends Person> P createPerson(Class<P> personClass,Object... args) {
        try {
            if(args == null || args.length == 0) {
                return personClass.getConstructor().newInstance();
            }else{
                Class[] classes = new Class[args.length];
                for (int i = 0; i < args.length; i++) {
                    classes[i] = args[i].getClass();
                }
                return personClass.getConstructor(classes).newInstance(args);
            }
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
}
