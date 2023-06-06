package com.demo.changge.one;

import com.demo.changge.three.factory.Worker;
import com.demo.changge.three.modle.Boy;
import com.demo.changge.three.modle.Girl;
import com.demo.changge.four.factory.IFactory;

import java.util.logging.Level;
import java.util.logging.Logger;

public class MainTest {

    private static final Logger logger = Logger.getLogger(String.valueOf(MainTest.class));

    public static void main(String[] args) {
        Worker worker = new Worker();
        IFactory iFactory = worker.factory();
        if(iFactory == null) {
            logger.log(Level.WARNING,"服务获取失败" );
            return;
        }
        Girl girl = iFactory.createPerson(Girl.class,"小猪",15);
        logger.info("Created a girl %s".formatted(girl));
        Boy boy = iFactory.createPerson(Boy.class,"小朱",15);
        logger.info("Created a boy %s".formatted(boy));
    }
}
