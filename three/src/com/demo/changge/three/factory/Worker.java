package com.demo.changge.three.factory;

import com.demo.changge.four.factory.IFactory;

import java.util.Iterator;
import java.util.ServiceLoader;

public class Worker {

    public IFactory factory(){
        ServiceLoader<IFactory> serviceLoader = ServiceLoader.load(IFactory.class);
        if(serviceLoader != null){
            Iterator<IFactory> iterator = serviceLoader.iterator();
            while (iterator.hasNext()){
                return iterator.next();
            }
        }
        return null;
    }
}
