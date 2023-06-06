package com.demo.changge.three.modle;

import com.demo.changge.four.modle.Person;

public class Boy extends Person {
    public Boy() {
        this.setSex("Female");
    }

    public Boy(String name,Integer age) {
        this.setSex("Female");
        this.setAge(age);
        this.setName(name);
    }
}
